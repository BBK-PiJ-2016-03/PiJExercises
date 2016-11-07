public class ListIntSet implements IntSet{

    private int value;
    public ListIntSet nextNode;

    public ListIntSet(int value){
        this.value = value;
    }

    public void add(int newValue){
        if(this.nextNode == null){
            this.nextNode = new ListIntSet(newValue);
            return;
        }

        this.nextNode.add(newValue);
    }

    public boolean contains(int value){
        if(this.value == value)
            return true;

        if(this.nextNode == null)
            return false;

        return this.nextNode.contains(value);
    }

    public boolean containsVerbose(int value){
        System.out.println(value + " == " + this.value + " | ");
        if(this.value == value)
            return true;

        if(this.nextNode == null)
            return false;

        return this.nextNode.contains(value);
    }

    public String toString(){        
        return " | " + this.value + (this.nextNode == null ? "" : this.nextNode.toString());
    }

}