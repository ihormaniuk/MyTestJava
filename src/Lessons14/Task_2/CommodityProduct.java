package Lessons14.Task_2;

import java.util.*;

import static PrintAndScanner.Print.print;

public class CommodityProduct {

    Scanner scanner = new Scanner(System.in);

    List<Commodity> commodityList = new ArrayList<>();

    public void addProduct(){
        print("Ведіть назву товару ");
        String nameProduct = scanner.next();
        print("Ведіть довжину товару ");
        int lengthProduct = scanner.nextInt();
        print("Ведіть ширину товару ");
        int widthProduct = scanner.nextInt();
        print("Ведіть вагу товару ");
        int weightProduct = scanner.nextInt();

        Commodity commodity = new Commodity(nameProduct,lengthProduct,widthProduct,weightProduct);
        commodityList.add(commodity);
        print("Товар : \n" +
                "" + commodity.toString() + " Добавлено");
    }

    public void removeProduct(){
        print("Ведіть назву товару ");
        String nameProduct = scanner.next();

        Iterator<Commodity> commodityIterator = commodityList.iterator();
        while (commodityIterator.hasNext()){
            Commodity commodityNext = commodityIterator.next();
            if(commodityNext.getNameProduct().equalsIgnoreCase(nameProduct)){
                commodityIterator.remove();
                print("Товар : " + commodityNext.toString() + "Видалено");
            }else {
                print("Немає такого товару або невірно ведено назву товару");
            }
        }

    }

    public void replaceProduct(){
        print("Ведіть назву товару ");
        String nameProduct = scanner.next();

        for(Commodity commodity : commodityList){
            if(commodity.getNameProduct().equalsIgnoreCase(nameProduct)){
                print(" Це Він : " + commodity.toString() + " ? ");
                print(" 1 Так / 2 Ні");
                int number = scanner.nextInt();
                switch (number){
                    case 1 :{
                        print("Ведіть назву товару ");
                        String nameProductReplace = scanner.next();
                        print("Ведіть довжину товару ");
                        int lengthProduct = scanner.nextInt();
                        print("Ведіть ширину товару ");
                        int widthProduct = scanner.nextInt();
                        print("Ведіть вагу товару ");
                        int weightProduct = scanner.nextInt();
                        commodity.setNameProduct(nameProduct);
                        commodity.setLengthProduct(lengthProduct);
                        commodity.setWidthProduct(widthProduct);
                        commodity.setWeightProduct(weightProduct);
                        print("Товар Замінено на : " + commodity.toString());
                        break;
                    }
                    case 2:{
                        print("Ведіть Назву товару , Довжину , Ширину , Вагу ");
                        print("Ведіть назву товару ");
                        String nameProductReplace = scanner.next();
                        print("Ведіть довжину товару ");
                        int lengthProduct = scanner.nextInt();
                        print("Ведіть ширину товару ");
                        int widthProduct = scanner.nextInt();
                        print("Ведіть вагу товару ");
                        int weightProduct = scanner.nextInt();
                        if(commodity.getNameProduct().equalsIgnoreCase(nameProductReplace) &&
                                commodity.getLengthProduct() == lengthProduct &&
                                commodity.getWidthProduct() == widthProduct &&
                                commodity.getWeightProduct()== weightProduct ){
                            commodity.setNameProduct(nameProductReplace);
                            commodity.setLengthProduct(lengthProduct);
                            commodity.setWidthProduct(widthProduct);
                            commodity.setWeightProduct(weightProduct);
                            print("Товар Замінено на : " + commodity.toString());
                        }else {
                            print("Немає такого Товару");
                        }
                        break;
                    }
                }
            }else {
                print("Немає такого Товару");
            }
        }
    }

    public void sortName(){
        Collections.sort(commodityList,new CommodityNameCompare());
        for (Commodity commodity : commodityList){
            print("Відсуртовано за назвою : " + commodity.toString());
        }
    }

    public void sortLength(){
        Collections.sort(commodityList,new CommodityLengthCompare());
        for (Commodity commodity : commodityList){
            print("Відсуртовано за довжиною : " + commodity.toString());
        }
    }

    public void sortWidth(){
        Collections.sort(commodityList,new CommodityWidthCompare());
        for (Commodity commodity : commodityList){
            print("Відсуртовано за шириною : " + commodity.toString());
        }
    }

    public void sortWeight(){
        Collections.sort(commodityList,new CommodityWeightCompare());
        for (Commodity commodity : commodityList){
            print("Відсуртовано за вагою : " + commodity.toString());
        }
    }

    public void getIndex(){
        print("Ведіть індекс : ");
        int index = scanner.nextInt();

        if(index < 0 || index > (commodityList.size()-1)){
            print("немає такого елемента");
        }else {
            print("Під номером : " + index + " Знаходиться : " + commodityList.get(index).toString());
        }
    }


}
