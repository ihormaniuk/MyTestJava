import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static PrintAndScanner.Print.print;

public class HomeWorkToArrays {
    public static void main(String [] args){


//        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
//
//        for (int i = numbers.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//           /*Сравниваем элементы попарно,
//             если они имеют неправильный порядок,
//             то меняем местами*/
//                if (numbers[j] > numbers[j + 1]) {
//                    int tmp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = tmp;
//
//                }
//            }
//            print(numbers[i]);
//        }

        Integer[] listItegere = {12,211,32,2412,65,996,67,68,39,10,11,22,345,677};
        Arrays.sort(listItegere);
        print(Arrays.toString(listItegere));

        Arrays.sort(listItegere, Collections.reverseOrder());
        print(Arrays.toString(listItegere));
    }
}
