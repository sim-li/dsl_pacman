define(["underscore", "jquery", "figures/ghost", "figures/pac", "levels/level1", "constants", "gameboard"],
        function (_, $, Ghost, Pac, level, constants, GameBoard) {

            var Game = function () {
                var BLOCK_SIZE = constants.BLOCK_SIZE;
                var ROWS = constants.ROWS;
                var COLS = constants.COLS;
                var isGameOver = false;
                // Canvases
                var canvasGameboard = document.getElementById('canvas');
                var canvasPac = document.getElementById('canvas2');
                canvasGameboard.setAttribute("width", (BLOCK_SIZE * COLS) + "px");
                canvasGameboard.setAttribute("height", (BLOCK_SIZE * ROWS) + "px");
                canvasPac.setAttribute("width", (BLOCK_SIZE * COLS) + "px");
                canvasPac.setAttribute("height", (BLOCK_SIZE * ROWS) + "px");
                var ctxGameboard = canvasGameboard.getContext('2d');
                var ctxPac = canvasPac.getContext('2d');
                var imgLoader;
                var gameBoard;
                var pac;
                var ghost;
                var cur_point;
                var cur_life;
                var buttonPressed = false;
                var direction;
                var next_direction;
                function init() {
                    $('#text').click(function () {
                        $('#canvas-overlay').fadeOut('fast');
                        run();
                    });
                    setPoint("init");
                    document.onkeydown = getInput;
                    ctxGameboard.clearRect(0, 0, 600, 600);
                    loadImages();
                }

                function loadImages() {
                    loadMultipleImages({
                        cherry: "cherry.png",
                        wall: "wall.png",
                        bitcoin: "bitcoin.png",
                        ghost: "images/ghost.png"
                    });
                }

                function loadMultipleImages(images) {
                    imgLoader = new BulkImageLoader();
                    _.each(_.pairs(images), function (img) {
                        imgLoader.addImage(img[1], img[0]);
                    });
                    imgLoader.onReadyCallback = onImagesLoaded;
                    imgLoader.loadImages();
                }

                function onImagesLoaded() {
                    var cherryImg = imgLoader.getImageAtIndex(0);
                    var wallImg = imgLoader.getImageAtIndex(1);
                    var pointImg = imgLoader.getImageAtIndex(2);
                    var ghostImg = imgLoader.getImageAtIndex(3);
                    gameBoard = new GameBoard(ctxGameboard, {wall: wallImg, point: pointImg, fruit: cherryImg});
                    gameBoard.drawBoard();
                    pac = new Pac(ctxPac, {pac: wallImg}, gameBoard);
                    ghost = new Ghost(ctxPac, {ghost: ghostImg}, gameBoard);
                    gameBoard.registerFigures(pac, ghost);

                }

                function updateOnInterval() {
                    if (isGameOver == false) {
                        if (pac.next_move(next_direction)) {
                            direction = next_direction;
                        }
                        pac.move(direction);
                        getField();
                        pac.draw();
                        ghost.move();
                        ghost.draw();
                    }
                    else {
                        $('#canvas-overlay').fadeIn('fast');
                        
                    }

                }

                function run() {
                    setInterval(updateOnInterval, 100);
                    isGameOver = false;
                    console.log("Got run");
                }

                function getDirectionFromKeyEvent(e) {
                    e.preventDefault();
                    var mapping = {
                        37: "LEFT",
                        38: "UP",
                        39: "RIGHT",
                        40: "DOWN"
                    }
                    buttonPressed = true;
                    return mapping[e.keyCode]
                }

                function getInput(e) {
                    next_direction = getDirectionFromKeyEvent(e);
                }

                function getField() {
                    var level = gameBoard.getLevel();
                    var index = level.map[pac.gridY()][pac.gridX()];
                    if (index == 1 || index == 2) {
                        //
                        level.map[pac.gridY()][pac.gridX()] = 0;
                        gameBoard.drawBoard();
                        if (index == 1) {
                            setPoint("point");
                        } else {
                            setPoint("fruit");
                            pac.hungry();
                        }
                    }
                    if (pac.gridX() == ghost.gridX() && pac.gridY() == ghost.gridY()) {
                        if (pac.isHungry()) {
                            console.log("Hallo Geist");
                            ghost.eaten();
                            setPoint("ghost");
                        }
                        else {
                            console.log("Hilfe Geist");
                            pac.gotKilled();
                            setPoint("killed");

                        }
                    }
                }
                ;

                function setPoint(condition) {
                    switch (condition) {
                        case "init":
                            cur_point = 0;
                            cur_life = 3;
                            break;
                        case "point":
                            cur_point = cur_point + 10;
                            break;
                        case "fruit":
                            cur_point = cur_point + 100;
                            break;
                        case "ghost":
                            cur_point = cur_point + 200;
                        case "killed":
                            cur_life = cur_life - 1;
                            if (cur_life == 0)
                                isGameOver = true;
                            break;
                        default:
                            console.log("falsche Punkte vergabe");
                    }
                    $('#points').html(cur_point);
                    $('#lifes').html(cur_life);
                }


                return {
                    init: init,
                    run: run
                }
            };
            return Game;
        });
