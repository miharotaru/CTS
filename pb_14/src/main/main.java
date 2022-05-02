package main;

import template.MijlocTransortPeSine;
import template.Tramvai;

public class main {
    public static void main(String[] args) {
        MijlocTransortPeSine tramvai1= new Tramvai();
        tramvai1.parcurgereTraseuInSensInvers();
        System.out.println("=================");
        tramvai1.parcurgereTraseuInSensNormal();

        // nu merge sa fac tramvai1.opreste in statie2
    }
}
