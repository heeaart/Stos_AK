public class Wyjatek {
    public static class WyjatekFull extends RuntimeException {
        public WyjatekFull() {
            super("Pełny");
        }
    }

    public static class WyjatekPusty extends RuntimeException {
        public WyjatekPusty() {
            super("Pełny");
        }
    }
}
