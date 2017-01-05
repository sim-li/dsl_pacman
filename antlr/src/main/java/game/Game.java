package game;

import ai.generated.AiBuilder;

import java.util.*;

public class Game {
    private int[][] displayGameboard;
    private int[][] gameboard;

    List<String> movesList = new ArrayList<String>();


    public Game(int[][] gameboard, String[] moves) {
        this.gameboard = gameboard;
        displayGameboard = new int[7][7];
        movesList.addAll(Arrays.asList(moves));
    }

    public void play() {
        int hitCounter = 0;
        Scanner userInputScanner = new Scanner(System.in);
        for (int round = 0; round <= 49; round++) {
            System.out.println("   A B C D E F G");
            for (int row = 0; row < displayGameboard.length; row++) {
                System.out.print(row + 1 + ": ");
                for (int col = 0; col < displayGameboard[row].length; col++) {
                    System.out.print(displayGameboard[row][col] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Bitte Koordinaten eingeben (z.B. a4): ");
            String input = userInputScanner.nextLine();
            input.substring(0, 2);
            String[] splitAttemptString = input.split("");
            Map<String, Integer> boardColumnMapping = new HashMap();
            boardColumnMapping.put("a", 1);
            int col = Character.getNumericValue(splitAttemptString[0].toCharArray()[0]) - 10;
            int row = Integer.parseInt(splitAttemptString[1]) - 1;
            if ((row > 7 || row < 0) || (col > 7 || col < 0)) {
                System.out.println("DAS WAR NICHT EINMAL IM OZEAN");
                computerPlays();
            } else {
                if (gameboard[row][col] == 1) {
                    hitCounter++;
                    System.out.println("Treffer:" + hitCounter);
                    System.out.println();
                    computerPlays();
                    displayGameboard[row][col] = 1;
                    if (hitCounter == 14) {
                        System.out.println("SIE HABEN ALLE SCHIFFE NACH " + round + " RUNDEN ZERSTÖRT: HERZLICHEN GLÜCKWUNSCH");
                        break;
                    }
                } else {
                    System.out.println("KEINEN TREFFER!");
                    System.out.println();
                    computerPlays();
                }
            }
        }
        userInputScanner.close();
    }

    public void computerPlays(){
        boolean inputIsCorrect = false;
        int compCount = 0;
        int compHits = 0;
        String yes = "j";
        String no = "n";
        String coordinate = movesList.remove(0);
        System.out.println("Der Computer feuert bei dir auf die Koordinaten " +coordinate+". War das ein Treffer? (j/n)");

        while (!inputIsCorrect){
            Scanner userInputScanner = new Scanner(System.in);
            String input = userInputScanner.nextLine();
            if(input.toLowerCase().toString().charAt(0)== yes.charAt(0)){
                inputIsCorrect = true;
                compCount ++;
                compHits ++;
                if(compHits == 14){
                    System.out.println("Der Computer hat das Spiel nach Abgabe von "+ compCount + " Schüssen gewonnen.");
                    break;
                }
            }
            else if(input.toLowerCase().toString().charAt(0)== no.charAt(0)){
                inputIsCorrect = true;
                compCount ++;
            }
            else {
                System.out.println("falsche Eingabe");
                System.out.println("War da ein Treffer? (j/n)");
            }
        }


    }
}

