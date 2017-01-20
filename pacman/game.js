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
                var ghost1;
                var ghost2;
                var ghost3;
                var ghost4;
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
                        ghost1: "images/ghost1.jpg",
                        ghost2: "images/ghost2.jpg",
                        ghost3: "images/ghost3.jpg",
                        ghost4: "images/ghost4.jpg",
                        pac: "images/pac.png"
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
                    var ghost1Img = imgLoader.getImageAtIndex(3);
                    var ghost2Img = imgLoader.getImageAtIndex(4);
                    var ghost3Img = imgLoader.getImageAtIndex(5);
                    var ghost4Img = imgLoader.getImageAtIndex(6);
                    var pacImg = imgLoader.getImageAtIndex(7);
                    gameBoard = new GameBoard(ctxGameboard, {wall: wallImg, point: pointImg, fruit: cherryImg});
                    gameBoard.drawBoard();
                    pac = new Pac(ctxPac, {pac: pacImg}, gameBoard);
                    ghost1 = new Ghost(ctxPac, {ghost: ghost1Img}, gameBoard);
                    ghost2 = new Ghost(ctxPac, {ghost: ghost2Img}, gameBoard);
                    ghost3 = new Ghost(ctxPac, {ghost: ghost3Img}, gameBoard);
                    ghost4 = new Ghost(ctxPac, {ghost: ghost4Img}, gameBoard);
                    gameBoard.registerFigures(pac, ghost1, ghost2, ghost3, ghost4);

                }

                function updateOnInterval() {
                    if (isGameOver == false) {
                        if (pac.next_move(next_direction)) {
                            direction = next_direction;
                        }
                        pac.move(direction);
                        getField();
                        pac.draw();
                        ghost1.move();
                        ghost1.draw();
                        ghost2.move();
                        ghost2.draw();
                        ghost3.move();
                        ghost3.draw();
                        ghost4.move();
                        ghost4.draw();
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
                    if (pac.gridX() == ghost1.gridX() && pac.gridY() == ghost1.gridY()) {
                        if (pac.isHungry()) {
                            console.log("Hallo Geist");
                            ghost1.eaten();
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
