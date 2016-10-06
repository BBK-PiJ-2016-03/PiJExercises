import java.io

class Main{

    int numPlayers = 2
    int currentPlayer = 1
    int turn = 1
    int[] scores = {0, 0}
    String[] currentTurns = {"", ""}
    String[] validTurns = {"R", "P", "S"}

    public main(){
        initialise()
    }

    private void clearTurns(){
        currentTurns = {"", ""}
    }

    private void takeTurn(){
        while(currentPlayer <= numPlayers)
            println String.format("Player %1s, please enter your turn ([R]ock, [P]aper, [S]cissors):", currentPlayer)
            String currentTurn = java.io.Console.readPassword()
            if(checkTurn(currentPlayer)){
                currentPlayer++
            }
        }
    }

    private boolean checkTurn(int player){
        if(validTurns.contains(getTurnCode(getPlayerTurn(player))))
            return true

        return false
    }

    private String getTurnCode(String word){
        return word[0].toUpperCase()
    }

    private String getPlayerTurn(int player){
        return currentTurns[player-1]
    }

}