package Lessons14;

public class lessons14 implements Comparable<lessons14> {
    private String s;
    private int i;

    public lessons14(){

    }

    public lessons14(String s,int i){
        this.s=s;
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString(){
        return " int : " + i + " , " + " String : " + s;
    }
    @Override
    public int compareTo(lessons14 o) {
        return this.s.compareTo(o.getS());
    }
}
