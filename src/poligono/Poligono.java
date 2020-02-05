/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

/**
 *
 * @author leona
 */
public abstract class Poligono {
    private int numeroDeLados;
    private double comprimentoLado;
    private double area;
    private double perimetro;

    public double getComprimentoLado() {
        return comprimentoLado;
    }

    public void setComprimentoLado(double comprimentoLado) {
        this.comprimentoLado = comprimentoLado;
    }
    private String nomePoligono;

    public String getNomePoligono() {
        return nomePoligono;
    }

    public void setNomePoligono(String nomePoligono) {
        this.nomePoligono = nomePoligono;
    }

    public int getNumeroDeLados() {
        return numeroDeLados;
    }

    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
}
