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
        scoreRound()
    }

    private boolean checkTurn(int player){
        if(validTurns.contains(getPlayerTurn(player)))
            return true

        return false
    }

    private String getTurnCode(String word){
        return word[0].toUpperCase()
    }

    private String getPlayerTurn(int player){
        return getTurnCode(currentTurns[player-1])
    }

    private void scoreRound(){
        String player1TurnCode = getPlayerTurn(1)
        String player2TurnCode = getPlayerTurn(2)

        switch(player1TurnCode){
            case "R":
                scoreRockPlay(player2TurnCode)
                break

            case "P":
                break

            case "S":
                break
        }
    }

    private void scoreRockPlay(String against){
        switch(against){
            case "R":
                incrementPlayer1Score()
                incrementPlayer2Score()
                break

            case "P":
                incrementPlayer2Score()
                break

            case "S":
                incrementPlayer1Score()
                break
        }
    }

    private void scorePaperPlay(String against){
        switch(against){
            case "R":
                incrementPlayer1Score()
                break

            case "P":
                incrementPlayer1Score()
                incrementPlayer2Score()
                break

            case "S":
                incrementPlayer2Score()
                break
        }
    }

    private void scoreScissorsPlay(String against){
        switch(against){
            case "R":
                incrementPlayer2Score()
                break

            case "P":
                incrementPlayer1Score()
                break

            case "S":
                incrementPlayer1Score()
                incrementPlayer2Score()
                break
        }
    }

    private void incrementPlayer1Score(){
        scores[0]++
        checkWinCondition()
    }

    private void incrementPlayer2Score(){
        scores[1]++
        checkWinCondition()
    }

    private int getPlayer1Score(){
        return scores[0]
    }

    private int getPlayer2Score(){
        return scores[1]
    }

    private void checkWinCondition(){
        int scoreDiff = getPlayer1Score - getPlayer2Score

        String winner = scoreDiff > 0 ? "1" : "2"

        if (Math.abs(scoreDiff) > 3){
            gameRunning = false
            println "Congratulations Player" + winner + ". You have won this round."
        }
    }

}