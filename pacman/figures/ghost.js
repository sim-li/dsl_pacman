define(["underscore"], function(_) {
    var Ghost = function(iv) {
        var ins=iv;

        function myCool() {
            console.log(ins);
        };

        function doAMove() {
            x = x + 10;
        };

        function setIns(newIns){
            ins = newIns;
        };

        return {
            myCool: myCool,
            setIns: setIns
        };
    };


    return Ghost;
});