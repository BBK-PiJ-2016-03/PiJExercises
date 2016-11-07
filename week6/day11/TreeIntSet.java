public class TreeIntSet implements IntSet{

    private int value;
    private TreeIntSet left;
    private TreeIntSet right;

    @Override
    public void add(int newValue){
        if(newValue > this.value){
            addValueRight(newValue);
        }
        else{
            addValueLeft(newValue);
        }
    }

    private void addValueLeft(int newValue){
        if(this.left == null){
            this.left = newValue;
            return;
        }

        this.left.add(newValue);
    }

    private void addValueRight(int newValue){
        if(this.right == null){
            this.right = newValue;
            return;
        }

        this.right.add(newValue);
    }

    @Override
    public boolean contains(int value){
        if(this.value == value)
            return true;

        if(value > this.value)
            return containsRight(value);

        return containsLeft(value);
    }

    private containsLeft(value){
        if(this.left == null)
            return false;

        return this.left.contains(value);
    }

    private containsRight(value){
        if(this.right == null)
            return false;

        return this.right.contains(value);
    }

    @Override
    public boolean containsVerbose(int value){
        if(this.value == value){
            System.out.println(this.value);
            return true;
        }

        if(value > this.value)
            return containsRight(value);

        return containsLeft(value);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.value);
        sb.append(this.left.toString());
        sb.append(this.right.toString());
        return sb.toString();
    }
}