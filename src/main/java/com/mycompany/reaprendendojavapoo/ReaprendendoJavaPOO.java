package com.mycompany.reaprendendojavapoo;
public class ReaprendendoJavaPOO {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 95;
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
