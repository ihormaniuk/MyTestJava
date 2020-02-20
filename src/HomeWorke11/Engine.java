package HomeWorke11;

public class Engine {
    private int numberOfCylinders;
    public Engine(int numberOfCylinders){
        this.numberOfCylinders = numberOfCylinders;
        return;
    }

    public int getNumberOfCylinders(){
        return numberOfCylinders;
    }

    public String toString(){
        return "Number Of Cylinders : " + numberOfCylinders;
    }
}
