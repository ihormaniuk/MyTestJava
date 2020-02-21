package TesteMAssCar;

public class Helm {
    private int diameterWheels;
    String material;


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
}
