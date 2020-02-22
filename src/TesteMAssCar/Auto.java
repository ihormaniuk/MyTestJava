package TesteMAssCar;

public class Auto {
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
}
