package demo;

public abstract class A {
    public    int a=5;
    public int b=4;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum(){
        return this.a+this.b;
    }
}
