//Look at the following code (with line numbers for clarity):
  String requestUser() {
      String result = System.console().readLine();
      return result;
  }
  void createUser() {
      String user = requestUser();
      while (!isValidUser(user)) {
          println("That name is not valid. Please try again.");
          user = requestUser();
      }
      insertUserInDB(user);
  }
  void deleteUser() {
      String user = requestUser();
      while (!isValidUser(user)) {
          println("That name is not valid. Please try again.");
          user = requestUser();
      }
      if (existsInDB(user) {
          deleteUserInDB(user);
      } else {
          println "That user does not exist."
      }
  }
  void insertUserInDB(String user) {
      // do things with DB that we will cover in later weeks
  }
  void deleteUserFromDB(String user) {
      // do things with DB that we will cover in later weeks
  }
  boolean existsInDB(String user) {
      // do things with DB that we will cover in later weeks
  }
  boolean isValidUser(String login) {
      boolean loginIsValid = true;
      for (int i = 0; i < login.length(); i++) {
          char c = login.charAt(i);
          if (!Character.isLetter(c) || !Character.isLowerCase(c)) {
              loginIsValid = false;
          }
      }
      return true;
  }
  boolean running = true;
  while (running) {
      println "What would you like to do?";
      println "1 - Enter a new user";
      println "2 - Delete a user";
      println "0 - Exit";
      print   "> ";
      String str = System.console().readLine();
      int option = Integer.parseInt(str);
      switch (option) {
      case 0: running = false;
              break;
      case 1: createUser();
              break;
      case 2: deleteUser();
              break;
      default: println "Invalid option. Please try again."
      }
  }
  /*
Follow the execution of the code as the user enters the following sequences of inputs:
• 4, 0
• 1, john, 0
• 1, john smith, johnsmith, 0
• 2, userNotInDB, 0
• 1, john, 2, john, 0

Hint: all of them start at 40.
*/