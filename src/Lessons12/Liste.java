package Lessons12;

import java.util.ArrayList;
import java.util.List;

import static PrintAndScanner.Print.print;

public class Liste {
    public static void main(String[] arg){
        List<Integer> list = new ArrayList<>();
        print(list);
        list.add(15);
        list.add(64);
        list.add(69945);
        list.add(2245);
        list.add(-1);
        list.add(-1555255554);
        list.add(55252);
        print(list);
        list.sort(Integer::compareTo);
        print(list);

        print(list.contains(15));
    }

}
