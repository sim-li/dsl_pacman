define(["gameboard"], function(GameBoard) {
    describe("Gameboard", function() {
        //var gameBoard, ctxMock;

        beforeEach(function() {
            ctxMock = jasmine.createSpy('ctxMock');
            gameBoard = new GameBoard(ctxMock, {}, jasmine.createSpy('setPointMock'));
            gameBoard.drawBoard = jasmine.createSpy('drawBoardMock');
        });

        describe("kill checks", function() {
            dummyCoordinate = function(cord) {
                if(_.isUndefined(cord)) {
                   cord = 1;
                }
                return function() {
                    return cord;
                }
            };

            beforeEach(function() {
                pac = {
                    gridX: dummyCoordinate(),
                    gridY: dummyCoordinate(),
                    type: "pac",
                    hungry: jasmine.createSpy('pacHungryMock'),
                    isHungry: function() { return false; },
                    gotKilled: jasmine.createSpy('pacGotKilledMock'),
                };

                ghost1 = {
                    gridX: dummyCoordinate(),
                    gridY: dummyCoordinate(),
                    type: "ghost1",
                    eaten: jasmine.createSpy('ghostEatenMock')
                };


                gameBoard.registerFigures(pac, ghost1);
            });

            describe("get ghost hitting pac", function() {
                it("should return hit with ghost if at same position", function() {
                    var actual = gameBoard.getGhostHittingPac();
                    expect(actual).toBe(ghost1);
                });

                it("should not return hit with ghost if at different position", function() {
                    pac.gridX = dummyCoordinate(20);
                    pac.gridY = dummyCoordinate(20);
                    var actual = gameBoard.getGhostHittingPac();
                    expect(actual).toBe(undefined);
                });
            });

            describe("check kills", function() {
                it("should kill pacman if ghost on same position", function () {
                    gameBoard.checkKills();
                    expect(pac.gotKilled).toHaveBeenCalled();
                });

                it("should not kill pacman if ghost on different position", function () {
                    pac.gridX = dummyCoordinate(20);
                    pac.gridY = dummyCoordinate(20);
                    gameBoard.checkKills();
                    expect(pac.gotKilled).not.toHaveBeenCalled();
                });
            });

        });
    });
});