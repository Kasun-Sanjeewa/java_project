public class Child extends Parent {
    public void call() {
        System.out.println("Nokia");
    }

    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.call();
    }
}
