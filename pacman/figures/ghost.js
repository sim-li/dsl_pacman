define(["underscore", "constants"], function (_, constants) {
    var Ghost = function (ctx, gridX, gridY, images, gameBoard) {
        var gridX = gridX;
        var gridY = gridY;
        var gridX_initial = gridX;
        var gridY_initial = gridY;
        var BLOCK_SIZE = constants.BLOCK_SIZE;
        var currentDirection = "up";

        function move() {
            var randomWalkStrategy = {
                up: [
                    "up",
                    "left",
                    "right",
                    "down"
                ],
                down: [
                    "down",
                    "left",
                    "right",
                    "up"
                ],
                left: [
                    "left",
                    "up",
                    "down",
                    "right"

                ],
                right: [
                    "right",
                    "up",
                    "down",
                    "left"
                ]
            };

            var bunchOfMoves = randomWalkStrategy[currentDirection];
            var nextCoordinate = {
                up: [gridX, gridY - 1],
                down: [gridX, gridY + 1],
                left: [gridX - 1, gridY],
                right: [gridX + 1, gridY]
            };
            var freeMoves = _.filter(bunchOfMoves, function (m) {
                return checkMove(nextCoordinate[m]);
            });
            var currentDirectionFree = _.contains(freeMoves, currentDirection);
            var oppositeDirection = _.last(bunchOfMoves);
            var tryOtherDirection = Math.random() >= 0.8;
            if (currentDirectionFree) {
                var fleeDirections = _.without(freeMoves, currentDirection, oppositeDirection);
                if (tryOtherDirection && fleeDirections.length > 0) {
                    currentDirection = _.sample(fleeDirections);
                }
            } else {
                currentDirection = _.without(freeMoves, currentDirection)[0];
            }
            if (!_.isUndefined(currentDirection)) {
                moveTo(nextCoordinate[currentDirection]);
            }
            draw();
        }

        function moveTo(coordTuple) {
            gridX = coordTuple[0];
            gridY = coordTuple[1];
        }

        function checkMove(p) {
            return gameBoard.checkMove(p[0], p[1]);
        }

        function resetPos() {
            gridX = gridX_initial;
            gridY = gridY_initial;
        }

        function draw() {
            ctx.drawImage(images.ghost, 0, 0, BLOCK_SIZE, BLOCK_SIZE, gridX * BLOCK_SIZE, gridY * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);

        }


        function getGridX() {
            return gridX;
        }

        function getGridY() {
            return gridY;
        }

        function eaten() {
            gridX = -10;
            gridY = -10;
            setTimeout(function () {
                gridX = 10;
                gridY = 10;
            }, 10000);
        }


        return {
            type: "ghost",
            draw: draw,
            gridX: getGridX,
            gridY: getGridY,
            move: move,
            eaten: eaten,
            resetPos:resetPos
        };
    };

    return Ghost;
});
