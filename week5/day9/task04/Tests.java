public class Tests{
    public static void main(String[] args){
        GenericStack<String> stack = new ImpStack<>();

        stack.add("One");
        stack.add("Two");
        stack.add("Three");
        stack.add("Four");
        stack.add("Five");
        stack.add("Six");
        stack.add("Seven");        

        for(int i = 0; i < 5; i++){
            System.out.println(stack.pop());
        }


    }
}