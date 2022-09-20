package com.fdmgroup.Generics;

public class GenericClass <T extends Number>{
    private T var1;
//    private V car2;
//
//    public V getCar2() {
//        return car2;
//    }
//
//    public void setCar2(V car2) {
//        this.car2 = car2;
//    }

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }
}
