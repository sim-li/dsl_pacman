define(["underscore", "constants"], function (_, constants) {
    var Pac = function (ctx, images, gameBoard) {
        var gridX = 10;
        var gridY = 10;
        var gridX_initial = gridX;
        var gridY_initial = gridY;
        var BLOCK_SIZE = constants.BLOCK_SIZE;
        var isHungry = false;
        lifecount = 3;
        var curImage = "pac";
        var timer = 0;

        function move(direction) {
            switch (direction) {
                case "LEFT":
                    if (gameBoard.checkMove(gridX - 1, gridY)) {
                        gridX--;
                    }
                    break;
                case "RIGHT":
                    if (gameBoard.checkMove(gridX + 1, gridY)) {
                        gridX++;
                    }
                    break;
                case "UP":
                    if (gameBoard.checkMove(gridX, gridY - 1)) {
                        gridY--;
                    }
                    break;
                case "DOWN":
                    if (gameBoard.checkMove(gridX, gridY + 1)) {
                        gridY++;
                    }
                    break;
            }
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
            setTimeout(function () {
                isHungry = false;
            }, 7000);
        }
        ;

        function gotKilled() {


            
        }

        function draw() {
            ctx.clearRect(0, 0, 600, 600);

            ctx.drawImage(
                    images[curImage], 0, 0, BLOCK_SIZE, BLOCK_SIZE, gridX * BLOCK_SIZE, gridY * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE
                    );
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
            gotKilled: gotKilled,
            resetPos: resetPos
        };
    };

    return Pac;
});
