package ecel;

import java.util.ArrayList;
import java.util.Random;

import static PrintAndScanner.Print.print;

public class Coneirnere {
    public static void main(String[] args){
        Random random = new Random(190);
        int a = random.nextInt(5700);
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0;i < 4;i++){
            gerbils.add(new Gerbil(a));
            print(gerbils.get(i).hop(8));
        }
        for (Gerbil g: gerbils) {
            print(g.hop(8));
        }
    }
}
