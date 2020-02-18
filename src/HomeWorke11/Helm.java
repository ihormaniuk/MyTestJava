package HomeWorke11;

public class Helm {
    int diameterWheels;
    String material;
    public Helm(int diameterWheels,String material){
        this.diameterWheels = diameterWheels;
        this.material = material;
    }
    public String toString(){
        return "Diameter Wheels : " + diameterWheels + "\n" +
                "Material Helm : " + material;
    }
}
