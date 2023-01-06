package com.mycompany.reaprendendojavapoo;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        if(tampada == true){
            System.out.println("É uma caneta da cor " + this.cor + " com a ponta " + ponta + " com carga de " + carga + "% e está tampada");
        }else{
            System.out.println("É uma caneta da cor " + this.cor + " com a ponta " + ponta + " com carga de " + carga + "% e está destampada");
        }
        
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não é possível rabiscar tampado");
        }else{
            System.out.println("Rabiscado");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
