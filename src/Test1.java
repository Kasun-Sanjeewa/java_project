public class Test1 {
    Test1(String name) {
        System.out.println("This is constractor " + name);
    }

    Test1(String name, int number) {
        System.out.println("This is constractor " + name + number);
    }

    Test1(String name, int number, int id) {
        System.out.println("This is constractor " + name + number + id);
    }

    public static void main(String[] args) {
        Test1 obj1 = new Test1("Test1");
        Test1 obj2 = new Test1("Test1", 5000);
        Test1 obj3 = new Test1("Test1", 50000, 10025);
    }
}
