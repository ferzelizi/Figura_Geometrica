package com.sovos.figurageometrica.main;

import com.sovos.figurageometrica.figuras.*;



public class Init {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        System.out.println("O " + quadrado.getNomeFigura() + " tem: ");
        System.out.println(quadrado.getArea() + " de área");
        System.out.println(quadrado.getPerimetro() + " de perímetro");
        System.out.println(quadrado.getLado() + " lados" );
        quadrado.getRetornaNada();

        System.out.println("********************************************************************");


        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(1);
        triangulo.setLadoB(1);
        triangulo.setLadoC(1);
        triangulo.setBase(2);
        triangulo.setAltura(3);
        System.out.println("O " + triangulo.getNomeFigura() + " tem: ");
        System.out.println(triangulo.getArea() + " de área");
        System.out.println(triangulo.getPerimetro() + " de perímetro");
        System.out.println(triangulo.getLadoA() + triangulo.getLadoB() + triangulo.getLadoC() +  " lados" );
        triangulo.getRetornaNada();

        System.out.println("********************************************************************");


        Circulo circulo = new Circulo();
        System.out.println("O " + circulo.getNomeFigura() + " tem: ");
        System.out.println(circulo.getArea() + " de área");
        System.out.println(circulo.getPerimetro() + " de perímetro ");
        circulo.getRetornaNada();

        System.out.println("********************************************************************");


        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(1);
        cilindro.setAreaBase(2);
        cilindro.setAreaLateral(3);
        cilindro.setAreaTotal(4);
        System.out.println(cilindro.getNomeFigura() + " tem: ");
        System.out.println(cilindro.getArea() + " de área");
        System.out.println(cilindro.getPerimetro() + " de perímetro" );
        cilindro.getRetornaNada();

        System.out.println("********************************************************************");



        Ponto ponto = new Ponto();
        System.out.println(ponto.getNomeFigura() + " tem: ");
        System.out.println(ponto.getArea() + " de área");
        System.out.println(ponto.getPerimetro() + " de perímetro" );
        System.out.println(ponto.getDescrição() );
        ponto.getRetornaNada();
   }
}
