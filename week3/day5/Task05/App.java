public class App{
    public static void main(String[] args){

        Matrix matrix = new Matrix(3,5);

        /*matrix.setColumn(1, "1,2,3,4,5");

        matrix.setRow(1, "1,2,3,4,5");

        matrix.setElement(2,4,9);*/

        matrix.setMatrix("[1,2,3,4,5;6,7,8,9,10;11,12,13,14,15]");

        System.out.println(matrix.toString());

        System.out.println(matrix.prettyPrint());



    }
}