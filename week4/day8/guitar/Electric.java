public class Electric extends Guitar{

    private int pitch = 0;

    public Electric(){

    }

    public int twoTunerPos(int degrees){
        return super.tunerPos(degrees * 2);
    }

    @Override
    public String toString(){
        return "Electric: "+this.pitch;
    }
}