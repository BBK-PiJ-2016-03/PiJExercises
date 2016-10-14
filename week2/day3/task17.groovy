//17 Mail server (*)
enum State{
     MAILFROM,
     RCPTFROM,
     DATA
}

State currentState = State.MAILFROM;

println("Welcome to My Mail Server!");

booean running = true;

while(running){

    getCommand();

}


def checkCommand(String check, String command){

    if(command.contains(check)){
        String email = command.replace(check, "");
        return isValidEmail(email);
    }

    return false;
}

def isValidEmail(String email){
    email = email.trim();
    int countAt = 0;

    for(int i = 0; i < email.length(); i++){
        if(c == '@'){
            countAt++;
            if(i == 0 || countAt > 1 || i == (email.length() - 1)){
                println("Invalid email");
                return false;
            }
        }
    }
    return true;
}

def getCommand(){
    boolean validCommand = false;

    while(!validCommand){
        print(">>>");
        String command = System.console().readLine();
        validCommand = verifyCommand(command);
        if(!validCommand)
            println("Invalid command.");
    }

    println("OK");
}

def verifyCommand(command){
    switch(currentState){
        case State.MAILFROM:
            return checkCommand("", command);
        case State.RCPTFROM:
            return checkCommand("", command);
        case State.DATA:
            return true;
        default:
            return false;
    }
}