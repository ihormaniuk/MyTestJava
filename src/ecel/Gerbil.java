package ecel;

import java.util.Random;

public class Gerbil {
    int gerbilNumber ;
    Random random = new Random();
    public Gerbil(int gerbilNumber){
        this.gerbilNumber=gerbilNumber;
    }
    public String hop(int i){
        String messenge = "Hi this is Method hop : ";
        return messenge + gerbilNumber;
    }
}
