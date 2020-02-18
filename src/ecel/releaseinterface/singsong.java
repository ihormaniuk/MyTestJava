package ecel.releaseinterface;

import ecel.interfacer.musicstyle;

import static PrintAndScanner.Print.print;

public class singsong implements musicstyle {
    @Override
    public void pop() {
        print("this pop");
    }

    @Override
    public void rock() {
        print("this rock");
    }

    @Override
    public void classic() {
        print("this classic");
    }
}
