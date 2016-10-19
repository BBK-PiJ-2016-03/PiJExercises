public class App{
    public static void main(String[] args){
        MatrixChecker checker = new MatrixChecker();

        int[] sym = {1,5,8,8,5,1};
        int[] notSym = {1,8,8,8,5,1};

        int[][] sym2d = new int[2][2];
        sym2d[0][0] = 1;
        sym2d[0][1] = 1;
        sym2d[1][0] = 1;
        sym2d[1][1] = 1;

        int[][] notSym2d = new int[2][2];
        sym2d[0][0] = 1;
        sym2d[0][1] = 2;
        sym2d[1][0] = 3;
        sym2d[1][1] = 4;

        System.out.println(checker.isSymmetrical(sym));
        System.out.println(checker.isSymmetrical(notSym));

        System.out.println(checker.isSymmetrical(sym2d));
        System.out.println(checker.isSymmetrical(notSym2d));


    }
}