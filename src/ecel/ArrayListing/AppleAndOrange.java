package ecel.ArrayListing;

import java.util.ArrayList;

public class AppleAndOrange {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 4;i++){
            apples.add(new Apple());
            apples.add(new Orange());
        }
        for(int i = 0 ;i< apples.size();i++){
            ((Apple)apples.get(i)).id();
        }
    }
}
