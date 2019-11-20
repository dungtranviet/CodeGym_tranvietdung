package lop_va_doi_tuong.xay_dung_lop_fan;

public class Fan {
    int slow=1;
    int medium=2;
    int fast=3;
    int speed=slow;
    boolean isOn=false;
    String color="blue";
    int radius=5;
    public int getSlow() {
        return slow;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getFast() {
        return fast;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Fan(){

    }
    public String status(){
        if(this.isOn){
            return "Fan is On";
        }
        else {
            return "Fan is Off";
        }
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    @Override
    public String toString(){
        return "Fan : speed ="+this.speed+" ,color: "+color+" ,radius: "+this.radius+" ,"+this.status();
    }
}
