public class statickeyword {

    static String name;
    String type;

    static void call() {
        System.out.println(name);
    }

    void message() {
        System.out.println(type);
    }

    public static void main(String[] args) {
        name = "Samsung";
        call();

        statickeyword obj1 = new statickeyword();
        obj1.type = "Nokia";
        obj1.message();

    }
}
