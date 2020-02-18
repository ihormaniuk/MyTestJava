package HomeWorke11;

import java.util.Random;

public class Car {
    Random random = new Random();
    int a = random.nextInt(50);
    int b = random.nextInt(randomGenerator(1980,2018));
    Auto auto = new Auto(a,b);
    Helm helm = new Helm(a,"Alcantara");
    Engine engine = new Engine(a);
    int numbermodel = random.nextInt(a);
    public Car(){
        this.numbermodel = numbermodel;
    }
    public String toString(){
        return "Auto : " + auto + " / \n" +
                "" + "Helm : " + helm + " / \n" +
                "" + "Engine : " + engine + " / \n" +
                "" + "Model Number  : " + numbermodel;
    }
    static int randomGenerator(int max ,int min){
        if (min >= max) {
            throw new IllegalArgumentException("Min value must be less than max value!");
        }
        Random random = new Random();
        return random.nextInt(min - max +1)+min;
    }
}
