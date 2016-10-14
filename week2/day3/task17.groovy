//17 Mail server (*)

MailServer server = new MailServer();
server.Start();

class MailServer{
    enum State{
        READY,
        MAILFROM,
        RCPTTO,
        DATA
    }

    private State currentState = State.READY;
    private String fromAddress = "";
    private String toAddress = "";
    private String body = "";

    private boolean running = true;


    public Start(){
        println("Welcome to My Mail Server!");



        while(running){

            getCommand();

        }
    }

    private boolean checkCommand(String check, String command){

        if(command.contains(check)){
            String email = command.replace(check, "");
            return true;
        }
        println("Invalid command.");
        return false;
    }

    private boolean isValidEmail(String email){
        email = email.trim();
        int countAt = 0;
        boolean valid = true;

        for(int i = 0; i < email.length(); i++){
            if(email[i] == '@'){
                countAt++;
                if(i == 0 || countAt > 1 || i == (email.length() - 1)){
                    valid = false;
                }
            }
        }

        if(countAt < 1){
            valid = false;
        }

        if(!valid)
            println("Invalid email");

        return valid;
    }

    private void getCommand(){
        boolean validCommand = false;

        while(!validCommand){
            print(">>> ");
            String command = System.console().readLine();
            validCommand = verifyCommand(command);
        }

        println("OK");
    }

    private boolean verifyCommand(String command){
        switch(this.currentState){
            case State.READY:
                return readyCheck(command);
            case State.MAILFROM:
                return mailFromCheck(command);
            case State.RCPTTO:
                return rcptToCheck(command);
            case State.DATA:
                return dataCheck(command);
            default:
                return false;
        }
    }

    private boolean readyCheck(String command){
        boolean accepted = checkCommand("MAIL FROM: ", command);
        if(accepted){
            String email = command.replace("MAIL FROM: ", "").trim();
            if(isValidEmail(email)){
                this.fromAddress = email;
                this.currentState = State.MAILFROM;
            }
        }
        return accepted;
    }

    private boolean mailFromCheck(String command){
        boolean accepted = checkCommand("RCPT TO: ", command);
        if(accepted){
            String email = command.replace("RCPT TO: ", "").trim();
            if(isValidEmail(email)){
                this.toAddress = email;
                this.currentState = State.RCPTTO;
            }
        }
        return accepted;
    }

    private boolean rcptToCheck(String command){
        boolean accepted = checkCommand("DATA", command);
        if(accepted){
            this.currentState = State.DATA;
        }
        return accepted;
    }

    private boolean dataCheck(String command){
        if(command == "."){
            sendEmail();
            this.currentState = State.READY;
        }
        else{
            this.body += command.trim();
        }
        return true;
    }

    private void checkQuit(command){
        if(command == "QUIT"){
            this.running = false;
        }
        return;
    }

    private void sendEmail(){
        println("Sending email...");
        println("from: " + fromAddress);
        println("to: " + toAddress);
        println(body);
    }

    /*
    println("Commands:");
    println("MAIL FROM: email@address, to set sender email address.");
    println("RCPT TO: email@address, to set fdetination email address.");
    println("DATA to set the body of the address.");
    println("Enter a line containing only a . to finish entering data.");
    println("QUIT at any other point enter to exit the program");
    println("");
    */

}





