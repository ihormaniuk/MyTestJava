import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Person implements Comparable {
    String firstName, lastName;

    public Person(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "[ firstname=" + firstName + ",lastname=" + lastName + "]";
    }

    public int compareTo(Object obj) {
        Person emp = (Person) obj;
        int deptComp = firstName.compareTo(emp.getFirstName());

        return ((deptComp == 0) ? lastName.compareTo(emp.getLastName()) : deptComp);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person emp = (Person) obj;
        return firstName.equals(emp.getFirstName()) && lastName.equals(emp.getLastName());
    }
}

class PersonComparator implements Comparator<Person> {
    public int compare(Person emp1, Person emp2) {
        int nameComp = emp1.getLastName().compareTo(emp2.getLastName());
        return ((nameComp == 0) ? emp1.getFirstName().compareTo(emp2.getFirstName()) : nameComp);
    }
}

