define(["underscore", "figures/ghost", "figures/pac"], function(_, Ghost, Pac) {
    // Demonstrates pattern for creating class that can be instantiated with `new`.
    // Prototype has to be returned by module.

    var Game = function() {
        function run() {
            var ghost = new Ghost("hulalala");

            //This will fail because private variable. Access via setter!
            //ghost.ins ="manipulation";
            ghost.setIns("mani");

            console.log(ghost.ins);
            ghost.myCool();


            console.log("Pacman says:");

            _.each(["hello", "world"], function(w) {
                console.log(w);
            });

        };

        function demoValue() {
            return 123;
        };

        return {
            run: run,
            demoValue: demoValue
        }
    };

    return Game;

});
