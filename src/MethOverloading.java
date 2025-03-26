public class MethOverloading {
    public void meth() {
        System.out.println("Meth1");
    }

    public void meth(int x) {
        System.out.println("Meth2");
    }

    public void meth(double y) {
        System.out.println("Meth3");
    }

    public static void main(String[] args) {
        MethOverloading obj1 = new MethOverloading();
        obj1.meth(6.5);
    }
}
