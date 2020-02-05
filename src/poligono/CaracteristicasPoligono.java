/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class CaracteristicasPoligono extends Poligono {

    private int centenasDeLado, dezenasDeLado, unidadesDeLado;
    private String conjuncao, sufixo;
    private ArrayList<String> designativosAteDezenove = new ArrayList<>();
    private ArrayList<String> designativoUnidades = new ArrayList<>();
    private ArrayList<String> designativoDezenas = new ArrayList<>();
    private ArrayList<String> designativoDezenasInteiras = new ArrayList<>();
    private ArrayList<String> designativoCentenas = new ArrayList<>();
    private ArrayList<String> designativoCentenasInteiras = new ArrayList<>();

    private int getCentenasDeLado() {
        return centenasDeLado;
    }

    private void setCentenasDeLado(int centenasDeLado) {
        this.centenasDeLado = centenasDeLado;
    }

    private int getDezenasDeLado() {
        return dezenasDeLado;
    }

    private void setDezenasDeLado(int dezenasDeLado) {
        this.dezenasDeLado = dezenasDeLado;
    }

    private int getUnidadesDeLado() {
        return unidadesDeLado;
    }

    private void setUnidadesDeLado(int unidadesDeLado) {
        this.unidadesDeLado = unidadesDeLado;
    }

    private String getConjuncao() {
        return conjuncao;
    }

    private void setConjuncao(String conjuncao) {
        this.conjuncao = conjuncao;
    }

    private String getSufixo() {
        return sufixo;
    }

    private void setSufixo(String sufixo) {
        this.sufixo = sufixo;
    }

    private ArrayList<String> getDesignativosAteDezenove() {
        return designativosAteDezenove;
    }

    private void setDesignativosAteDezenove(ArrayList<String> designativosAteDezenove) {
        this.designativosAteDezenove = designativosAteDezenove;
    }

    private ArrayList<String> getDesignativoUnidades() {
        return designativoUnidades;
    }

    private void setDesignativoUnidades(ArrayList<String> designativoUnidades) {
        this.designativoUnidades = designativoUnidades;
    }

    private ArrayList<String> getDesignativoDezenas() {
        return designativoDezenas;
    }

    private void setDesignativoDezenas(ArrayList<String> designativoDezenas) {
        this.designativoDezenas = designativoDezenas;
    }

    private ArrayList<String> getDesignativoDezenasInteiras() {
        return designativoDezenasInteiras;
    }

    private void setDesignativoDezenasInteiras(ArrayList<String> designativoDezenasInteiras) {
        this.designativoDezenasInteiras = designativoDezenasInteiras;
    }

    private ArrayList<String> getDesignativoCentenas() {
        return designativoCentenas;
    }

    private void setDesignativoCentenas(ArrayList<String> designativoCentenas) {
        this.designativoCentenas = designativoCentenas;
    }

    private ArrayList<String> getDesignativoCentenasInteiras() {
        return designativoCentenasInteiras;
    }

    private void setDesignativoCentenasInteiras(ArrayList<String> designativoCentenasInteiras) {
        this.designativoCentenasInteiras = designativoCentenasInteiras;
    }

    public CaracteristicasPoligono() {
        this.designativosAteDezenove.add("triangulo");
        this.designativosAteDezenove.add("quadrilátero");
        this.designativosAteDezenove.add("pentágono");
        this.designativosAteDezenove.add("hexágono");
        this.designativosAteDezenove.add("heptágono");
        this.designativosAteDezenove.add("octógono");
        this.designativosAteDezenove.add("eneágono");
        this.designativosAteDezenove.add("decágono");
        this.designativosAteDezenove.add("undecágono");
        this.designativosAteDezenove.add("dodedecágono");
        this.designativosAteDezenove.add("triadecágono");
        this.designativosAteDezenove.add("tetradecágono");
        this.designativosAteDezenove.add("pentadecágono");
        this.designativosAteDezenove.add("hexadecágono");
        this.designativosAteDezenove.add("heptadecágono");
        this.designativosAteDezenove.add("octadecágono");
        this.designativosAteDezenove.add("eneadecágono");

        this.designativoUnidades.add("hena");
        this.designativoUnidades.add("di");
        this.designativoUnidades.add("tri");
        this.designativoUnidades.add("tetra");
        this.designativoUnidades.add("pent");
        this.designativoUnidades.add("hexa");
        this.designativoUnidades.add("hepta");
        this.designativoUnidades.add("octa");
        this.designativoUnidades.add("enea");

        this.conjuncao = "kai";

        this.designativoDezenas.add("icosi");
        this.designativoDezenas.add("triacon");
        this.designativoDezenas.add("tetraconta");
        this.designativoDezenas.add("pentaconta");
        this.designativoDezenas.add("hexaconta");
        this.designativoDezenas.add("heptaconta");
        this.designativoDezenas.add("octaconta");
        this.designativoDezenas.add("eneaconta");

        this.designativoDezenasInteiras.add("icoságono");
        this.designativoDezenasInteiras.add("triacontágono");
        this.designativoDezenasInteiras.add("tetracontágono");
        this.designativoDezenasInteiras.add("pentacontágono");
        this.designativoDezenasInteiras.add("hexacontágono");
        this.designativoDezenasInteiras.add("heptacontágono");
        this.designativoDezenasInteiras.add("octacontágono");
        this.designativoDezenasInteiras.add("eneacontágono");

        this.designativoCentenas.add("hecta");
        this.designativoCentenas.add("dihecta");
        this.designativoCentenas.add("trihecta");
        this.designativoCentenas.add("tetratrihecta");
        this.designativoCentenas.add("pentahecta");
        this.designativoCentenas.add("hexahecta");
        this.designativoCentenas.add("heptahecta");
        this.designativoCentenas.add("octahecta");
        this.designativoCentenas.add("eneahecta");

        this.designativoCentenasInteiras.add("hectágono");
        this.designativoCentenasInteiras.add("dihectágono");
        this.designativoCentenasInteiras.add("trihectágono");
        this.designativoCentenasInteiras.add("tetrahectágono");
        this.designativoCentenasInteiras.add("pentahectágono");
        this.designativoCentenasInteiras.add("hexahectágono");
        this.designativoCentenasInteiras.add("heptahectágono");
        this.designativoCentenasInteiras.add("octahectágono");
        this.designativoCentenasInteiras.add("eneahectágono");

        this.sufixo = "gono";
    }

    private void decopoeLados() {
        int numeroDeLadosCopia = getNumeroDeLados();
        setCentenasDeLado((int) numeroDeLadosCopia / 100);
        numeroDeLadosCopia -= getCentenasDeLado() * 100;//subtrai as centenas, deixando somente as casas decimal e unidade
        setDezenasDeLado((int) numeroDeLadosCopia / 10);
        numeroDeLadosCopia -= getDezenasDeLado() * 10;//subtrai as dezenas, deixando somente a casa das unidades
        setUnidadesDeLado(numeroDeLadosCopia);
    }

    private String findDesignativoUnidade() {
        return getDesignativoUnidades().get(getUnidadesDeLado() - 1);
    }

    private String findDesignativoDezena() {
        return getDesignativoDezenas().get(getDezenasDeLado() - 2);
    }

    private String findDesignativoDezenaInteira() {
        return getDesignativoDezenasInteiras().get(getDezenasDeLado() - 2);
    }

    private String findDesignativoAteDezenove() {
        return getDesignativosAteDezenove().get((getDezenasDeLado() * 10) + getUnidadesDeLado() - 3);
    }

    private String findDesignativoCentenas() {
        return getDesignativoCentenas().get(getCentenasDeLado() - 1);
    }

    private String findDesignativoCentenaInteira() {
        return getDesignativoCentenasInteiras().get(getCentenasDeLado() - 1);
    }

    private void atribuiNomePoligono() {
        if (getNumeroDeLados() >= 3 && getNumeroDeLados() < 1000) { //somente são poligonos formas geométricas com 3 ou mais lados
            if (getCentenasDeLado() > 0) {//se existir mais de cem lados, faz a composição com os designativos de centenas 
                if (getDezenasDeLado() > 0 || getUnidadesDeLado() > 0) {//se não é centena inteira
                    if (getDezenasDeLado() > 1) {//se são mais de 20 lados
                        if (getUnidadesDeLado() > 0) { //se existem unidades
                            setNomePoligono(findDesignativoCentenas() + getConjuncao() + findDesignativoDezena() + getConjuncao() + findDesignativoUnidade() + getSufixo());
                        } else {
                            setNomePoligono(findDesignativoCentenas() + getConjuncao() + findDesignativoDezenaInteira());
                        }
                    } else {
                        if (getDezenasDeLado() == 1) {
                            setNomePoligono(findDesignativoCentenas() + findDesignativoAteDezenove());
                        } else {
                            setNomePoligono(findDesignativoCentenas() + getConjuncao() + findDesignativoUnidade() + getSufixo());
                        }
                    }
                } else {//se é centena inteira
                    setNomePoligono(findDesignativoCentenaInteira());
                }
            } else {//se não existe mais de 100 lados
                if (getDezenasDeLado() > 1) {//se existe mais de 20 lados
                    if (getUnidadesDeLado() > 0) {//se existem unidades
                        setNomePoligono(findDesignativoDezena() + getConjuncao() + findDesignativoUnidade() + getSufixo());
                    } else {//se são dezenas inteiras
                        setNomePoligono(findDesignativoDezenaInteira());
                    }
                } else {//se é menor que dezenove lados
                    setNomePoligono(findDesignativoAteDezenove());
                }
            }
        }
    }

    public void defineCaracteristicas() {
        decopoeLados();
        atribuiNomePoligono();
        calculaPerimetro();
        calculaArea();
    }

    private void calculaPerimetro() {
        setPerimetro(getNumeroDeLados() * getComprimentoLado());
    }

    private void calculaArea() {
        double apotema;
        calculaPerimetro();
        apotema = (getComprimentoLado() / 2) / (Math.tan(Math.PI / 180 * ((double) 360 / (getNumeroDeLados() * 2))));
        setArea((apotema * getPerimetro()) / 2);
    }
}
