package TesteMAssCar;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        print("1 : Вивести toString() даних елементів масиву на консоль. ( deepToString() )");
        print("2 : відсортувати за спаданням всі обєкти за введеним полем ");
        print("3 : відсортувати за зростанням  всі обєкти за введеним полем ");

        Auto auto[][] = new Auto[randomGeneret(1, 5)][randomGeneret(1, 5)];

        for (int i = 0; i < auto.length; i++) {
            for (int j = 0; j < auto[i].length; j++) {
                auto[i][j] = new Auto(randomGeneret(100, 250),
                        randomGeneret(1980, 2018),
                        new Engine(randomGeneret(2, 12)),
                        new Helm(randomGeneret(35,44),"Alcantara"));
            }
        }

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
                Auto auto[][] = new Auto[randomGeneret(1, 5)][randomGeneret(1, 5)];
                Arrays.sort(auto);
                print(Arrays.toString(auto));

                break;
            }

            default: {
                System.out.println("Введённое число должно быть 1 или 2!");

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
