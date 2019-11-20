package ke_thua.class2d_3d;

public class Class3D extends Class2D {
    float z = 0.0f;

    public Class3D() {

    }

    public Class3D(float z) {
        this.z = z;
    }

    public Class3D(float x,float y,float z) {
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void  setXYZ(float x,float y,float z){
        this.setX(x);
        this.setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float []arrXYZ={this.getX(),this.getY(),this.getZ()};
        return arrXYZ;
    }
    @Override
    public String toString(){
        return super.toString()+" ,z= "+this.getZ();
    }
}
