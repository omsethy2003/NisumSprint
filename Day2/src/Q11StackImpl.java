import java.util.ArrayDeque;

class StackImp<T> {
    private ArrayDeque<T> stack = new ArrayDeque<>();

    public void push(T item) {
        stack.push(item);
    }

    public T pop() {
        return stack.pop();
    }

    public T peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for (T item : stack) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        StackImp<Integer> stack = new StackImp<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        stack.display();
    }
}