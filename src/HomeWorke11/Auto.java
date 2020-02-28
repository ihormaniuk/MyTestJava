package HomeWorke11;

import java.util.Random;

public class Auto {
    Random random = new Random();
    int a = random.nextInt(1);
    int b = random.nextInt(5);
    private int numbersOfHorsePower;
    private int yearRelease;
    Engine engine = new Engine(a);
    Helm helm = new Helm(a,"alcantara");

    public Auto(int numbersOfHorsePower,int yearRelease){
      this.numbersOfHorsePower = numbersOfHorsePower;
      this.yearRelease = yearRelease;
    }

    public int getNumbersOfHorsePower(){
        return numbersOfHorsePower;
    }

    public int getYearRelease(){
        return yearRelease;
    }

    public String toString(){
        return "Numbers Of Horse Power : "  + numbersOfHorsePower + "\n" +
                "" +  "Year Release : " + yearRelease + " helm.material " +  helm.material + " helm.material \n" +
                " " + helm.material + "\n" + " " + engine.getNumberOfCylinders();
    }
//    public static int Randome (int max , int min){
//        Random random = new Random();
//        int max = random.nextInt();
//        return max
//    }
}
