public class App{
    public static void main(String[] args){

        App app = new App();
        String play = "y";
        while(!play.equals("n")){
            Target target = new Target(app.getRandomPlayZone());

            System.out.println("Here they come! Try to bring the plane down!");
            boolean strike = false;

            while(!strike){
                int x = app.getValue("x");
                int y = app.getValue("y");
                int z = app.getValue("z");     

                Coordinate3D coord = new Coordinate3D(x, y, z);
                Result response = target.fire(coord);

                if(response.equals(Result.HIT))
                    strike = true;

                play = app.handleResult(response);
            }
        }
    }

    private int getRandomPlayZone(){
        return (int)Math.floor(Math.random() * 50);
    }

    private String handleResult(Result response){

        switch(response){
            case HIT:
                System.out.println("You hit it! Well done!\nWould you like to play again?");
                return System.console().readLine().toLowerCase();
            case FAIL_LEFT:
                System.out.println("You missed! The target is to the right!");
                break;
            case FAIL_RIGHT:
                System.out.println("You missed! The target is to the left!");
                break;
            case FAIL_HIGH:
                System.out.println("You missed! The target is lower!");
                break;
            case FAIL_LOW:
                System.out.println("You missed! The target is higher!");
                break;
            case FAIL_SHORT:
                System.out.println("You missed! The target is further!");
                break;
            case FAIL_LONG:
                System.out.println("You missed! The target is nearer!");
                break;
            case OUT_OF_RANGE:
                System.out.println("That shot is way out of range. Try harder!");
                break;
        }
        return "y";
    }

    private int getValue(String coord){
        String val = "";
        int response = 0;
        while(val.equals("")){
            System.out.print("Enter a coordinate " + coord + ": ");
            try{
                val = System.console().readLine();
                response = Integer.parseInt(val);
                return response;
            }
            catch(NumberFormatException e){
                System.out.print("Invalid entry");
                val = "";
            }                
        }
        return response;
    }
}