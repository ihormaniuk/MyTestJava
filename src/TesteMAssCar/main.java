package TesteMAssCar;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        print("");
        switch (scanner.nextInt()) {

            case 1: {

                Auto autoArray[][] = new Auto[getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];

                for (int i = 0; i < autoArray.length; i++) {
                    for (int j = 0; j < autoArray[i].length; j++) {
                        autoArray[i][j] = new Auto(getRandomValueFromRange(100, 250),
                                                        getRandomValueFromRange(1980, 2018),
                                new Engine(getRandomValueFromRange(2, 12)),
                                new Helm(getRandomValueFromRange(35,44),"kks"));
                    }
                }

                System.out.println(Arrays.deepToString(autoArray));

                break;
            }

            case 2: {

                Auto auto = new Auto(getRandomValueFromRange(100, 250), getRandomValueFromRange(1980, 2018),
                        new Engine(getRandomValueFromRange(2, 12)),
                        new Helm(getRandomValueFromRange(35,44),"kks"));

                Auto autoArray[] = new Auto[getRandomValueFromRange(1, 5)];

                Arrays.fill(autoArray, auto);

                System.out.println(Arrays.deepToString(autoArray));

                break;
            }

            default: {
                System.out.println("Введённое число должно быть 1 или 2!");

                break;
            }

        }
    }
    static int getRandomValueFromRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Min value must be less than max value!");
        }

        Random randomValue = new Random();
        return randomValue.nextInt(max - min + 1) + min;
    }
}
