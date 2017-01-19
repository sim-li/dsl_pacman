define(["underscore", "jquery", "figures/ghost", "figures/pac", "levels/level1"], function (_, $, Ghost, Pac, level) {
    // Demonstrates pattern for creating class that can be instantiated with `new`.
    // Prototype has to be returned by module.

    var Game = function () {
        var BLOCKSIZE = 30;
        var ROWS = 20;
        var COLS = 20;
        var canvas = document.getElementById('canvas');
        canvas.setAttribute("width", (BLOCKSIZE * COLS) + "px");
        canvas.setAttribute("height", (BLOCKSIZE * ROWS) + "px");

        var ctx = canvas.getContext('2d');
        var imgLoader;
        var isGameOver = false;
        var fruitImg;
        var wallImg;
        var pointImg;

        function init() {
            $('#text').click(function () {
                console.log("Got click");
                $('#canvas-overlay').fadeOut('fast');
                run();
            });
            document.onkeydown = getInput;
            imgLoader = new BulkImageLoader();
            imgLoader.addImage("cherry.png", "cherry");
            imgLoader.addImage("wall.png", "wall");
            imgLoader.addImage("Bitcoin.png","Bitcoin");
            imgLoader.onReadyCallback = onImagesLoaded;
            imgLoader.loadImages();
            ctx.clearRect(0, 0, 600, 600);
        }

        function onImagesLoaded() {
            fruitImg = imgLoader.getImageAtIndex(0);
            wallImg = imgLoader.getImageAtIndex(1);
            pointImg = imgLoader.getImageAtIndex(2);
            drawBoard();
            //setInterval(function(){ alert("Hello"); }, 3000);
        }

        function drawBoard() {
            for (var r = 0; r < ROWS; r++) {
                for (var c = 0; c < COLS; c++) {
                    if (level.map[r][c] === 3) {
                        ctx.drawImage(wallImg, c * BLOCKSIZE, r * BLOCKSIZE, BLOCKSIZE, BLOCKSIZE);
                    }
                    else if (level.map[r][c] === 2) {
                        ctx.drawImage(fruitImg, 0, 0, BLOCKSIZE, BLOCKSIZE, c * BLOCKSIZE, r * BLOCKSIZE, BLOCKSIZE, BLOCKSIZE);
                    }
                    else if (level.map[r][c] === 1) {
                        ctx.drawImage(pointImg, 0, 0, BLOCKSIZE, BLOCKSIZE, c * BLOCKSIZE+7.5, r * BLOCKSIZE+7.5, BLOCKSIZE/2, BLOCKSIZE/2);
                    }
                }
            }
        }

        function run() {
            isGameOver = false;
            console.log("Got run");
        };


        function getInput(e) {
            if (!e) {
                var e = window.event;
            }

            e.preventDefault();
            if (isGameOver != true) {
                switch (e.keyCode) {
                    case 37:
//                            if (checkMove(curPiece.gridx - 1, curPiece.gridy, curPiece.curState))
//                                curPiece.gridx--;
                            console.log("left");
                        break;
                    case 39:
//                            if (checkMove(curPiece.gridx + 1, curPiece.gridy, curPiece.curState))
//                                curPiece.gridx++;
                            console.log("right");
                        break;
                    case 38:
                            console.log("up");
                        break;
                    case 40:
//                            if (checkMove(curPiece.gridx, curPiece.gridy + 1, curPiece.curState))
//                                curPiece.gridy++;
                            console.log("down");
                        break;
                }
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
