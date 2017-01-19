define(["underscore", "jquery", "figures/ghost", "figures/pac", "levels/level1", "constants", "gameboard"],
    function (_, $, Ghost, Pac, level, constants, GameBoard) {
    // Demonstrates pattern for creating class that can be instantiated with `new`.
    // Prototype has to be returned by module.

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


        function init() {
            $('#text').click(function () {
                $('#canvas-overlay').fadeOut('fast');
                run();
            });

            document.onkeydown = getInput;
            ctxGameboard.clearRect(0, 0, 600, 600);

            loadImages();

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

            gameBoard = new GameBoard(ctxGameboard, { wall: wallImg, point: pointImg, fruit: fruitImg });
            gameBoard.drawBoard();

            pac = new Pac(ctxPac, { pac: wallImg }, gameBoard);
            pac.drawPac();

            setInterval(updateOnInterval, 25);
        }


        function updateOnInterval() {
            pac.drawPac();
        }


        function run() {
            isGameOver = false;
            console.log("Got run");
        };

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

        function getInput(e) {
            var direction = getDirectionFromKeyEvent(e);
            if (isGameOver != true) {
                pac.move(direction);
            }
        }


        function demoValue() {
            return 123;
        }

        return {
            init: init,
            run: run,
            demoValue: demoValue
        }
    };

    return Game;
});
