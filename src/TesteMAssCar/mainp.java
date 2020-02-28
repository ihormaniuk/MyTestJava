package TesteMAssCar;


import java.util.*;

import static PrintAndScanner.Print.print;
//import static TesteMAssCar.autoCoperate.*;

public class mainp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        print("1 : Вивести toString() даних елементів масиву на консоль. ( deepToString() )");
        print("2 : відсортувати за спаданням всі обєкти за введеним полем ");
        print("3 : відсортувати за зростанням  всі обєкти за введеним полем ");

        Auto[][] auto = new Auto[randomGeneret(1, 5)][randomGeneret(1, 5)];

        for (int i = 0; i < auto.length; i++) {
            for (int j = 0; j < auto[i].length; j++) {
                auto[i][j] = new Auto(randomGeneret(100, 250),
                        randomGeneret(1980, 2020),
                        new Engine(randomGeneret(2, 12)),
                        new Helm(randomGeneret(35,44),"Alcantara"));
            }
        }
//        Arrays.deepToString(auto);
//        for(Auto[] a : auto){
//            print(a.toString());
//        }

        switch (scanner.nextInt()) {

            case 1: {

//                Auto autoArray[][] = new Auto[getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];
//
//                for (int i = 0; i < autoArray.length; i++) {
//                    for (int j = 0; j < autoArray[i].length; j++) {
//                        autoArray[i][j] = new Auto(getRandomValueFromRange(100, 250),
//                                                        getRandomValueFromRange(1980, 2018),
//                                new Engine(getRandomValueFromRange(2, 12)),
//                                new Helm(getRandomValueFromRange(35,44),"kks"));
//                    }
//                }

                System.out.println(Arrays.deepToString(auto));

                break;
            }

            case 2: {
                List<String> auto1 = new ArrayList<>();
                auto1.add(Arrays.deepToString(auto));
//                Arrays.sort(new String[]{Arrays.deepToString(auto)},Collections.reverseOrder());
//                Arrays.deepToString(auto);
//                Arrays.sort(auto);
//                print(Arrays.toString(auto));
//                Arrays.toString(auto);
//                String a =  Arrays.deepToString(auto);
//                delNoDigOrLet(a);
//                String result = a.replaceAll("[a-zA-Zа-яА-Я-:]* "+"", "");
//                String [] tho;
//                String b = " " ;
//                tho = result.split ( a );
//                String result2 = result.replace("]", "");
//                String result3 = result2.replace("[", "");
//                String result4 = result3.replace(",", " ");
////                long id = Integer.parseInt(String.valueOf(result4));
//                System.out.println(result4);
//                for(int i = 0 ;i< auto1.size();i++){
//                    print((auto1.get(i)).toString());
//                }
                Arrays.sort(new List[]{auto1},Collections.reverseOrder());
                print(auto1);

                break;
            }

            default: {
                System.out.println("Введённое число должно быть 1 или 2!");

                break;
            }

        }
    }

//    private static String delNoDigOrLet (String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (Character .isLetterOrDigit(s.charAt(i)))
//                sb.append(s.charAt(i));
//        }
//        return sb.toString();
//    }
    static int randomGeneret(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Min value must be less than max value!");
        }

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
