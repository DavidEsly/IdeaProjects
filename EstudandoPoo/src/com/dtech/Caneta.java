package com.dtech;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada = false;

    public void status(){
        //O this serve para chamar a variável que instanciou o objeto
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? "+this.tampada);
    }

    public  void rabiscar(){
        if(this.tampada == true){
            System.out.print("Não foi possível rabiscar, caneta tampada");
        }else{
            System.out.print("Rabiscado");
        }
    }

    public  void tampar(){
        //this referencia ao objeto que chamou
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
