package Lessons14.Task_2;

import java.util.Comparator;

public class CommodityWeightCompare implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if(o1.getWeightProduct() > o2.getWeightProduct()){
            return 1;
        }if(o1.getWeightProduct() < o2.getWeightProduct()){
            return -1;
        }
        return 0;
    }
}
