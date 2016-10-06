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
            play = System.console().readLine().toUpperCase()
        }
    }
}

class Game{

    int numPlayers = 2
    int currentPlayer = 1
    int turn = 1
    int player1Score = 0
    int player2Score = 0
    String[] currentTurns = new String[2]
    String[] validTurns
    boolean gameRunning = true
    String player1 = "Player 1"
    String player2 = "Player 2"

    public Game(String player1 = null, String player2 = null){

        if(player1 != null && player1 != "")
            this.player1 = player1

        if(player2 != null && player2 != "")
            this.player2 = player2

        init()

        while(gameRunning){
            takeTurn()
        }
    }

    private void init(){
        clearCurrentTurns()
        setValidTurn()
    }

    private void clearScores(){
        this.player1Score = 0
        this.player2Score = 0
    }

    private void setValidTurn(){
        this.validTurns = new String[3]
        this.validTurns[0] = "R"
        this.validTurns[1] = "P"
        this.validTurns[2] = "S"
    }

    private void clearCurrentTurns(){
        this.currentTurns = new String[2]
    }

    private void takeTurn(){
        while(this.currentPlayer <= this.numPlayers){
            String playerName = this.currentPlayer == 1 ? this.player1 : this.player2
            println String.format("%1s, please enter your turn ([R]ock, [P]aper, [S]cissors):", playerName)
            this.currentTurns[currentPlayer-1] = System.console().readLine()
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
                scorePaperPlay(player2TurnCode)
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
                roundDrawMessage()
                break

            case "P":
                incrementPlayer2Score()
                roundWinMessage(this.player2)
                break

            case "S":
                incrementPlayer1Score()
                roundWinMessage(this.player1)
                break
        }
    }

    private void scorePaperPlay(String against){
        switch(against){
            case "R":
                incrementPlayer1Score()
                roundWinMessage(this.player1)
                break

            case "P":
                incrementPlayer1Score()
                incrementPlayer2Score()
                roundDrawMessage()
                break

            case "S":
                incrementPlayer2Score()
                roundWinMessage(this.player2)
                break
        }
    }

    private void scoreScissorsPlay(String against){
        switch(against){
            case "R":
                incrementPlayer2Score()
                roundWinMessage(this.player2)
                break

            case "P":
                incrementPlayer1Score()
                roundWinMessage(this.player1)
                break

            case "S":
                incrementPlayer1Score()
                incrementPlayer2Score()
                roundDrawMessage()
                checkWinCondition()
                break
        }
    }

    private void roundDrawMessage(){
        println "Draw " + getScoreText()
        checkWinCondition()
    }

    private void roundWinMessage(String winner){
        println winner + " has won this round "  + getScoreText()
        checkWinCondition()
    }

    private String getScoreText(){
        return "| " + this.player1 + ": " + getPlayer1Score() + " | " + this.player2 + ": " + getPlayer2Score() + " |"
    }

    private void incrementPlayer1Score(){
        this.player1Score++
    }

    private void incrementPlayer2Score(){
        this.player2Score++
    }

    private int getPlayer1Score(){
        return this.player1Score
    }

    private int getPlayer2Score(){
        return this.player2Score
    }

    private void checkWinCondition(){
        int scoreDiff = getPlayer1Score() - getPlayer2Score()

        String winner = scoreDiff > 0 ? this.player1 : this.player2

        if (Math.abs(scoreDiff) > 3){
            this.gameRunning = false
            println "Congratulations " + winner + ". You have won this game."
        }
        else{
            this.currentPlayer = 1;
            clearCurrentTurns()
        }
    }

}