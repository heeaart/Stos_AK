public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        try {

            //stack.wszystko();

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            System.out.println(stack.pop());
            System.out.println(stack.top());
            stack.clear();
            System.out.println("⬇ [Wyczyszczono] ⬇");
            System.out.println(stack.rozmiar());
            //stack.pop(); // pusty
            stack.push(5);
            stack.push(6);
            stack.push(7); // pelny
            System.out.println(stack.rozmiar());
        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
        //stack.wszystko();
    }
}
