package activities;

public class Patient implements Comparable<Patient> {
    String name;
    String id;
    String address;
    int priority;

    public Patient(String name, String address, String id, int priority) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.priority = priority;
    }

    /********************************************
     * compares two patient information
     * @param other patient
     * @return the difference between two patient
     *********************************************/
    @Override
    public int compareTo(Patient other) {
        if (priority != other.priority)
            return priority - other.priority;
        else if (!id.equals(other.id))
            return id.compareTo(other.id);
        else if (!name.equals(other.name))
            return name.compareTo(other.name);
        return address.compareTo(other.address);
    }

    /****************************************************************
     * represent the patient's information after medical examination
     * @return the patient's data without priority number
     ***************************************************************/
    public String getInfo() {
        String _name = String.format("Name: %s\n", name);
        String _id = String.format("ID: %s\n", id);
        String _add = String.format("Address: %s\n", address);
        return _name + _id + _add;
    }

    /***************************************
     * represents the patient's information
     * @return list of patient's data
     **************************************/
    public String toString() {
        String _name = String.format("Name: %s\n",name);
        String _id = String.format("ID: %s\n",id);
        String _priority = String.format("Priority: %s\n",priority);
        String _address = String.format("Address: %s\n",address);
        return _priority + _name + _id + _address;
    }
}
