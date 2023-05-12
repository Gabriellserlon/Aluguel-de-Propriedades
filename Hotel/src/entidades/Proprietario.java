package entidades;

import java.util.ArrayList;

public class Proprietario extends Usuario {

    private int numPropriedades;
    private int vendas;
    private Propriedade propriedade;
    private ArrayList propriedadesAlugadas;

    public Proprietario(String nome, String email, String telefone, String genero, int idade, int numPropriedades) {
        super(nome, email, telefone, genero, idade);
        this.numPropriedades = numPropriedades;
        this.vendas = vendas;
        this.propriedade = propriedade;
        this.propriedadesAlugadas = new ArrayList();
    }

    public int getNumPropriedades() {
        return numPropriedades;
    }

    public void setNumPropriedades(int numPropriedades) {
        this.numPropriedades = numPropriedades;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void alterarNumPropriedade(int valor){
        if (valor > 0){
            this.numPropriedades = valor;
            System.out.println("Número de Propriedades no Sistema Alterado!");
        }else{
            System.out.println("Digite um valor válido!");
        }
    }
}
