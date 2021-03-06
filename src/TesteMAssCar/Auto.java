package TesteMAssCar;

import java.util.Comparator;
import java.util.Random;

import static PrintAndScanner.Print.print;

public class Auto implements Comparable<Auto> { //implements Comparable <Auto>
    int numbersOfHorsePower;
    private int yearRelease;
    private Helm helm;
    private Engine engine;

    public Auto() {

    }


    public Auto(int numbersOfHorsePower, int yearRelease, Engine engine, Helm helm) {
        this.numbersOfHorsePower = numbersOfHorsePower;
        this.yearRelease = yearRelease;
        this.engine = engine;
        this.helm = helm;
    }


    public Auto(int numbersOfHorsePower) {
        this.numbersOfHorsePower = numbersOfHorsePower;
    }


    public int getNumbersOfHorsePower() {
        return numbersOfHorsePower;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public String toString() {
        return " " + "Numbers Of Horse Power : " + numbersOfHorsePower + "\n" +
                "" + "Year Release : " + yearRelease + "\n" +
                " Helm Diameter  : " + helm.getDiameterWheels() + "\n" +
                " Helm Material : " + helm.material + "\n" +
                " Engine Number Of Cylinders : " + engine.getNumberOfCylinders() + "\n" +
                "";
    }

    public void setNumbersOfHorsePower(int numbersOfHorsePower) {
        this.numbersOfHorsePower = numbersOfHorsePower;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Helm getHelm() {
        return helm;
    }

    public Engine getEngine() {
        return engine;
    }


    @Override
    public int compareTo(Auto auto) {
        return compare(this.numbersOfHorsePower, auto.numbersOfHorsePower);
    }
    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }



//    @Override
//    public int compareTo(Auto auto){
//        if(this.numbersOfHorsePower == auto.getNumbersOfHorsePower()){
//            return 0;
//        }
//        else if(this.numbersOfHorsePower < auto.getNumbersOfHorsePower()){
//            return -1;
//        }
//        else if(this.numbersOfHorsePower > auto.getNumbersOfHorsePower()){
//            return 1;
//        }
//        else if(this.yearRelease > auto.getYearRelease()){
//            return 1;
//        }
//        else if(this.yearRelease < auto.getYearRelease()){
//            return -1;
//        }
//        else if(this.yearRelease == auto.getYearRelease()){
//            return 0;
//        }else {
//            return 1;
//        }
//
//    }
}