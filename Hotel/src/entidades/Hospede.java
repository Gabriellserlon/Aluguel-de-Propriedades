package entidades;

import java.util.ArrayList;

public class Hospede extends Usuario {

    private ArrayList propriedadesFavoritas;
    private ArrayList avaliacoes;

    public Hospede(String nome, String email, String telefone, String genero, int idade) {
        super(nome, email, telefone, genero, idade);
        this.propriedadesFavoritas = new ArrayList();
        this.avaliacoes = new ArrayList();
    }

    public ArrayList getPropriedadesFavoritas() {
        return propriedadesFavoritas;
    }

    public void adicionarFavoritos(Propriedade propriedade) {
        this.propriedadesFavoritas.add(propriedade);
    }
    public void removerFavoritos(Propriedade propriedade){
        this.propriedadesFavoritas.remove(propriedade);
    }

    public void setPropriedadesFavoritas(ArrayList propriedadesFavoritas) {
        this.propriedadesFavoritas = propriedadesFavoritas;
    }

    public ArrayList getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }
}
