package Lessons14;

import java.util.*;

import static PrintAndScanner.Print.print;

public class main {
    public static void main(String[] args){

        print("--------------\n" +
                "   HashSet \n" +
                "--------------\n" +
                "");
        Set<lessons14> lessons14Set = new HashSet<>();
        for (int i = 0;i < 6;i++){
            lessons14Set.add(new lessons14(randomString(),randomInt()));
        }
        for(lessons14 lessons14 : lessons14Set){
            print(lessons14);
        }
        print("HashSet виводить елементи у випадковому порядку");

        print("\n" +
                "");


        print("--------------\n" +
                "LinkedHashSet \n" +
                "--------------\n" +
                "");
        Set<lessons14> lessons14Set1 = new LinkedHashSet<>();
        for (int i = 0;i < 6;i++){
            lessons14Set1.add(new lessons14(randomString(),randomInt()));
        }
        for(lessons14 lessons14 : lessons14Set1){
            print(lessons14);
        }
        print("");
        print("LinkedHashSet виводить елементи в порядку їх додавання");

        print("\n" +
                "");


        print("--------------\n" +
                "   TreeSet \n" +
                "--------------\n" +
                "");
        Set<lessons14> lessons14Set2 = new TreeSet<>();
        for (int i = 0;i < 6;i++){
            lessons14Set2.add(new lessons14(randomString(),randomInt()));
        }
        for(lessons14 lessons14 : lessons14Set2){
            print(lessons14);
        }
        print("");
        print("TreeSet виводить елементи в порядку, перевизначення в Comparable (за замовчуванням)");

        print("\n" +
                "");


        print("--------------\n" +
                "   TreeSet \n" +
                "--------------");
        Set<lessons14> lessons14Set3 = new TreeSet<>(new compLesson14());
        for (int i = 0;i < 6;i++){
            lessons14Set3.add(new lessons14(randomString(),randomInt()));
        }
        for(lessons14 lessons14 : lessons14Set3){
            print(lessons14);
        }
        print("");
        print("TreeSet виводить елементи в порядку, перевизначення в Comparator");

    }

    static int randomInt(){
        Random random = new Random();
        int i = random.nextInt(50)+1;
        return i;
    }

    static String randomString(){
        Random random = new Random();
        int i = random.nextInt(10)+1;
        if(i==1){
            return "Aa";
        }else if(i==2){
            return "Bb";
        }else if(i==3){
            return "Cc";
        }else if(i==4){
            return "Dd";
        }else if(i==5) {
            return "Gg";
        }else if(i==6){
            return "Ff";
        }else if(i==7){
            return "Hh";
        }else if(i==9){
            return "Ii";
        }else {
            return "Jj";
        }
    }
}
