package TesteMAssCar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static PrintAndScanner.Print.print;

public class newMAin {
    public static void main(String[] args){
        Random random = new Random();

        int a = random.nextInt(4);
        int b = random.nextInt(6);
        int year = random.nextInt(1980)+2020;
        Auto[][] auto = new Auto[randomGeneret(1, 5)][randomGeneret(1, 5)];

        for (int i = 0; i < auto.length; i++) {
            for (int j = 0; j < auto[i].length; j++) {
                auto[i][j] = new Auto(randomGeneret(100, 250),
                        randomGeneret(1980, 2020),
                        new Engine(randomGeneret(2, 12)),
                        new Helm(randomGeneret(35,44),"Alcantara"));
            }
        }
        for (Auto[] m : auto){
            Arrays.sort(m);
            print(Arrays.deepToString(m));
        }

//        auto1.setNumbersOfHorsePower(a);
//        auto1.setYearRelease(year);
//        auto1.setHelm(new Helm(a+b));
//        auto1.setEngine(new Engine(a+b));
//
//        Auto[][] auto = new Auto[a][b];
//        auto = new Auto[][]{{auto1},{auto1}};
//        Arrays.sort(auto, Comparator.comparingInt(arr -> {
//            return arr[a];
//        }));
//        Arrays.sort(auto);
//        print(Arrays.deepToString(auto));
    }



    static int randomGeneret(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Min value must be less than max value!");
        }

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
