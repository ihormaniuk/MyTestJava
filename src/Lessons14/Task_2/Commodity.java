package Lessons14.Task_2;

public class Commodity implements Comparable<Commodity>{
    private String nameProduct;
    private int lengthProduct;
    private int widthProduct;
    private int weightProduct;

    public Commodity (){

    }

    public Commodity (String nameProduct,int lengthProduct,int widthProduct,int weightProduct) {
        this.nameProduct = nameProduct;
        this.lengthProduct = lengthProduct;
        this.widthProduct = widthProduct;
        this.weightProduct = weightProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getLengthProduct() {
        return lengthProduct;
    }

    public void setLengthProduct(int lengthProduct) {
        this.lengthProduct = lengthProduct;
    }

    public int getWidthProduct() {
        return widthProduct;
    }

    public void setWidthProduct(int widthProduct) {
        this.widthProduct = widthProduct;
    }

    public int getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(int weightProduct) {
        this.weightProduct = weightProduct;
    }

    @Override
    public String toString(){
        return " Імя Товару : " + nameProduct + " , " + " Довжина товару : " + lengthProduct +
                " , " + " Ширина Товару : " + widthProduct + " , " + " Вага Товару : " + weightProduct;
    }


    @Override
    public int compareTo(Commodity o) {
        return this.nameProduct.compareTo(o.nameProduct);
    }
}
