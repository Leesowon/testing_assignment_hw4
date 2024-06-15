package org.example;

public class Flipper implements IFlipper {
    @Override
    public int flip(int a) {
        return -a;
    }
}