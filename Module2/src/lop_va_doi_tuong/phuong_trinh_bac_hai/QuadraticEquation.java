package lop_va_doi_tuong.phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDelta(){
        return (Math.pow(b,2)-4*a*c);
    }
    public double getRoot1(){
        return (-b+Math.pow(this.getDelta(),0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.pow(this.getDelta(),0.5))/(2*a);
    }
    public String noRoot(){
        return "The equation has no real roots";
    }
}
