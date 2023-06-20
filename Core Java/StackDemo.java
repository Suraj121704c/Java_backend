import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("America");
        stack.push("Germany");
        stack.push("India");


        System.out.println(stack);

//        poping in stack;
        String poped = stack.pop();
        System.out.println(poped);

        String peeked = stack.peek();
        System.out.println(peeked);


    }
}
