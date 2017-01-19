define(["underscore", "constants"], function(_, constants) {
    var Ghost = function(ctx, images, gameBoard) {
        var gridX = 8;
        var gridY = 9;
        var BLOCK_SIZE = constants.BLOCK_SIZE;

        function draw() {
            ctx.drawImage(images.ghost, 0, 0, BLOCK_SIZE, BLOCK_SIZE, gridX * BLOCK_SIZE, gridY * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        }

        return {
            draw: draw,
            gridX: gridX,
            gridY: gridY
        };
    };

    return Ghost;
});