requirejs(["requirejs_config/require_config.js", "game"], function (require_config, Game) {
    requirejs([], function () {
        var game = new Game();
        game.init();
        
       
//        var startbutton = document.getElementById('text');
//        startbutton.onclick = game.run;
//        game.run();
    });
});
