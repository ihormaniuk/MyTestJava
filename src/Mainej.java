import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Mainej {
    public static void main(String args[]) {
        ArrayList<Person> names = new ArrayList<Person>();
        names.add(new Person("E", "T"));
        names.add(new Person("A", "G"));
        names.add(new Person("B", "H"));
        names.add(new Person("C", "J"));

        Iterator iter1 = names.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        Collections.sort(names, new PersonComparator());
        Iterator iter2 = names.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
    }
}
