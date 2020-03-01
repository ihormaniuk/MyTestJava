package TesteMAssCar;

public class Engine implements Comparable<Engine> {
    private int numberOfCylinders;


    public Engine(int numberOfCylinders){
        this.numberOfCylinders = numberOfCylinders;
    }


    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getNumberOfCylinders(){
        return numberOfCylinders;
    }

    public String toString(){
        return "Number Of Cylinders : " + numberOfCylinders;
    }

    @Override
    public int compareTo(Engine e) {
        int numberCylindersCompare = Integer.compare(this.numberOfCylinders,e.numberOfCylinders);
        return numberCylindersCompare;
    }
}
