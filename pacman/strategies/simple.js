define([], function () {
    var strategy = function(queries) {
       var direction = queries.currentDirection();
       return queries.filterFreeN(1, [
direction,
queries.alternative(direction),
queries.alternativeOpposite(direction),
queries.opposite(direction)]);
    }
    return strategy;
});

