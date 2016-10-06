import java.io

Main.main()

class Main{
    public static main(){
        print "Please enter Player 1's name: "
        String p1 = System.console().readLine()

        print "Please enter Player 2's name: "
        String p2 = System.console().readLine()

        String play = "Y"

        while(play == "Y"){
            Game game = new Game(p1, p2);
            println "Would you like to play again? (Y/N) "
            play = System.console().readLine().toUppercase()
        }
    }
}

class Game{

    int numPlayers = 2
    int currentPlayer = 1
    int turn = 1
    int[] scores = new int[]{0, 0}
    String[] currentTurns = new String[]{"", ""}
    String[] validTurns = new String[]{"R", "P", "S"}
    boolean gameRunning = true
    String player1 = "Player 1"
    String player2 = "Player 2"

    public game(String player1 = null, String player2 = null){

        if(player1 != null) this.player1 = player1
        if(player2 != null) this.player2 = player2

        while(gameRunning)
            takeTurn()
    }

    private void clearTurns(){
        currentTurns = {"", ""}
    }

    private void takeTurn(){
        while(this.currentPlayer <= this.numPlayers)
            println String.format("Player %1s, please enter your turn ([R]ock, [P]aper, [S]cissors):", this.currentPlayer)
            this.currentTurn[currentPlayer-1] = java.io.Console.readPassword()
            if(checkTurn(this.currentPlayer)){
                this.currentPlayer++
            }
        }
        scoreRound()
    }

    private boolean checkTurn(int player){
        if(this.validTurns.contains(getPlayerTurn(player)))
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
                scorePaperkPlay(player2TurnCode)
                break

            case "S":
                scoreScissorsPlay(player2TurnCode)
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
        this.scores[0]++
        checkWinCondition()
    }

    private void incrementPlayer2Score(){
        this.scores[1]++
        checkWinCondition()
    }

    private int getPlayer1Score(){
        return this.scores[0]
    }

    private int getPlayer2Score(){
        return this.scores[1]
    }

    private void checkWinCondition(){
        int scoreDiff = getPlayer1Score() - getPlayer2Score()

        String winner = scoreDiff > 0 ? "1" : "2"

        if (Math.abs(scoreDiff) > 3){
            this.gameRunning = false
            println "Congratulations Player" + winner + ". You have won this round."
        }
        else{
            this.currentPlayer = 1;
            this.currentTurn = new int[]{0,0}
        }
    }

}