define(["underscore", "jquery", "figures/ghost", "figures/pac", "levels/level1"], function (_, $, Ghost, Pac, level) {
    // Demonstrates pattern for creating class that can be instantiated with `new`.
    // Prototype has to be returned by module.

    var Game = function () {
        var BLOCKSIZE = 30;
        var ROWS = 20;
        var COLS = 20;
        var canvas = document.getElementById('canvas');
        var canvas_pac = document.getElementById('canvas2');
        canvas.setAttribute("width", (BLOCKSIZE * COLS) + "px");
        canvas.setAttribute("height", (BLOCKSIZE * ROWS) + "px");
        canvas_pac.setAttribute("width", (BLOCKSIZE * COLS) + "px");
        canvas_pac.setAttribute("height", (BLOCKSIZE * ROWS) + "px");


        var ctx = canvas.getContext('2d');
        var ctx_pac = canvas_pac.getContext('2d');
        var imgLoader;
        var isGameOver = false;
        var fruitImg;
        var wallImg;
        var pointImg;

        var gridx = 10;
        var gridy = 10;
        

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
            imgLoader.addImage("Bitcoin.png", "Bitcoin");
            imgLoader.onReadyCallback = onImagesLoaded;
            imgLoader.loadImages();
            ctx.clearRect(0, 0, 600, 600);
        }

        function onImagesLoaded() {
            fruitImg = imgLoader.getImageAtIndex(0);
            wallImg = imgLoader.getImageAtIndex(1);
            pointImg = imgLoader.getImageAtIndex(2);
            drawBoard();
            drawPac();
//            var i = 0;
            setInterval(function () {
              

                ctx_pac.clearRect(0, 0, 600, 600);
                drawPac();

            }, 25);
        }

        //zeichnet den spielstein
        function drawPac()
        {
            var drawX = gridx;
            var drawY = gridy;
            var alive = 1;
            var hungry = 2;
            var dead = 3;
            var state = alive;
            
            ctx_pac.drawImage(wallImg, 0, 0, BLOCKSIZE, BLOCKSIZE, drawX * BLOCKSIZE, drawY * BLOCKSIZE, BLOCKSIZE, BLOCKSIZE);
        }
//funktion Ã¼berprÃ¼ft mÃ¶gliche bewegeung nach links, recht und unten
        function checkMove(xpos, ypos)
        {
            var result = true;
            var newx = xpos;
            var newy = ypos;

            if (newx < 0 || newx >= COLS)
            {
                result = false;
            }

            if (level.map[newy] != undefined && level.map[newy][newx] != 0)
            {
                result = false;
            }
            
            

            if (newy < 0 || newy > ROWS)
            {
                result = false;
            }

            return result;
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
                        ctx.drawImage(pointImg, 0, 0, BLOCKSIZE, BLOCKSIZE, c * BLOCKSIZE + 7.5, r * BLOCKSIZE + 7.5, BLOCKSIZE / 2, BLOCKSIZE / 2);
                    }
                }
            }
        }

        function run() {
            isGameOver = false;
            console.log("Got run");
        }
        ;


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
                          e.preventDefault();
                    if (checkMove(gridx - 1, gridy))
                        gridx--;
                       
                        break;
                    case 39:
//                            if (checkMove(curPiece.gridx + 1, curPiece.gridy, curPiece.curState))
//                                curPiece.gridx++;
                        console.log("right");
                        if (checkMove(gridx + 1, gridy))
                        gridx++;
                        
                        break;
                    case 38:
                        console.log("up");
                        if (checkMove(gridx, gridy - 1))
                        gridy--;
                        
                        break;
                    case 40:
                           if (checkMove(gridx, gridy + 1))
                        gridy++;
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
