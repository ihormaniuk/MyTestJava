package Lessons14;

import java.util.Comparator;

public class compLesson14 implements Comparator<lessons14> {
    @Override
    public int compare(lessons14 o1, lessons14 o2) {
        if (o1.getI()>o2.getI()){
            return 1;
        } else if(o1.getI()<o2.getI()){
            return -1;
        }
        return 0;
    }
}
