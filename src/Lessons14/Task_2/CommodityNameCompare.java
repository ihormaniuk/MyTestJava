package Lessons14.Task_2;

import java.util.Comparator;

public class CommodityNameCompare implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if(o1.getNameProduct().compareTo(o2.getNameProduct())>0){
            return 1;
        }else if(o1.getNameProduct().compareTo(o2.getNameProduct())<0){
            return -1;
        }
        return 0;
    }
}
