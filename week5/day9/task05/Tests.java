public class Tests{
    public static void main(String[] args){
        GenericStack<String> stack = new ImpStack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        stack.push("Six");
        stack.push("Seven");   
    
         System.out.println("-- Peek test -- ");

        for(int i = 0; i < 3; i++){
            System.out.println(stack.peek());
        }

        System.out.println("-- Pop and isEmpty Tests -- ");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
}