public class Launcher{
    public static void main(String...args){
        try{
            Line wrongLine = new Line(4, 3);
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("There was an illegal argument! Produce a valid line");
        }
    }
}