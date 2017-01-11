define(["pacman"], function(PacMan) {
  describe("Pacman", function() {
      describe("demo", function() {
         it("should return some demo value", function() {
            var pacMan = new PacMan();
             expect(pacMan.demoValue()).toBe(123);
         });

         it("should not return some other value", function() {
              var pacMan = new PacMan();
              expect(pacMan.demoValue()).not.toBe(345);
         });

      });
  });
});