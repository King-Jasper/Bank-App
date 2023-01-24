public class Main {
    public static void main(String[] args) {
        System.out.println("Hello David!");

        Mouse2 m2 = new Mouse2();
        m2.leftClick();
        m2.rightClick();
        m2.scrollDown();
        m2.scrollUp();

        m2.connect();

    }

}