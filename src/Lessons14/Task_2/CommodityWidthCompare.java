package Lessons14.Task_2;

import java.util.Comparator;

public class CommodityWidthCompare implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if(o1.getWidthProduct() > o2.getWidthProduct()){
            return 1;
        }else if(o1.getWidthProduct() < o2.getWidthProduct()){
            return -1;
        }
        return 0;
    }
}
