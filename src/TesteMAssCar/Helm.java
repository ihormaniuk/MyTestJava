package TesteMAssCar;

import java.util.Comparator;

public class Helm implements Comparable<Helm> {
    private int diameterWheels;
    String material;


    public Helm(int diameterWheels){
        this.diameterWheels = diameterWheels;
    }


    public Helm(int diameterWheels,String material){
        this.diameterWheels = diameterWheels;
        this.material = material;
    }

    public int getDiameterWheels(){
        return diameterWheels;
    }

    public String toString(){
        return "Diameter Wheels : " + diameterWheels + "\n" +
                "Material Helm : " + material;
    }

    @Override
    public int compareTo(Helm h) {
        int diameterCompare = Integer.compare(this.diameterWheels,h.diameterWheels);
        return diameterCompare;
    }
}
