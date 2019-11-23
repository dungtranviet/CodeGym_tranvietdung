package demo;

public class B extends A {
    int a=1;
   int b=2;
    public void showResult(){

        System.out.println("class cha:");
        System.out.println("a= "+super.a);
        System.out.println("b= "+super.b);
        System.out.println("class con ");
        System.out.println("a= "+this.a);
        System.out.println("b= "+this.b);
        System.out.println(this.sum());

    }
//    @Override
//    public int sum (){
//        return this.a+this.b;
//    }
    public static void main(String[] args) {
        B b=new B();
        b.setB(76);
        b.showResult();
    }
}
