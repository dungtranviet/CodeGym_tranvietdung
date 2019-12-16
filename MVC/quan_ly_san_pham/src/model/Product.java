package model;

public class Product {
    int id;
    String name;
    float price;
    String about;
    String producer;

    public Product() {
    }

    public Product(int id, String name, float price, String about, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.about = about;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
