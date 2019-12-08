package models;

import java.util.ArrayList;
import java.util.Stack;

public class FileCabinet {
    private Stack<Employee> st=new Stack<>();
    public void add(Employee employee){
        st.push(employee);
    }
    public ArrayList<Employee> search(String name){
        ArrayList<Employee>result=new ArrayList<Employee>();
        while (!st.isEmpty()){
            Employee employee=st.pop();
            if(employee.getName().equals(name)){
                result.add(employee);
            }
        }
        return result;
    }
}
