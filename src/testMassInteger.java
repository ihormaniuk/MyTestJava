import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static PrintAndScanner.Print.print;

public class testMassInteger {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);


        Integer [] integers = {11,23,56,79,88,324,-1,233,44,11213,4,-33};
        Arrays.sort(integers);
        System.out.println(" " + Arrays.toString(integers));
//        Integer i ;
//        i = scanner.nextInt();
//        i = i  = scanner.nextInt();
//        i = scanner.nextInt();
//        i.toString();



        int [] number = {1,3,2,5,4,7,6,9,0,10,35,77,44,65,11,34,566,78,88,90,33,22};
        int a = number[0];

//        for ( int i = 0 ; i < number.length ; i++ ) {
//            if ( number[i] >= a ) {
//                a = number[i];
//                print(number.toString());
//            }
//        }

//
//        for (Integer integer : number) {
//                if(a<=integer) {
//                    integer.intValue();
//                    a = integer;
//                    print(integer);
//                }
//        }
    }

}
