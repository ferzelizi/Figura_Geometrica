package com.sovos.figurageometrica.figuras;

import com.sovos.figurageometrica.interfaces.FiguraGeometricaDefault;

public class Ponto implements FiguraGeometricaDefault {

    private String descrição = ("O ponto é um objeto que não possui definição, dimensão e forma. Por isso,\n" +
            " é impossível encontrar qualquer medida nele, como comprimento, largura, altura, área,\n" +
            " volume etc. O ponto é a base de toda a Geometria, pois é a partir de conjuntos deles que\n" +
            "são formadas as figuras geométricas.");

    @Override
    public String getNomeFigura() {
        return "ponto";
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getPerimetro() {
        return 0;
    }

    public String getDescrição() {
        return descrição;
    }

    public String setDescrição(String descrição) {
        return descrição;

    }

    @Override
    public void getRetornaNada() {



    }
}
