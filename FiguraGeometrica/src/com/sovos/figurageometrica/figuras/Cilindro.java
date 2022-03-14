package com.sovos.figurageometrica.figuras;

import com.sovos.figurageometrica.interfaces.FiguraGeometricaDefault;

public class Cilindro implements FiguraGeometricaDefault {

    private double raio;
    private double areaBase;
    private double areaTotal;
    private double areaLateral;
    private double altura;
    @Override
    public String getNomeFigura() {
        return "cilindro";
    }

    @Override
    public int getArea() {
        return public int getArea() {
            areaBase = Math.PI + Math.pow(raio,2);
            areaLateral = 2*Math.PI * raio *altura;
            areaTotal =  2*Math.PI*raio*(altura+raio);
            return (int) areaTotal;
        };
    }

    @Override
    public int getPerimetro() {
        return 0;
    }

    @Override
    public void getRetornaNada() {

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
