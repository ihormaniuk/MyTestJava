package ecel;

public class Gerbil {
    int gerbilNumber ;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber=gerbilNumber;
    }
    public String hop(){
        String messenge = "Hi this is Method hop : ";
        return messenge + gerbilNumber;
    }
}
