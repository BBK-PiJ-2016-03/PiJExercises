Main.main()

class Main{
    public static main(){
        print "Please enter Player 1's name: "
        String p1 = System.console().readLine()

        print "Please enter Player 2's name: "
        String p2 = System.console().readLine()

        String play = "Y"

        while(play == "Y"){
            Game.Mode mode = getGameMode()
            Game game = new Game(mode, p1, p2);
            println "Would you like to play again? (Y/N) "
            play = System.console().readLine().toUpperCase()
        }
    }

    private static Game.Mode getGameMode(){

        Game.Mode gameMode = null

        while(gameMode == null){
            for(Game.Mode mode : Game.Mode){
                println "[" + mode.ordinal() + "] " + mode.name()
            }
            print "Please select a game mode: "
            String userSelectedMode = System.console().readLine()
            try{
                int modeOrdinal = Integer.parseInt(userSelectedMode)

                gameMode = Game.Mode.values()[modeOrdinal]
            }
            catch(NumberFormatException e){
                println "You must enter a numeric value presented e.g. 0"
            }
            catch(ArrayIndexOutOfBoundsException e){
                println "You must enter a valid choice e.g. 0"
            }
        }
        return gameMode
    }
}

class Game{

    public static enum Mode{
        Alternate, Pair, PairFromFile
    }

    int currentPlayer = 1
    int turn = 1
    int player1Score = 0
    int player2Score = 0
    String[] currentTurns = new String[2]
    String[] validTurns
    boolean gameRunning = true
    String player1Name = "Player 1"
    String player2Name = "Player 2"
    Mode currentMode = Mode.Alternate


    public Game(Mode mode = null, String player1Name = null, String player2Name = null){

        if(mode != null)
            this.currentMode = mode

        if(player1Name != null && player1Name != "")
            this.player1Name = player1Name

        if(player2Name != null && player2Name != "")
            this.player2Name = player2Name

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
        switch(this.currentMode){
            case Mode.Alternate:
                alternateTurn()
                break

            case Mode.Pair:
                pairTurn()
                break

            default:
                alternateTurn()
                break
        }
    }

    private void pairTurn(){
        boolean validTurn = false
        while(!validTurn){
            println "Please enter the pair of turns in the format XX where X is in ([R]ock, [P]aper, [S]cissors):"
            String turns = System.console().readLine()
            if(turns.length() >= 2){
                this.currentTurns[0] = turns[0]
                this.currentTurns[1] = turns[1]
                if(checkTurn(1) && checkTurn(2)){
                    validTurn = true;
                }
                else{
                    println "That was not a valid entry. Please try again."
                }
            }
        }
        scoreRound()
    }

    private void alternateTurn(){
        while(this.currentPlayer <= 2){
            String playerName = this.currentPlayer == 1 ? this.player1Name : this.player2Name
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
                roundWinMessage(this.player2Name)
                break

            case "S":
                incrementPlayer1Score()
                roundWinMessage(this.player1Name)
                break
        }
    }

    private void scorePaperPlay(String against){
        switch(against){
            case "R":
                incrementPlayer1Score()
                roundWinMessage(this.player1Name)
                break

            case "P":
                incrementPlayer1Score()
                incrementPlayer2Score()
                roundDrawMessage()
                break

            case "S":
                incrementPlayer2Score()
                roundWinMessage(this.player2Name)
                break
        }
    }

    private void scoreScissorsPlay(String against){
        switch(against){
            case "R":
                incrementPlayer2Score()
                roundWinMessage(this.player2Name)
                break

            case "P":
                incrementPlayer1Score()
                roundWinMessage(this.player1Name)
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
        return "| " + this.player1Name + ": " + getPlayer1Score() + " | " + this.player2Name + ": " + getPlayer2Score() + " |"
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

        String winner = scoreDiff > 0 ? this.player1Name : this.player2Name

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