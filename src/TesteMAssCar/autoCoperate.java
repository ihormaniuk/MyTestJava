package TesteMAssCar;

import java.util.Comparator;

public class autoCoperate  {
    public static Comparator<Auto> SORT = new Comparator<Auto>() {
        @Override
        public int compare(Auto a1, Auto a2) {
            int i = a1.toString().compareTo(a2.toString());
            if (i == 0) {
                i = a1.getYearRelease() - a2.getYearRelease();
            }
            return i;
        }
    };
}
