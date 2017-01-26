define(["underscore"], function (_) {
    var GhostQueries = function(ghost) {

        function currentDirection() {
            return ghost.currentDirection;
        }

        function positionOfPacAsDirections() {
            return ghost.positionOfPacAsDirections();
        }

        function isFree(direction) {
            var nextCoordinate = {
                up: [ghost.gridX, ghost.gridY - 1],
                down: [ghost.gridX, ghost.gridY + 1],
                left: [ghost.gridX - 1, ghost.gridY],
                right: [ghost.gridX + 1, ghost.gridY]
            };
            return ghost.checkMove(nextCoordinate[direction]);
        }

        function random(directions) {
            return _.sample(_.flatten(directions));
        }

        function randomWithDistribution(ratios, directions) {
            var sampler = [];
            _.each(_.zip(ratios, _.flatten(directions)), function(el) {
                for (var i = 0, multiplicand = parseInt(el[0]); i < multiplicand; i++) {
                    var direction = el[1];
                    sampler.push(direction);
                }
            });
            return random(_.shuffle(sampler));
        }

        function filterFree(directions) {
            return _.filter(_.flatten(directions), function(d) {
                return isFree(d);
            });
        }

        function filterFreeN(directions, n) {
            var free = filterFree(directions);
            if(n > free.length - 1) {
                return;
            }
            //TODO: What happens, when undefined is returned? Return default dir?
            return free[n];

        }

        function opposite(direction) {
            var opposites = {
                "up": "down",
                "down": "up",
                "left": "right",
                "right": "left"
            };
            return opposites[direction];
        }

        function alternative(direction) {
            var alternatives = {
                "up": "left",
                "down": "right",
                "left": "up",
                "right": "down"
            };
            return alternatives[direction];
        }

        function alternativeOpposite(direction) {
            var alternativeOpposites = {
                "up": "right",
                "down": "left",
                "left": "down",
                "right": "up"
            };
            return alternativeOpposites[direction];
        }

        return {
            currentDirection: currentDirection,
            positionOfPacAsDirections: positionOfPacAsDirections,
            isFree: isFree,
            random: random,
            randomWithDistribution: randomWithDistribution,
            filterFree: filterFree,
            filterFreeN: filterFreeN,
            opposite: opposite,
            alternative: alternative,
            alternativeOpposite: alternativeOpposite
        }
    };

    return GhostQueries;
});