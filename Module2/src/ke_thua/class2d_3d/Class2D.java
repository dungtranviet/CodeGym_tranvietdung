package ke_thua.class2d_3d;

public class Class2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Class2D() {

    }
    public Class2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float []arrXY={this.x,this.y};
        return arrXY;
    }
    @Override
    public String toString(){
        return "this position with x= "+this.x+", x= "+this.y;
    }
}
