define(["underscore"], function (_) {
    var commands = {
        setCurrentDirection: function(direction) {
        }
    };


    var strategy = function(queries, commands) {
        // By default
        var direction = queries.currentDirection();
        return (function() {
            if (queries.isFree(direction)) {
                return commands.randomWithDistribution([
                    50, 25, 25
                ], [
                    direction,
                    commands.filterFree([
                        queries.alternative(direction),
                        queries.alternativeOpposite(direction)
                    ])
                ]);
            } else {
                return commands.filterFreeN(1, [
                    queries.alternative(direction),
                    queries.alternativeOpposite(direction),
                    queries.opposite(direction)
                ]);
            }
        })();
    };


    //
    return strategy;
});
