public class Nimal extends Kamal {
    void call() {
        System.out.println("Original call");
    }

    public static void main(String[] args) {
        Nimal obj1 = new Nimal();
        obj1.eat();
        obj1.call();
    }
}
