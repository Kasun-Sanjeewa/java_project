public class thisKeyword {
    String name;
    int age;

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        thisKeyword obj1 = new thisKeyword();

        obj1.Student("Kasun", 24);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}
