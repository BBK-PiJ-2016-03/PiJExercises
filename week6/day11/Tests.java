public class Tests {

    public static void main (String[] args) {
        Tests tests = new Tests();
        tests.listIntSet();
    } 

    private  void listIntSet(){
        IntSet tree = new ListIntSet(15);

        int[] numbers = new int[]{5, 12, 76, 3, 97, 2};

        for(int number : numbers){
            tree.add(number);
        }

        System.out.println("Tree contains 12 (true): " + tree.contains(12));
        System.out.println("Tree contains 2 (true): " + tree.containsVerbose(2));
        System.out.println("Tree contains 76 (true): " + tree.contains(76));
        System.out.println("---");
        System.out.println("Tree contains 99 (false): " + tree.contains(99));
        System.out.println("Tree contains 0 (false): " + tree.containsVerbose(0));
        System.out.println("Tree contains -5 (false): " + tree.contains(-5));
        System.out.println("---");
        System.out.println(tree.toString());
        
    }

    private void treeIntSet(){
        IntSet tree = new TreeIntSet(15);

        int[] numbers = new int[]{5, 12, 76, 3, 97, 2};

        for(int number : numbers){
            tree.add(number);
        }

        System.out.println("Tree contains 12 (true): " + tree.contains(12));
        System.out.println("Tree contains 2 (true): " + tree.containsVerbose(2));
        System.out.println("Tree contains 76 (true): " + tree.contains(76));
        System.out.println("---");
        System.out.println("Tree contains 99 (false): " + tree.contains(99));
        System.out.println("Tree contains 0 (false): " + tree.containsVerbose(0));
        System.out.println("Tree contains -5 (false): " + tree.contains(-5));
        System.out.println("---");
        System.out.println(tree.toString());
        
    }

    private void addAndSeek() {
        IntegerTreeNode node = new IntegerTreeNode(12);

        int[] numbers = new int[] {5, 3, 21, 7, 9, 0, -1, 3, 23};
        numbers = new int[] {2,1,3};

        for (int number : numbers) {
            node.add(number);
        }

        System.out.println("Contains 50: " + node.contains(50));
        System.out.println("Contains 23: " + node.contains(23));
        System.out.println("Get max: " + node.getMax());
        System.out.println("Get min: " + node.getMin());
        System.out.println("Depth: " + node.depth());

        System.out.println(node.toString());
    }

}