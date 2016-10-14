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

    private State currentState = State.MAILFROM;
    private String fromAddress = "";
    private String toAddress = "";
    private String body = "";


    public Start(){
        println("Welcome to My Mail Server!");

        boolean running = true;

        while(running){

            getCommand();

        }
    }

    private boolean checkCommand(String check, String command){

        if(command.contains(check)){
            String email = command.replace(check, "");
            return isValidEmail(email);
        }

        return false;
    }

    private boolean isValidEmail(String email){
        email = email.trim();
        int countAt = 0;

        for(int i = 0; i < email.length(); i++){
            if(email[i] == '@'){
                countAt++;
                if(i == 0 || countAt > 1 || i == (email.length() - 1)){
                    println("Invalid email");
                    return false;
                }
            }
        }
        return true;
    }

    private void getCommand(){
        boolean validCommand = false;

        while(!validCommand){
            print(">>> ");
            String command = System.console().readLine();
            validCommand = verifyCommand(command);
            if(!validCommand)
                println("Invalid command.");
        }

        println("OK");
    }

    private boolean verifyCommand(String command){
        switch(this.currentState){
            case State.READY:
                boolean accepted = checkCommand("MAIL FROM: ", command);
                if(accepted){
                    this.fromAddress = command.replace("MAIL FROM: ", "").trim();
                    this.currentState = State.MAILFROM;
                }
                return accepted;
            case State.MAILFROM:
                boolean accepted = checkCommand("RCPT TO: ", command);
                if(accepted){
                    this.toAddress = command.replace("RCPT TO: ", "").trim();
                    this.currentState = State.RCPTTO;
                }
                return accepted;
            case State.RCPTTO:
                boolean accepted = checkCommand("DATA", command);
                if(accepted){
                    this.currentState = State.DATA;
                }
                return accepted;
            case State.DATA:
                if(command == "."){
                    sendEmail();
                    this.currentState = State.READY;
                }
                else{
                    this.data += command.trim();
                }
                return true;
            default:
                return false;
        }
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





