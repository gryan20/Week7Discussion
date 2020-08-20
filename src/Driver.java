public class Driver {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(1);
        stack.push(7);
        stack.push(3);
        stack.push(4);
        stack.push(9);
        stack.push(2);

        LinkedStack stack1 = new LinkedStack();
        stack1.push(1);
        stack1.push(7);
        stack1.push(3);
        stack1.push(4);
        stack1.push(9);
        stack1.push(2);

        // popping off from ArrayStack and displaying as it is removed
        while (stack.size() != 0) {
            System.out.println(stack.pop());
        }
        System.out.println();

        // popping off from LinkedStack and displaying as it is removed
        while (stack1.size() != 0) {
            System.out.println(stack1.pop());
        }
        System.out.println();

    }
}