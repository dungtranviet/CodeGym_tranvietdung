package demo.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriteCSV {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
       // String fileCSV="/demo.csv";

        String fileCSV="src\\demo\\test\\demo.csv";
        //String fileCSV="D:\\ProjectCodeGym\\CodeGym_tranvietdung\\Module2\\src\\demo\\data\\demo.csv";
        FileWriter w=new FileWriter(fileCSV,true);
        for (int i=0;i<10;i++) {
            w.append(",");
            w.append("\n");
        }
        w.flush();
        w.close();
        FileReader reader=new FileReader(fileCSV);
        int i;
        String tes=" ";
        while ((i = reader.read()) != -1) {
            if((char)i=='\n'){
                tes+="qua đối tượng mới";
            }
            tes+= (char)i;
        }
        System.out.println(tes);
        reader.close();
    }
}
