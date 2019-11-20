package demo;

public class TestShow implements Show {

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void print() {
        System.out.println("print");
    }

    public static void main(String[] args) {
        TestShow testShow=new TestShow();
        testShow.show();
        testShow.print();
    }
}
