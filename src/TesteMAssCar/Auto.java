package TesteMAssCar;

import java.util.Random;

public class Auto implements Comparable <Auto> {
    private int numbersOfHorsePower;
    private int yearRelease;
    Helm helm ;
    Engine engine;
    Random random = new Random();

    int aint = random.nextInt(10);

    public Auto(int numbersOfHorsePower,int yearRelease,Engine engine,Helm helm){
     this.numbersOfHorsePower = numbersOfHorsePower;
     this.yearRelease = yearRelease;
     this.engine = engine;
     this.helm = helm;
    }
    public Auto(){

    }


    public int getNumbersOfHorsePower(){
        return numbersOfHorsePower;
    }

    public int getYearRelease(){
        return yearRelease;
    }

    public String toString(){
        return "Numbers Of Horse Power : "  + numbersOfHorsePower + "\n" +
                "" +  "Year Release : " + yearRelease + " Helm Diameter Whelm : " + helm.getDiameterWheels() + "\n" +
                " Helm Material : " + helm.material + " Engine Number Of Cylinders : " + engine.getNumberOfCylinders();
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

    public int compareTo(Auto a) {
        int numberPowerCompare = Integer.compare(this.numbersOfHorsePower,a.numbersOfHorsePower);
        if  (numberPowerCompare == 0)
        return numberPowerCompare ;
        int yearCompare = Integer.compare(this.yearRelease,a.yearRelease);
        if  (yearCompare == 0)
            return yearCompare ;
        int helmCompare = helm.compareTo(new Helm(aint));
        if  (helmCompare == 0)
            return helmCompare ;
        int engineCompare = engine.compareTo(new Engine(aint));
        if  (engineCompare == 0)
            return numberPowerCompare ;
        return numberPowerCompare;
    }

//    public int compareTo(Auto compareAuto){
//        int numCompare = this.numbersOfHorsePower;
//    }

}
