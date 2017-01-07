public class ArrayCopier{

    public void copy(int[] source, int[] destination){
        for(int i = 0; i < destination.length; i++){
            writeSourceValueOr0ToDestination(i, source, destination);
        }
    }

    private void writeSourceValueOr0ToDestination(int index, int[] source, int[] destination){
        if(index < source.length){
            destination[index] = source[index];
        }
        else{
            destination[index] = 0;
        }
    }
}