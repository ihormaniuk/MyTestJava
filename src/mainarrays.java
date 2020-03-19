import Console.MonthUa;

import java.util.*;

import static PrintAndScanner.Print.print;

public class mainarrays {
    public static void main(String[] args){




        Random random = new Random();
        int randome = random.nextInt(990)+10;

        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<40;i++){
            list.add(randome + i++);
        }
        print(list.toString());

        for(int i = list.size() -1 ; i>=0;i--){
            if(i % 2 == 0){
                list.remove(i);
            }
        }
        print(list);
        boolean remove = true;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            it.next();
            if(remove){
                it.remove();
            }
            remove = !remove;
        }
        print(list);
    }

}
