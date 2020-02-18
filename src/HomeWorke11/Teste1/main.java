package HomeWorke11.Teste1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Auto auto [][] = new Auto[randomGenerator(3,9)][randomGenerator(3,9)];
        new Engine(randomGenerator(10));
        new Helm(randomGenerator(16),"alcantare");
//        for(int i = 0;i<auto.length;i++){
//            for(int b = 0;i<auto.length;b++){
//                auto[i][b] = new Auto(randomGenerator(20,44),
//                new Engine(randomGenerator(10)),
//                new Helm(randomGenerator(16), "alcantare"),
//                new Engine(randomGenerator(10)),
//                new Engine(randomGenerator(10)),
//                new Helm(randomGenerator(16), "alcantare"),
//                new Engine(randomGenerator(10)));
//                print(auto);
//            }
//        }

        System.out.println(Arrays.deepToString(auto));
        print("");
        print("");
        print("");
        print("");
        print("");
        print("");
        print("");
        print("");
        print("");
        print("");
    }

    static int randomGenerator(int min,int max){
        Random random = new Random();
        return random.nextInt(max - min +1 ) + min;
    }
    static int randomGenerator(int max){
        Random random = new Random();
        return random.nextInt(max - 10 +1 ) + 10;
    }
}
