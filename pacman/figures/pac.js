define(["underscore", "constants"], function (_, constants) {
    var Pac = function (ctx, gridX, gridY, images, gameBoard) {
        var gridX = gridX;
        var gridY = gridY;
        var gridX_initial = gridX;
        var gridY_initial = gridY;
        var BLOCK_SIZE = constants.BLOCK_SIZE;
        var isHungry = false;
        var timer_hungry;
        var curImage = "pac";
        var timer = 0;
        var degree = 0;
        var mirror = false;

        function move(direction) {
            switch (direction) {
                case "LEFT":
                    if (gameBoard.checkMove(gridX - 1, gridY)) {
                        gridX--;
                        degree = 180;
                        mirror = true;

                    }
                    break;
                case "RIGHT":
                    if (gameBoard.checkMove(gridX + 1, gridY)) {
                        gridX++;
                        degree = 0;
                        mirror = false;
                    }
                    break;
                case "UP":
                    if (gameBoard.checkMove(gridX, gridY - 1)) {
                        gridY--;
                        degree = 270;
                    }
                    break;
                case "DOWN":
                    if (gameBoard.checkMove(gridX, gridY + 1)) {
                        gridY++;
                        degree = 90;
                    }
                    break;
            }
            draw();
        }
        
        function resetPos(){
            gridX = gridX_initial;
            gridY = gridY_initial;
        }

        function next_move(next_direction) {
            switch (next_direction) {
                case "LEFT":
                    if (gameBoard.checkMove(gridX - 1, gridY)) {
                        return true;
                    }
                    break;
                case "RIGHT":
                    if (gameBoard.checkMove(gridX + 1, gridY)) {
                        return true;
                    }
                    break;
                case "UP":
                    if (gameBoard.checkMove(gridX, gridY - 1)) {
                        return true;
                    }
                    break;
                case "DOWN":
                    if (gameBoard.checkMove(gridX, gridY + 1)) {
                        return true;
                    }
                    break;
            }
        }

        function getGridX() {
            return gridX;
        }

        function getGridY() {
            return gridY;
        }

        function getIsHungry() {
            return isHungry;
        }

        function hungry() {
            isHungry = true;
            timer_hungry = setTimeout(function () {
                isHungry = false;
            }, 7000);
        }
        function stopTimer(){
            clearTimeout(timer_hungry);
        }

        function gotKilled() {
            // TODO: To be implemented, remove if unnecessary
        }

        function rotate() {
            ctx.save();
            ctx.translate((gridX * BLOCK_SIZE+15), (gridY * BLOCK_SIZE+15));
            ctx.rotate(degree*Math.PI/180);
            if (mirror == true) {
                ctx.scale(1, -1);
            }
            ctx.translate(-((gridX * BLOCK_SIZE)+15), -((gridY * BLOCK_SIZE)+15));
            ctx.drawImage(
                images[curImage], 0, 0, BLOCK_SIZE, BLOCK_SIZE, gridX * BLOCK_SIZE, gridY * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE
            );
            ctx.restore();
        }

        function draw() {
            ctx.clearRect(0, 0, 600, 600);
            rotate();
            changeImage();
        }

        function changeImage() {
            timer = timer + 1;
            if(timer == 2) {
                timer = 0;
                if (curImage == "pac") {
                    curImage = "pac2"
                } else {
                    curImage = "pac"
                }
            }
        }

        return {
            type: "pac",
            draw: draw,
            move: move,
            next_move: next_move,
            gridX: getGridX,
            gridY: getGridY,
            hungry: hungry,
            isHungry: getIsHungry,
            stopTimer: stopTimer,
            gotKilled: gotKilled,
            resetPos: resetPos
        };
    };

    return Pac;
});
