package activities;

import static utility.Module.quickSort;
import static activities.ListPeopleProgram.write;

import utility.ArrayList;
import utility.List;
import utility.MyQueue;

import java.io.File;
import java.io.IOException;

public class EmergencyRoomProgram {

    public static void listEmergency() throws IOException {
        String outputLocation = "data" + File.separator + "Emergency Room.txt";
        StringBuilder builder = new StringBuilder("LIST OF EMERGENCY PATIENTS\n\n");

        List<Patient> patientList = new ArrayList<>();

        Patient robert = new Patient("Robert Downey Jr.",
                "1311 Abbot Kinney, CA 90291-3739",
                "001",2);
        Patient chris = new Patient("Chris Evans",
                "9460 Wilshire Blvd, CA 90212",
                "002",6);
        Patient tom = new Patient("Tom Holland",
                "9601 Wilshire Blvd, CA 90210-5213",
                "003",3);
        Patient chris1 = new Patient("Chris Hemsworth",
                "9255 W Sunset Blvd, CA 90069-3309",
                "004",5);
        Patient tom1 = new Patient("Tom Hiddleston",
                "9601 Wilshire Blvd, CA 90210-5213",
                "005",3);
        Patient scarlett = new Patient("Scarlett Johansson",
                "1017 Ocean Avenue, Suite G Santa Monica, CA 90403-3526",
                "006",1);
        Patient mark = new Patient("Mark Ruffalo",
                "9000 W Sunset Blvd, CA 90069-5815",
                "007",4);

        patientList.add(robert);
        patientList.add(chris);
        patientList.add(tom);
        patientList.add(chris1);
        patientList.add(tom1);
        patientList.add(scarlett);
        patientList.add(mark);

        quickSort(patientList);
        for (int i = 0; i < patientList.size(); i++)
            builder.append(patientList.get(i)).append("\n");

        builder.append("\nAFTER MEDICAL EXAMINATION\n").
                append("These patients have completed examination in the following order:\n\n");

        MyQueue<Patient> list = new MyQueue<>();

        for (int i = 0; i < patientList.size(); i++)
            list.add(patientList.get(i));

        for (int i = 0; i < patientList.size(); i++)
            builder.append(list.remove().getInfo()).append("\n");

        write(outputLocation, builder);
    }

    public static void main(String[] args) throws IOException {
        listEmergency();
    }
}
