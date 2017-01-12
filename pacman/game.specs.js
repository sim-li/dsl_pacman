define(["game"], function(Game) {
  describe("Pacman", function() {
      describe("demo", function() {
         it("should return some demo value", function() {
            var game = new Game();
             expect(game.demoValue()).toBe(123);
         });

         it("should not return some other value", function() {
              var game = new Game();
              expect(game.demoValue()).not.toBe(345);
         });

      });
  });
});