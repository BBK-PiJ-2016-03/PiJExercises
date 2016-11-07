public class IntegerTreeNode{
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;

    public IntegerTreeNode (int number) {
        this.value = number;
    }

    public void add(int newNumber){
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } 
            else {
                right.add(newNumber);
            }
        } 
        else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } 
            else {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int n){
        if (n == this.value) {
            return true;
        } 
        else if (n > this.value) {
            if (right == null) {
                return false;
            } 
            else {
                return right.contains(n);
            }
        } 
        else {
            if (left == null) {
                return false;
            } 
            else {
                return left.contains(n);
            }
        }
    }

    public int getMax(){
        if(this.right == null)
            return this.value;

        return this.right.getMax();
    }

    public int getMin(){
        if(this.left == null)
            return this.value;
        
        return this.left.getMin();
    }

    @Override
    public String toString() {
        return "[" + this.value + " L" + this.left.toString() + " R" + this.right.toString() + "]";
    }

}