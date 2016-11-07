public class Tests {

    public static void main (String[] args) {
        Tests tests = new Tests();
        tests.addAndSeek();
    } 

    public void addAndSeek() {
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