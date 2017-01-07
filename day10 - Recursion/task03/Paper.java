public class Paper{

    public static void main(String[] args){
        Paper paper = new Paper();
        
        //System.out.println(String.format("6,3: %d", gcd.getSize(6, 3)));

        paper.printSize(paper.getSize("A4"));
        paper.printSize(paper.getSize("A3"));
        paper.printSize(paper.getSize("A2"));
        paper.printSize(paper.getSize("A1"));
        paper.printSize(paper.getSize("A0"));
        
    }

    private int getSize(String size){

        char[] newSize = size.toCharArray();

        int p = Integer.parseInt(String.format("%d", newSize[1]));

        if(p == 0){
            return 1189;
        }

        

        if(p % 2 == 0){
            
            newSize[1] = String.format("%d", (p-2)).toCharArray()[0];
            return getSize(newSize.toString());
        }

        newSize[1] = String.format("%d", (p-1)).toCharArray()[0];
        return getSize(newSize.toString());
        
    }

    private void printSize(int height){
        System.out.println(getWidth(height) + "mm x " + height + "mm");
    }

    private int getWidth(int height){
        return height * 841 / 1189;
    }
}