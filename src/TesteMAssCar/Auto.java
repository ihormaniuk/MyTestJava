package TesteMAssCar;

public class Auto implements Comparable<Auto> {
    private int numbersOfHorsePower;
    private int yearRelease;
    Helm helm ;
    Engine engine;

    public Auto(int numbersOfHorsePower,int yearRelease,Engine engine,Helm helm){
     this.numbersOfHorsePower = numbersOfHorsePower;
     this.yearRelease = yearRelease;
     this.engine = engine;
     this.helm = helm;
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

    public int compareTo(Auto cmpareAuto){
        int compareQuantity = ((Auto) cmpareAuto).getNumbersOfHorsePower();
        return numbersOfHorsePower;
    }
}
