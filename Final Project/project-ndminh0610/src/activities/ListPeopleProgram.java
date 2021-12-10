package activities;

import static utility.Module.quickSort;
import utility.ArrayList;
import utility.List;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;


public class ListPeopleProgram {

    public static void write(String location, StringBuilder builder) throws IOException {
        File file           = new File(location);
        PrintWriter writer  = new PrintWriter(file);

        writer.println(builder);
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        String outputLocation = "data" + File.separator + "People List.txt";
        StringBuilder builder = new StringBuilder("");

        List<Person> personList = new ArrayList<>();
        Person sam1 = new Person("Sam Jones",25);
        Person sam2 = new Person("Sam Long",34);
        Person mike1 = new Person("Mike Jones",43);
        Person mike2 = new Person("Mike Green",43);
        Person mike3 = new Person("Mike Brown",41);
        Person minh = new Person("Minh Nguyen",19);
        personList.add(sam1);
        personList.add(sam2);
        personList.add(mike1);
        personList.add(mike2);
        personList.add(mike3);
        personList.add(minh);
        quickSort(personList);

        builder.append("\nL I S T   O F   P E O P L E\n\n");
        for (int i = 0; i < personList.size();i++) {
            builder.append(personList.get(i)).append("\n");
        }

        write(outputLocation, builder);
    }
}
