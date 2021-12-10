package activities;

public class Person implements Comparable<Person> {
    String lastName;
    String firstName;
    int age;
    int years;

    public Person(String name, int age) {
        this.firstName = name.substring(0, name.indexOf(" "));
        this.lastName = name.substring(name.indexOf(" "));
        this.age = age;
        this.years = yearsToRetirement();
    }

    public int yearsToRetirement() {
        return 65 - age;
    }

    /********************************************
     * compares two people information
     * @param other person
     * @return the difference between two people
     *********************************************/
    @Override
    public int compareTo(Person other) {
        if (years != other.years)
            return years - other.years;
        else if (age != other.age)
            return age - other.age;
        else if (!lastName.equals(other.lastName))
            return lastName.compareTo(other.lastName);
        return firstName.compareTo(other.firstName);
    }

    /******************************
     * represent the person's data
     * @return person's information
     ******************************/
    public String toString() {
        String _name = String.format("Name:\t %s, %s\n", lastName, firstName);
        String _age = String.format("Age:\t %s\n", age);
        String _retire = String.format("Year to retire:\t %s\n", years);
        return _retire + _age + _name + "\n";
    }
}
