public class App{
    public static void main(String[] args){
        MatrixChecker checker = new MatrixChecker();

        int[] sym = {1,5,8,8,5,1};
        int[] notSym = {1,8,8,8,5,1};

        System.out.println(checker.isSymmetrical(sym));
        System.out.println(checker.isSymmetrical(notSym));


    }
}