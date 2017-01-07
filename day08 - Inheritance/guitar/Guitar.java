public class Guitar{
    private int pitch;

    public Guitar(){
        this.pitch = 330;
    }

    public int tunerPos(int degrees){
        this.pitch = this.pitch + degrees;
        return pitch;
    }


    @Override
    public String toString(){
        return "Guitar: "+this.pitch;
    }
}