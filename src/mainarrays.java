import Console.MonthUa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class mainarrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<MonthUa> monthUaList = new ArrayList<>();
        for(MonthUa monthUa : MonthUa.values()){
            monthUaList.add(monthUa);
        }
        String s = scan.next();

        for (MonthUa months2 : monthUaList) {
            if (months2.name().equalsIgnoreCase(s)){
                print(months2.getSeasons() + "" +months2.name());
                if(months2.getSeasons().toString().equalsIgnoreCase(months2.name())){
                    print(months2.name() );
                }
            }
        }


//        for(MonthUa m : MonthUa.values()){
////            m.getSeasons();
//            print(m.getSeasons());
//        }
//        print(monthUaList.toString());

//        for (MonthUa months2 : monthUaList) {
//            if (months2.getSeasons().toString().equalsIgnoreCase(s)) {
//                System.out.println(months2);
//            }
//        }
    }
}
