package ecel.ArrayListing;

import java.util.ArrayList;

import static PrintAndScanner.Print.print;

public class AppleAndOrangeNew {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i = 0; i < 4;i++){
            apples.add(new Apple());
        }
        for(int i = 0 ;i< apples.size();i++){
            print((apples.get(i)).id());
        }
        for(Apple c : apples){
            print(c.id());
        }
    }
}
