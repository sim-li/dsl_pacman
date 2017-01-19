define(["underscore", "jquery", "constants", "levels/level1"], function (_, $, constants, level) {
    var GameBoard = function (ctx, images) {
        var BLOCK_SIZE = constants.BLOCK_SIZE;
        var ROWS = constants.ROWS;
        var COLS = constants.COLS;

        function checkMove(xPos, yPos) {
            var exceedsLevelHorizontally = xPos < 0 || xPos >= COLS;
            var exceedsLevelVertically = yPos < 0 || yPos > ROWS;
            var WALL = 3;
            var fieldIsBlocked = level.map[yPos] == undefined || level.map[yPos][xPos] == WALL;
            return !(fieldIsBlocked || exceedsLevelHorizontally || exceedsLevelVertically);
        }

        function drawBoard() {
            ctx.clearRect(0, 0, 600, 600);
            for (var r = 0; r < ROWS; r++) {
                for (var c = 0; c < COLS; c++) {
                    if (level.map[r][c] === 3) {
                        ctx.drawImage(images.wall, c * BLOCK_SIZE, r * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
                    }
                    else if (level.map[r][c] === 2) {
                        ctx.drawImage(images.fruit, 0, 0, BLOCK_SIZE, BLOCK_SIZE, c * BLOCK_SIZE, r * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
                    }
                    else if (level.map[r][c] === 1) {
                        ctx.drawImage(images.point, 0, 0, BLOCK_SIZE, BLOCK_SIZE, c * BLOCK_SIZE + 7.5, r * BLOCK_SIZE + 7.5, BLOCK_SIZE / 2, BLOCK_SIZE / 2);
                    }
                }
            }
        }

        function getLevel() {
            return level;
        }

        return {
            checkMove: checkMove,
            drawBoard: drawBoard,
            getLevel: getLevel
        }
    };

    return GameBoard;
});