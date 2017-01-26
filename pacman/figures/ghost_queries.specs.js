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

        it("should flatten randoms", function() {
            var res = ghostQueries.flattenRandoms([100, 10, 10], ["a", "b"]);
            expect(res).toBe([100, 20]);
            var res = ghostQueries.flattenRandoms([100, 10, 10], ["a", "b", "c"]);
            expect(res).toBe([100, 10, 10]);
            var res = ghostQueries.flattenRandoms([100, 10, 10], ["a"]);
            expect(res).toBe([120]);
            var res = ghostQueries.flattenRandoms([100, 10, 10, 10, 10, 10], ["a"]);
            expect(res).toBe([120]);
        });

    });
});