package HomeWorke11.Teste1;

public class Auto {
    private int numbersOfHorsePower;
    private int yearRelease;
    private Helm helm;
    private Engine engine;

    public Auto(int numbersOfHorsePower,int yearRelease,Helm helm,Engine engine){
        this.helm = helm;
        this.engine = engine;
        this.numbersOfHorsePower = numbersOfHorsePower;
        this.yearRelease = yearRelease;
    }

    public int getNumbersOfHorsePower(){
        return numbersOfHorsePower;
    }

    public int getYearRelease(){
        return yearRelease;
    }

    public Helm getHelm(){
        return helm;
    }

    public Engine getEngine (){
        return engine;
    }

    public String toString(){
        return "Auto [Numbers Of Horse Power = " + numbersOfHorsePower + ", Year Release=" + yearRelease + ", Helm Diameter = "
                + helm.getDiameterHelm() + ", Material Helm =" + helm.getMaterial() + ", Number Of Cylinders = "
                + engine.getNumberOfCylinders() + "]";
//        return "Numbers Of Horse Power : "  + numbersOfHorsePower + "\n" +
//                "" +  "Year Release : " + yearRelease;
    }

}
