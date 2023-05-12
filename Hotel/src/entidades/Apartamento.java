package entidades;

public class Apartamento extends Propriedade {

    private int andar;
    private Boolean areaExterna;
    private float tamanho;

    public Apartamento(Proprietario proprietario, String endereco, int numQuartos, int numBanheiros, float valor, String descricao, int andar, Boolean areaExterna, float tamanho, String foto) {
        super(proprietario, endereco, numQuartos, numBanheiros, valor, descricao, foto);
        this.andar = andar;
        this.areaExterna = areaExterna;
        this.tamanho = tamanho;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public Boolean getAreaExterna() {
        return areaExterna;
    }

    public void setAreaExterna(Boolean areaExterna) {
        this.areaExterna = areaExterna;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
}
