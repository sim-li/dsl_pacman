requirejs(["requirejs_config/require_config.js", "pacman"], function(require_config, PacMan) {
    requirejs([], function() {
        var pacman = new PacMan();
        pacman.run();
    });
});
