import java.util.Stack;

public class SpecialStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public SpecialStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value <= getMin()) {
            minStack.push(value);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }

        int poppedValue = stack.pop();
        if (poppedValue == getMin()) {
            minStack.pop();
        }
        return poppedValue;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }

    // Пример использования
    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();
        specialStack.push(6);
        specialStack.push(9);
        System.out.println(specialStack.getMin());
        specialStack.push(3);
        System.out.println(specialStack.getMin());
        specialStack.pop();
        System.out.println(specialStack.getMin());
    }
}
