package TesteMAssCar;

import java.util.Random;

public class Randome {
    public static int randomGenerator(int max,int min){
        Random randome = new Random();
        return randome.nextInt(max - min + 1) + min;
    }
}
