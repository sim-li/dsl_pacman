define(["underscore"], function (_) {
    var GhostQueries = function(ghost) {

        function currentDirection() {
            return ghost.currentDirection();
        }

        function debugUndefined(d, meth) {
            if (d == undefined) {
                console.log(meth + " got undefined");
            }
        }

        function positionOfPacAsDirection() {
            var d = ghost.positionOfPacAsDirection();
            debugUndefined(d, "positionOfPacAsDirection");
            return ghost.positionOfPacAsDirection();
        }

        function isFree(direction) {
            var nextCoordinate = {
                up: [ghost.gridX(), ghost.gridY() - 1],
                down: [ghost.gridX(), ghost.gridY() + 1],
                left: [ghost.gridX() - 1, ghost.gridY()],
                right: [ghost.gridX() + 1, ghost.gridY()]
            };
            var d = ghost.checkMove(nextCoordinate[direction]);
            debugUndefined(d, "isFree");
            return ghost.checkMove(nextCoordinate[direction]);
        }

        function random(directions) {
            var d = _.sample(_.flatten(directions));
            if (d === undefined) {
                console.log("Directions", directions);
                console.log("Flatten directions", _.flatten(directions) );
                console.log("Sample flatten directions", d);
            }
            debugUndefined(d, "random");
            return d;
        }

        function randomWithDistribution(ratios, directions) {
            ratios = flattenRandoms(ratios, _.flatten(directions));
            var sampler = [];
            _.each(_.zip(ratios, _.flatten(directions)), function(el) {
                for (var i = 0, multiplicand = parseInt(el[0]); i < multiplicand; i++) {
                    var direction = el[1];
                    sampler.push(direction);
                }
            });
            var d = random(_.shuffle(sampler));
            debugUndefined(d, "randomWithDistribution");
            return random(_.shuffle(sampler));
        }

        function flattenRandoms(ratios, directions) {
            if (ratios.length === directions.length) {
                return ratios;
            }
            var maxLen = directions.length;
            var endingRatios = []
            for (var i = 0; i < maxLen - 1; i++) {
                endingRatios.push(ratios[i]);
                ratios.splice(i, 1);
            }
            var sumOfRest = _.reduce(ratios, function(memo, num){ return memo + num; }, 0);
            return endingRatios.concat(sumOfRest);
        }

        function filterFree(directions) {
            var d = _.filter(_.flatten(directions), function(d) {
                return isFree(d);
            });
            debugUndefined(d, "filterFree");
            return _.filter(_.flatten(directions), function(d) {
                return isFree(d);
            });
        }

        function filterFreeN(nOff, directions) {
            var n = nOff - 1;
            var free = filterFree(directions);
            if(n > free.length - 1) {
                return;
            }
            //TODO: What happens, when undefined is returned? Return default dir?
            var d = free[n];
            debugUndefined(d, "filterFreeN");
            return free[n];

        }

        function opposite(direction) {
            var opposites = {
                "up": "down",
                "down": "up",
                "left": "right",
                "right": "left"
            };
            var d = opposites[direction];
            debugUndefined(d, "opposite");
            return opposites[direction];
        }

        function alternative(direction) {
            var alternatives = {
                "up": "left",
                "down": "right",
                "left": "up",
                "right": "down"
            };
            var d =  alternatives[direction];
            debugUndefined(d, "alternative");
            return alternatives[direction];
        }

        function alternativeOpposite(direction) {
            var alternativeOpposites = {
                "up": "right",
                "down": "left",
                "left": "down",
                "right": "up"
            };
            var d = alternativeOpposites[direction];
            debugUndefined(d, "alternativeOpposite");
            return alternativeOpposites[direction];
        }

        return {
            currentDirection: currentDirection,
            positionOfPacAsDirection: positionOfPacAsDirection,
            isFree: isFree,
            random: random,
            randomWithDistribution: randomWithDistribution,
            filterFree: filterFree,
            filterFreeN: filterFreeN,
            opposite: opposite,
            alternative: alternative,
            alternativeOpposite: alternativeOpposite,
            flattenRandoms: flattenRandoms
        }
    };

    return GhostQueries;
});