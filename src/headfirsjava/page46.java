package headfirsjava;

import static PrintAndScanner.Print.print;

public class page46 {
    public static void main(String[] args){
        String[] oneList = {"Як" , "Їхав" , "Туди" , "Міяць" , "Сонце" , "Земля" , "Білий" , "Кіт" , "Море"
                , "Оголошення" , "Кохав" , "Лев" , "Їв" , "Зорі" , "Палати" , "Небо" };

        String[] twoList = {"Так" , "Нових" , "Яких" , "Довгоочікувана" , "Пропонує"
                , " зворушливі" , "Саундтрек" , "Про" , "Увазі"};

        String[] threeList = {"Ні" , "Магеллан" , "Слова" , "Знімальний" , "Очі" , "Твої" , "Який"};

        int oneListLength = oneList.length;
        int twoListLength = twoList.length;
        int threeListLength = threeList.length;

        int oneRandom = (int) (Math.random() * oneListLength);
        int twoRandom = (int) (Math.random() * twoListLength);
        int threeRandom = (int) (Math.random() * threeListLength);

        String result = oneList[oneRandom] + " " + twoList[twoRandom] + " " + threeList[threeRandom];

        System.out.println(result);
    }
}
