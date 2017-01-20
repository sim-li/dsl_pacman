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
            _.each(_.pairs(images), function(img) {
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

            gameBoard = new GameBoard(ctxGameboard, { wall: wallImg, point: pointImg, fruit: cherryImg });
            gameBoard.drawBoard();

            pac = new Pac(ctxPac, { pac: wallImg }, gameBoard);
            ghost = new Ghost(ctxPac, { ghost: ghostImg }, gameBoard);

            gameBoard.registerFigures(pac, ghost);

            setInterval(updateOnInterval, 25);
        }

        function updateOnInterval() {
            pac.draw();
            ghost.move();
            ghost.draw();

        }

        function run() {
            isGameOver = false;
            setPoint("fruit");
        }

        function getInput(e) {
            var direction = getDirectionFromKeyEvent(e);
            if (isGameOver != true) {
                pac.move(direction);
                getField();
            }
        }

        function getDirectionFromKeyEvent(e) {
            e.preventDefault();
            var mapping = {
                37: "LEFT",
                38: "UP",
                39: "RIGHT",
                40: "DOWN"
            }
            return mapping[e.keyCode]

        }

        function getField() {
            var level = gameBoard.getLevel();
            var index = level.map[pac.getGridY()][pac.getGridX()];
            if (index == 1 || index == 2) {
                level.map[pac.getGridY()][pac.getGridX()] = 0;
                gameBoard.drawBoard();
                if (index == 1) {
                    setPoint("point");
                } else {
                    setPoint("fruit");
                }

                function loadImages() {
                    imgLoader = new BulkImageLoader();
                    imgLoader.addImage("cherry.png", "cherry");
                    imgLoader.addImage("wall.png", "wall");
                    imgLoader.addImage("Bitcoin.png", "Bitcoin");
                    imgLoader.onReadyCallback = onImagesLoaded;
                    imgLoader.loadImages();
                }

                function onImagesLoaded() {
                    fruitImg = imgLoader.getImageAtIndex(0);
                    wallImg = imgLoader.getImageAtIndex(1);
                    pointImg = imgLoader.getImageAtIndex(2);

                    gameBoard = new GameBoard(ctxGameboard, {wall: wallImg, point: pointImg, fruit: fruitImg});
                    gameBoard.drawBoard();

                    pac = new Pac(ctxPac, {pac: wallImg}, gameBoard);
                    ghost = new Ghost(ctxPac, {ghost: wallImg}, gameBoard);

                    //pac.draw();

                    setInterval(updateOnInterval, 100);
                }

                function updateOnInterval() {
                    if (pac.next_move(next_direction)) {
                        direction = next_direction;
                    }
                    pac.move(direction);
                    ghost1.move(random_direction);
                    getField();
                    pac.draw();
                    ghost.draw();
                }

                function run() {
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
                    var index = level.map[pac.getGridY()][pac.getGridX()];
                    if (index == 1 || index == 2) {
                        //
                        level.map[pac.getGridY()][pac.getGridX()] = 0;
                        gameBoard.drawBoard();
                        if (index == 1) {
                            setPoint("point");
                        } else {
                            setPoint("fruit");
                        }
                    }
                }
                ;


                function setPoint(condition) {
                    switch (condition) {
                        case "init":
                            cur_point = 0;
                            break;
                        case "point":
                            cur_point = cur_point + 10;
                            break;
                        case "fruit":
                            cur_point = cur_point + 100;
                            break;
                        case "ghost":
                            cur_point = cur_point + 200;
                            break;
                        default:
                            console.log("falsche Punkte vergabe");
                    }
                    $('#points').html(cur_point);
                }


                return {
                    init: init,
                    run: run
                }
            };

            return Game;
        });
