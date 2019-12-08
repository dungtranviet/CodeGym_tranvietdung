package models;

public class Employee {
    private String id;
    private String name;
    private String birthday;
    private String address;

    public Employee(String id, String name, String birthday, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("id='").append(id).append('\'').append('\n');
        sb.append("name='").append(name).append('\'').append('\n');
        sb.append("birthday='").append(birthday).append('\'').append('\n');
        sb.append("address='").append(address).append('\'').append('\n');
        return sb.toString();
    }
}
