package TesCompe.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Employee> al =new ArrayList<Employee>();
        al.add(new Employee(1,"Dung",23));
        al.add(new Employee(5,"An",21));
        al.add(new Employee(2,"Hai",24));
        System.out.println("trước khi sắp xếp");
        for (Employee employee:al) {
            System.out.println("id: "+employee.id+", name: "+employee.name+", age: "+employee.age);
        }
        System.out.println("sau khi sắp xếp :");
        Collections.sort(al,new NameComparator());
        for (Employee employee:al) {
            System.out.println("id: "+employee.id+", name: "+employee.name+", age: "+employee.age);
        }

}}
