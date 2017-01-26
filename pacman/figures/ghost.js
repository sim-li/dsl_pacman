define(["underscore", "constants", "strategies/random"], function (_, constants, randomStrategy) {
    var Ghost = function (ctx, gridX, gridY, images, gameBoard) {
        var gridX = gridX;
        var gridY = gridY;
        var gridX_initial = gridX;
        var gridY_initial = gridY;
        var BLOCK_SIZE = constants.BLOCK_SIZE;
        var timer;
        var currentDirection = "up";
        var curImage = "ghost";
        var strategy = randomStrategy;
        var ghostQueries;
        var wait = false;

        function setGhostQueries(gQ) {
            ghostQueries = gQ;
        }

        function move() {
            if (!wait) {
                var nextCoordinate = {
                    up: [gridX, gridY - 1],
                    down: [gridX, gridY + 1],
                    left: [gridX - 1, gridY],
                    right: [gridX + 1, gridY]
                };
                currentDirection = strategy(ghostQueries);
                moveTo(nextCoordinate[currentDirection]);
            }

            draw();
        }

        function positionOfPacAsDirection() {
            var pacPosition = gameBoard.getPacPosition();
            var x = pacPosition[0];
            var y = pacPosition[1];
            var diffX = x - gridX;
            var diffY = y - gridY;
            var directionX = diffX >= 0 ? "right" : "left";
            var directionY = diffY >= 0 ? "down" : "up";
            var finalDirection;
            if (diffX == 0) {
                finalDirection = directionY;
            } else if (diffY == 0) {
                finalDirection = directionX;
            } else if (Math.abs(diffX) < Math.abs(diffY)) {
                finalDirection = directionX;
            } else {
                finalDirection = directionY;
            }
            return finalDirection;
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
            ctx.drawImage(images[curImage], 0, 0, BLOCK_SIZE, BLOCK_SIZE, gridX * BLOCK_SIZE, gridY * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        }

        function isVulnerable() {
            curImage = "ghostVul";
            timer = setTimeout(function () {
                curImage = "ghost";
            }, 7000);
        }

        function stopTimer() {
            clearTimeout(timer);
        }

        function getGridX() {
            return gridX;
        }

        function getGridY() {
            return gridY;
        }

        function eaten() {
            wait = true;
            gridX = gridX_initial;
            gridY = gridY_initial;
            currentDirection = "up";
            setTimeout(function () {
                wait = false;
                currentDirection = "up";
            }, 7000);
        }

        function getCurrentDirection() {
            return currentDirection;
        }

        return {
            type: "ghost",
            draw: draw,
            gridX: getGridX,
            gridY: getGridY,
            move: move,
            eaten: eaten,
            isVulnerable: isVulnerable,
            stopTimer: stopTimer,
            resetPos: resetPos,
            checkMove: checkMove,
            setGhostQueries: setGhostQueries,
            currentDirection: getCurrentDirection,
            positionOfPacAsDirection: positionOfPacAsDirection
        };
    };

    return Ghost;
});
