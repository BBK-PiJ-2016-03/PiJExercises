public class Hanoi{
    public static void main(String[] args){
        Hanoi han = new Hanoi();

        for(long i = 1; i <= 64; i++){
            System.out.println(String.format("%d : %d", i, han.getHanoiMoves(i)));
        }
        

    }

    private long getHanoiMoves(long discs){
        //move one disc = 1 move
        //move two discs = 3 moves
        //move three discs = 7 moves
        //move four discs = 15 moves

        if(discs < 1)
            throw new IndexOutOfBoundsException();

        if(discs == 1)
            return 1;

        return  1 + (getHanoiMoves(discs - 1) * 2);
    }
}