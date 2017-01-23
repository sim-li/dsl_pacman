define(["underscore", "gameboard"], function(_, GameBoard) {
    describe("Gameboard", function() {
        //var gameBoard, ctxMock;

        beforeEach(function() {
            ctxMock = jasmine.createSpy('ctxMock');
            gameBoard = new GameBoard(ctxMock, {}, jasmine.createSpy('setPointMock'));
            gameBoard.drawBoard = jasmine.createSpy('drawBoardMock');
        });

        describe("reset level", function() {
            it("should do", function() {
                var demo = {
                    floor: 0,
                    point: 1,
                    fruit: 2,
                    wall: 3,
                    map: [
                        [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3], //1
                        [3, 2, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 1, 2, 3], //2
                        [3, 1, 3, 1, 3, 3, 1, 3, 1, 3, 1, 3, 3, 3, 1, 3, 1, 3, 1, 3], //3
                        [3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 3, 1, 3], //4
                        [3, 1, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 1, 3, 1, 3, 1, 3, 1, 3], //5
                        [3, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3], //6
                        [3, 1, 3, 3, 3, 3, 1, 3, 1, 3, 1, 3, 1, 3, 3, 3, 3, 3, 1, 3], //7
                        [3, 1, 3, 3, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3], //8
                        [3, 1, 1, 3, 1, 3, 1, 3, 0, 3, 0, 3, 1, 3, 3, 3, 1, 1, 1, 3], //9
                        [3, 3, 1, 3, 2, 3, 1, 3, 0, 0, 0, 3, 1, 3, 2, 1, 1, 3, 1, 3], //10
                        [3, 1, 1, 3, 1, 3, 1, 3, 3, 3, 3, 3, 1, 3, 1, 3, 1, 3, 1, 3], //11
                        [3, 1, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 3, 1, 3], //12
                        [3, 1, 3, 3, 3, 3, 1, 3, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3], //13
                        [3, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 3, 1, 3, 3, 3, 3, 3, 1, 3], //14
                        [3, 1, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3], //15
                        [3, 1, 3, 1, 1, 1, 1, 3, 3, 3, 3, 3, 1, 3, 3, 3, 1, 1, 1, 3], //16
                        [3, 1, 3, 1, 3, 3, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3], //17
                        [3, 1, 3, 1, 3, 3, 1, 3, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 1, 3], //18
                        [3, 2, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3], //19
                        [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3]  //20
                    ]
                }
                expect(demo.map[0][0]).toBe(3);
                var demoClone = JSON.parse(JSON.stringify(demo.map));
                demo.map[0][0] = 0;
                expect(demoClone[0][0]).toBe(3);
            });
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
                    resetPos: function() {}
                };

                ghost1 = {
                    gridX: dummyCoordinate(),
                    gridY: dummyCoordinate(),
                    type: "ghost1",
                    eaten: jasmine.createSpy('ghostEatenMock'),
                    resetPos: function() {}
                };

                gameBoard.registerFigures(pac, ghost1);
            });

            describe("")
            describe("get ghost hitting pac", function() {
                it("should return hit with ghost if at same position", function() {
                    var actual = gameBoard.getGhostHittingPac();
                    expect(actual).toBe(ghost1);
                });

                // Here!
                it("should not return hit with ghost if at different position", function() {
                    pac.gridX = dummyCoordinate(20);
                    pac.gridY = dummyCoordinate(20);
                    var actual = gameBoard.getGhostHittingPac();
                    expect(actual).toBe(undefined);
                });
            });

            describe("check kills", function() {
               //TODO: verify this test, does not work
               xit("should kill pacman if ghost on same position", function () {
                    gameBoard.reset = jasmine.createSpy('resetBoardMock');
                    gameBoard.checkKills();
                    expect(gameBoard.reset).toHaveBeenCalled();
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