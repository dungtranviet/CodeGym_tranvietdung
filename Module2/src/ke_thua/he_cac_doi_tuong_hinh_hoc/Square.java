package ke_thua.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }
    public double getSide(){
        return this.getWidth();
    }
    @Override
    public void setWidth(double width){
        this.setSide(width);
    }
    @Override
    public void setLength(double length){
        this.setSide(length);
    }
    @Override
    public String toString(){
        return "a square with side "+this.getSide()+", which is a subclass of "+super.toString();
    }
}
