define(["underscore"], function(_) {
var Level = function() {
var levelData = [
        [w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w], //1
        [w, 2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, w], //2
        [w, 1, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //3
        [w, 1, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //4
        [w, 1, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //5
        [w, 1, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //6
        [w, 1, w, 0, w, w, w, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //7
        [w, 1, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //8
        [w, 1, w, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //9
        [w, 0, 0, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //10
        [w, 0, 0, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //11
        [w, 0, 0, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //12
        [w, 1, 0, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //13
        [w, 1, 0, w, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //14
        [w, 1, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //15
        [w, 1, 0, w, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //16
        [w, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //17
        [w, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, w], //18
        [w, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, w], //19
        [w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w, w]  //20
        ];
        function draw(){
        console.log("hier passiert dass Zeichnen");
                };
        return{
        draw:draw
        };
};
        return Level;
        });