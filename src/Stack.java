public class Stack {
    private int[] tab;
    private int top;
    private int rozmiar;

    public Stack(int maxrozmiar) {
        if (maxrozmiar <= 0) {
            throw new IllegalArgumentException("Nie może być 0");
        }
        tab = new int[maxrozmiar];
        top = -1;
        rozmiar = 0;
    }

    public void push(int num) {
        if (rozmiar >= tab.length) {
            throw new StackFullException();
        }
        tab[++top] = num;
        rozmiar++;
    }

    public int pop() {
        if (rozmiar == 0) {
            throw new StackEmptyException();
        }
        int num = tab[top--];
        rozmiar--;
        return num;
    }

    public void clear() {
        top = -1;
        rozmiar = 0;
    }

    public int top() {
        if (rozmiar == 0) {
            throw new StackEmptyException();
        }
        return tab[top];
    }

    public int rozmiar() {
        return rozmiar;
    }


}
