package model;

import javax.swing.JOptionPane;

public class FiguraGeometrica {

    private String cor;

    public FiguraGeometrica() {
        this("");
    }

    public FiguraGeometrica(String cor) {
        setCor(cor);
    }

    /**
     * Método que retorna a cor da figura geométrica
     *
     * @return String
     */
    public String getCor() {
        return cor;
    }

    /**
     * Método que modifica a cor da figura geométrica
     *
     * @param cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void leitura() {
        setCor(JOptionPane.showInputDialog("Digite a Cor"));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "A cor é " + getCor());
    }

    public String paraString() {
        return ("Cor : " + getCor());
    }
}
