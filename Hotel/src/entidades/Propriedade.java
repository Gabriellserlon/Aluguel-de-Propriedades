package entidades;

import java.util.ArrayList;

public abstract class Propriedade {

    private String endereco;
    private int numQuartos;
    private int numBanheiros;
    private float valor;
    private String descricao;
    private String foto;
    private Proprietario proprietario;
    private ArrayList reservas;
    private ArrayList avaliacoes;
    private Boolean disponibilidade;

    public Propriedade(Proprietario proprietario, String endereco, int numQuartos, int numBanheiros, float valor, String descricao, String foto) {
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.valor = valor;
        this.descricao = descricao;
        this.foto = foto;
        this.disponibilidade = disponibilidade;
        this.proprietario = proprietario;
        this.reservas = new ArrayList();
        this.avaliacoes = new ArrayList();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getNumBanheiros() {
        return numBanheiros;
    }

    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public ArrayList getReservas() {
        return reservas;
    }

    public void setReservas(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public ArrayList getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
