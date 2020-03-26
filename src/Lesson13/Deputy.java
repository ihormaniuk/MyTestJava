package Lesson13;

import java.util.Scanner;

import static PrintAndScanner.Print.print;

public class Deputy extends Human implements Comparable <Deputy> {

    private String surname;
    private String name;
    private int age;
    private boolean bribery;
    private int bribeSize;


    public Deputy(String surname,String name,int age,boolean bribery,int weight,int height){
        super(weight,height);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.bribery = bribery;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribery() {
        return bribery;
    }

    public void setBribery(boolean bribery) {
        this.bribery = bribery;
    }

    public int getBribeSize() {
        return bribeSize;
    }

    public void setBribeSize(int bribeSize) {
        this.bribeSize = bribeSize;
    }

    public String toBribeToString(){
        if(this.bribery){
            return "Хабарник";
        }else {
            return "Чесна Людина";
        }
    }

    public void toBribe() {
        if (this.bribery == false) {
            System.out.println("Цей депутат не бере хабарів");
        }

        if (this.bribery == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Ведіть суму хабара ");
            int bribeAmount = scanner.nextInt();

            if (bribeAmount > 5000) {
                System.out.println("Миліція увязнить депутата");
            } else {
                this.bribeSize = bribeAmount;
            }
        }
    }

//    public void toBribe(){
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        if(bribery=false){
//            print("Цей депутат не бере хабарів");
//        }else if(size<=5000){
//            print("Цей депутат взяв хабара на суму : " + size);
//            size = bribeSize;
//        }else if(size>=5000){
//            print("Миліція увязнить депутата");
//        }
//    }

    public String toString(){
        return " Фамілія : " + surname + "," + " Імя : " + name + "\n" +
                " Вік : " + age + " , " + " Вага : " + super.getWeight() + " , " + " Ріст : " + super.getHeight() + "\n" +
                toBribeToString();
    }

    @Override
    public int compareTo(Deputy o) {
        if(this.getBribeSize() == o.getBribeSize()){
            return 0;
        }else if(this.getBribeSize() < o.getBribeSize()){
            return -1;
        }else {
            return 1;
        }
    }
}
