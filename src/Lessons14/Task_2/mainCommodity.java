package Lessons14.Task_2;

import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class mainCommodity {
    static void menu(){
        print("1 : Додати товар \n" +
                "2 : Видалити товар\n" +
                "3 : Замінити товар\n" +
                "4 : Сортувати за назвоню\n" +
                "5 : Сортувати за довжиною\n" +
                "6 : Сортувати за шириною\n" +
                "7 : Сортувати за вагою\n" +
                "8 : Знайти за індексом\n" +
                "9 : Вивести Меню Знову\n" +
                "10 : Вийти з програми");
    }
    public static void main(String[] args){
        menu();



        CommodityProduct commodityProduct = new CommodityProduct();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            print(" \n" +
                    "     *** Ведіть Число *** \n" +
                    " *** 9 : Вивести меню знову *** ");
            int number = scanner.nextInt();

            switch (number) {
                case 1: {
                    commodityProduct.addProduct();
                    break;
                }
                case 2: {
                    commodityProduct.removeProduct();
                    break;
                }
                case 3: {
                    commodityProduct.replaceProduct();
                    break;
                }
                case 4: {
                    commodityProduct.sortName();
                    break;
                }
                case 5: {
                    commodityProduct.sortLength();
                    break;
                }
                case 6: {
                    commodityProduct.sortWidth();
                    break;
                }
                case 7: {
                    commodityProduct.sortWeight();
                    break;
                }
                case 8: {
                    commodityProduct.getIndex();
                    break;
                }
                case 9: {
                    menu();
                    break;
                }
                case 10: {
                    System.exit(0);
                }
            }
        }
    }
}
