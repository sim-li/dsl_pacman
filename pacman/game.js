define(["underscore"], function(_) {
    // Demonstrates pattern for creating class that can be instantiated with `new`.
    // Prototype has to be returned by module.

    var Game = function() {};

    Game.prototype = {
        run: function() {
            console.log("Pacman says:");
            _.each(["hello", "world"], function(w) {
                console.log(w);
            });
        },

        // Dummy function to demonstrate unit testing with jasmine.
        demoValue: function() {
            return 123;
        }
    };

    return Game;
});
