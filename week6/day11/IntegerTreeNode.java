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

    public int depth(){
        return depth(0);
    }

    public int depth(int depth){
        int leftDepth = depth;
        int righttDepth = depth;

        if(this.left != null)
            leftDepth = this.left.depth(leftDepth + 1);

        if(this.right != null)
            righttDepth = this.right.depth(righttDepth + 1);

        return leftDepth > righttDepth ? leftDepth : righttDepth;
    }


    @Override
    public String toString() {
        String output =  "[" + this.value + " L";
        output += this.left != null ? this.left.toString() : "[]";
        output += " R";
        output += this.right != null ? this.right.toString() : "[]";
        output += "]";

        return output;
    }

}