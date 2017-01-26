define([], function () {
    var commands = {
        setCurrentDirection: function(direction) {
        }
    };


    var strategy = function(queries) {
        // By default
        var direction = queries.currentDirection();
        return (function() {
            if (queries.isFree(direction)) {
                return queries.randomWithDistribution([
                    50, 25, 25
                ], [
                    direction,
                    queries.filterFree([
                        queries.alternative(direction),
                        queries.alternativeOpposite(direction)
                    ])
                ]);
            } else {
                return queries.filterFreeN(1, [
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
