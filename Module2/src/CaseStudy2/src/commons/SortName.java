package commons;

import models.Customer;

import java.util.Comparator;

public class SortName implements Comparator<Customer> {
    @Override
    public int compare(Customer cus1, Customer cus2) {
        if(cus1.getName().compareTo(cus2.getName())==0){
            return compareAge(cus1,cus2);
        }
        else return cus1.getName().compareTo(cus2.getName());
    }
    private int compareAge(Customer cus1,Customer cus2){
        String yearString1=cus1.getBirthday().substring(6);
        String yearString2=cus2.getBirthday().substring(6);
        int yearOfBirth1=Integer.parseInt(yearString1);
        int yearOfBirth2=Integer.parseInt(yearString2);
        return Integer.compare(yearOfBirth1,yearOfBirth2);
    }
}
