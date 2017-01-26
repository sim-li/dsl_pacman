define(["figures/ghost", "figures/ghost_queries"], function(Ghost, GhostQueries) {
    describe("Ghost Queries", function() {
        beforeEach(function() {
            var defaultMock = jasmine.createSpy("defaultMock");
            ghost = new Ghost(defaultMock, 0, 0, {}, defaultMock);
            ghost.currentDirection = "up";
            ghostQueries = new GhostQueries(ghost);
        });

        it("should return correct current direction", function() {
            expect(ghostQueries.currentDirection()).toBe("up");
        });

        it("should return correct current direction - after update -", function() {
            ghost.currentDirection = "down";
            expect(ghostQueries.currentDirection()).toBe("down");
        });

        it("xyz", function() {
            console.log(ghostQueries.randomWithDistribution([100, 10, 10], ["a", "b", "c"]));
        });

    });
});