public class IntegerTreeNode{
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;

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

    public boolean contains(int checkValue){
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

    }

    public int getMin(){

    }

}