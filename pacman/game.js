define(["underscore", "figures/ghost", "figures/pac", "levels/level1"], function (_, Ghost, Pac, Level) {
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
            console.log(canvas);
            console.log(ctx);

            document.onkeydown = getInput;
            imgLoader = new BulkImageLoader();
            imgLoader.addImage("cherry.png", "cherry");
            imgLoader.addImage("wall.png", "wall");
            imgLoader.addImage("Bitcoin_euro.png","Bitcoin_euro");
            imgLoader.onReadyCallback = onImagesLoaded();
            imgLoader.loadImages();
//            imgLoader.im
//            imgLoader.addImage("blocks.png", "blocks");
//            imgLoader.addImage("bg.png", "bg");
//            imgLoader.addImage("over.png", "gameover");
//            imgLoader.onReadyCallback = onImagesLoaded;
//            imgLoader.loadImages();
            var level = new Level();
//            level.draw();
//            console.log(Level.map);
            ctx.clearRect(0, 0, 600, 600);
            drawBoard();
        }

        function onImagesLoaded(e)
        {
            fruitImg = imgLoader.getImageAtIndex(0);
            wallImg = imgLoader.getImageAtIndex(1);
            pointImg = imgLoader.getImageAtIndex(2)
            console.log(fruitImg);
//            gameOverImg = imgLoader.getImageAtIndex(2);
//                initGame();
        }
        function drawBoard() {
            console.log(Level.map);
            console.log(fruitImg);
//            ctx.drawImage(bgImg, 0, 0, 320, 640, 0, 0, 320, 640);
            for (var r = 0; r < ROWS; r++)
            {
                for (var c = 0; c < COLS; c++)
                {
                    if (Level.map[r][c] === 3)
                    {
                        ctx.drawImage(wallImg, c * BLOCKSIZE, r * BLOCKSIZE, BLOCKSIZE, BLOCKSIZE);
                    }
                    else if (Level.map[r][c] === 2) {
                        ctx.drawImage(fruitImg, 0, 0, BLOCKSIZE, BLOCKSIZE, c * BLOCKSIZE, r * BLOCKSIZE, BLOCKSIZE, BLOCKSIZE);
                    }
                    else if (Level.map[r][c] === 1) {
                        ctx.drawImage(pointImg, 0, 0, BLOCKSIZE+10, BLOCKSIZE+10, c * BLOCKSIZE, r * BLOCKSIZE, BLOCKSIZE, BLOCKSIZE);
                    }
                }
            }
            console.log("hier passiert dass Zeichnen");
        }

        function run() {
            isGameOver = false;
            var ghost = new Ghost("hulalala");

            //This will fail because private variable. Access via setter!
            //ghost.ins ="manipulation";
            ghost.setIns("mani");

            console.log(ghost.ins);
            ghost.myCool();


            console.log("Pacman says:");

            _.each(["hello", "world"], function (w) {
                console.log(w);
            });

        }
        ;


        function getInput(e)
        {
            if (!e) {
                var e = window.event;
            }

            e.preventDefault();
            if (isGameOver != true)
            {
                switch (e.keyCode)
                {
                    case 37:
                        {
//                            if (checkMove(curPiece.gridx - 1, curPiece.gridy, curPiece.curState))
//                                curPiece.gridx--;
                            console.log("left");
                        }
                        break;
                    case 39:
                        {
//                            if (checkMove(curPiece.gridx + 1, curPiece.gridy, curPiece.curState))
//                                curPiece.gridx++;
                            console.log("right");
                        }
                        break;
                    case 38:
                        {
                            console.log("up");
                        }
                        break;
                    case 40:
                        {
//                            if (checkMove(curPiece.gridx, curPiece.gridy + 1, curPiece.curState))
//                                curPiece.gridy++;
                            console.log("down");
                        }
                        break;
                }
            }
        }


        function demoValue() {
            return 123;
        }
        ;

        return {
            init: init,
            run: run,
            demoValue: demoValue
        }
    };

    return Game;

});
