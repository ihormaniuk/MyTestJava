package TesteMAssCar;



import java.util.*;

import static PrintAndScanner.Print.print;
//import static TesteMAssCar.autoCoperate.*;

public class mainp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        print(" Створити двовимірний масив, величина якого вираховується рандомно. \n" +
                "Заповнити даний масив обєктами авто, всі значення конструктора якого заповнюються рандомно ? \n" +
                " Так ?\n" +
                " Ні ?");
        print("1 : Вивести toString() даних елементів масиву на консоль. ( deepToString() )");
        print("2 : Для всіх обєктів даного масиву засетати одне значення будьякого поля класу Авто (fill()) ");
        print("3 : відсортувати за спаданням всі обєкти за введеним полем ");
        print("4 : відсортувати за зростанням  всі обєкти за введеним полем ");

//        Auto auto1 = new Auto(5);
//        auto1.setNumbersOfHorsePower(5);


        Auto[][] auto = new Auto[randomGeneret(1, 3)][randomGeneret(1, 3)];


        for (int i = 0; i < auto.length; i++) {
            for (int j = 0; j < auto[i].length; j++) {
                auto[i][j] = new Auto(randomGeneret(150, 250),
                        randomGeneret(1980, 2020),
                        new Engine(randomGeneret(2,6)),
                        new Helm(randomGeneret(35,44),"Alcantara"));
            }
        }
        List<Auto[][]> list = new ArrayList<>(auto.length);
//        for (int i = 0;i<list.size();i++){
//            for (int j = 0; j < auto[i].length; j++) {
//                list.get(i)[j] = list.add(auto);
//            }
//        }
//        List<Auto[][]> list = new ArrayList<>();
        for(int i = 0;i<auto.length;i++){
            list.add(auto   );
//            print(Arrays.deepToString(auto));
        }
        print(Arrays.deepToString(new List[]{list}));


        switch (scanner.nextInt()) {

            case 1: {
                System.out.println(Arrays.deepToString(auto));


                print("\n" +
                        "------------------\n" +
                        "      ");



//                break;
            }

            case 2: {
//                for(Auto[] autos : auto){
//                    Arrays.fill(autos,new Auto(randomGeneret(1,9),randomGeneret(2,6), new Engine(15), new Helm(5,"4")));
//                    print(Arrays.deepToString(autos));
//                }

                print("\n" +
                        "------\n" +
                        "");
//                break;
            }

            case 3:{
                for (Auto[] m : auto){
                    Arrays.sort(m);
                    print(Arrays.deepToString(m));
                    print("---------");
                }
                print(" " +
                        "-----------\n" +
                        "         ");
            }

            case 4:{
                for (Auto[] a : auto){
                    Arrays.sort(a,Comparator.reverseOrder());
                    print(Arrays.deepToString(a));
                }
            }

            default: {
                print();
                break;
            }

        }
    }

    static int randomGeneret(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Min value must be less than max value!");
        }

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
