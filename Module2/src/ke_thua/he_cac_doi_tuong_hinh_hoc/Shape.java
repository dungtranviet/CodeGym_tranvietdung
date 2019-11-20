package ke_thua.he_cac_doi_tuong_hinh_hoc;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    //Contructor
    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "a shape with color of " + this.getColor() + " and " + (this.isFilled() ? "filled" : "no filled ");
    }
}
