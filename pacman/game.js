define(["underscore", "figures/ghost", "figures/pac"], function (_, Ghost, Pac) {
    // Demonstrates pattern for creating class that can be instantiated with `new`.
    // Prototype has to be returned by module.

    var Game = function () {

        var canvas = document.getElementById('canvas');
        var ctx = canvas.getContext('2d');
        var Rows = 20;
        var Cols = 20;
        var Size = 30;
        var isGameOver = false;

        function init() {
            console.log(canvas);
            console.log(ctx);
            document.onkeydown = getInput;
        }

        function run() {
            isGameOver=false;
            var ghost = new Ghost("hulalala");

            //This will fail because private variable. Access via setter!
            //ghost.ins ="manipulation";
            ghost.setIns("mani");

            console.log(ghost.ins);
            ghost.myCool();


            console.log("Pacman says:");

            _.each(["hello", "world"], function (w) {
                console.log(w);
            });

        }
        ;

        function getInput(e)
        {
            if (!e) {
                var e = window.event;
            }

            e.preventDefault();
            if (isGameOver != true)
            {
                switch (e.keyCode)
                {
                    case 37:
                        {
//                            if (checkMove(curPiece.gridx - 1, curPiece.gridy, curPiece.curState))
//                                curPiece.gridx--;
                            console.log("left");
                        }
                        break;
                    case 39:
                        {
//                            if (checkMove(curPiece.gridx + 1, curPiece.gridy, curPiece.curState))
//                                curPiece.gridx++;
                            console.log("right");
                        }
                        break;
                    case 38:
                        {
                            console.log("up");
                        }
                        break;
                    case 40:
                        {
//                            if (checkMove(curPiece.gridx, curPiece.gridy + 1, curPiece.curState))
//                                curPiece.gridy++;
                            console.log("down");
                        }
                        break;
                }
            }
        }


        function demoValue() {
            return 123;
        }
        ;

        return {
            init: init,
            run: run,
            demoValue: demoValue
        }
    };

    return Game;

});
