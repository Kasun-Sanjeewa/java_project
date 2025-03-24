public class Phone {

    String name;
    String model;
    int ram;

    public void call() {
        System.out.println("Take a call from " + name);
        System.out.println("Mobile brand is " + model);
        System.out.println("Mobile ram " + ram);
    }

    public void massage() {
        System.out.println("Take a massage from " + name);
    }

    public static void main(String[] args) {
        // object1
        Phone phone1 = new Phone();
        phone1.name = "Samsung";
        phone1.model = "M21";
        phone1.ram = 2;
        phone1.call();
        phone1.massage();

        System.out.println("-------------------------------");
        // object2
        Phone phone2 = new Phone();
        phone2.name = "Huawei";
        phone2.model = "Y7a";
        phone2.ram = 4;
        phone2.call();
        phone2.massage();
    }
}
