package TesteMAssCar;

public class Engine {
    private int numberOfCylinders;
    public Engine(int numberOfCylinders){
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getNumberOfCylinders(){
        return numberOfCylinders;
    }

    public String toString(){
        return "Number Of Cylinders : " + numberOfCylinders;
    }
}
