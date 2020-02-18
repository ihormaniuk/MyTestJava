package HomeWorke11.Teste1;

public class Helm {
    private int diameterHelm;
    private String material;

    public Helm(int diameterHelm,String material){
        this.diameterHelm = diameterHelm;
        this.material = material;
    }

    public int getDiameterHelm(){
        return  diameterHelm;
    }

    public String getMaterial(){
        return material;
    }

    public String toString(){
        return "Diameter Wheels : " + diameterHelm + "\n" +
                "Material Helm : " + material;
    }
}
