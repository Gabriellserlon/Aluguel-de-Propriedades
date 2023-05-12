package entidades;

public class Casas extends Propriedade {

    private float tamanho;

    public Casas(Proprietario proprietario, String endereco, int numQuartos, int numBanheiros, float valor, String descricao, float tamanho, String foto) {
        super(proprietario, endereco, numQuartos, numBanheiros, valor, descricao, foto);
        this.tamanho = tamanho;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
}
