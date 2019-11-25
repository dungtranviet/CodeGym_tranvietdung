package demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteToCvs {
    private static Object CSVUtils;

    public static void main(String[] args) throws IOException {
        String csvFile="../data/demo.csv";
        FileWriter writer = new FileWriter(csvFile);
        List<Developer> developers = Arrays.asList(
                new Developer("mkyong", new BigDecimal(120500), 32),
                new Developer("zilap", new BigDecimal(150099), 5),
                new Developer("ultraman", new BigDecimal(99999), 99)
        );
        for (Developer d : developers) {

            List<String> list = new ArrayList<>();
            list.add(d.getName());
            list.add(d.getSalary().toString());
            list.add(String.valueOf(d.getAge()));

            //CSVUtils.writeLine(writer, list);
            for (String elem:list) {
                String str=elem.toString();
                System.out.println(str);
                writer.append(str);
                writer.append("\n");
            }

            //try custom separator and quote.
            //CSVUtils.writeLine(writer, list, '|', '\"');
        }

        writer.flush();
        writer.close();
    }
}
