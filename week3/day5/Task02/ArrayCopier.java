public class ArrayCopier{

    public void copy(int[] source, int[] destination){

        for(int i = 0; i < destination.length; i++){
            if(i < source.length){
                destination[i] = source[i];
            }
            else{
                destination[i] = 0;
            }
        }
    }
}