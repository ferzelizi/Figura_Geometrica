package com.sovos.figurageometrica.figuras;
import java.lang.Math.*;

import com.sovos.figurageometrica.interfaces.FiguraGeometricaDefault;

public class Circulo implements FiguraGeometricaDefault {

    private double raio = 30;



    @Override
    public String getNomeFigura() {
        return "circulo";
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * (Math.sqrt(raio)));
    }

    @Override
    public int getPerimetro() {
        return (int) (2*(Math.PI ) * raio);
    }

    @Override
    public void getRetornaNada() {

    }


}

