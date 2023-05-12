package entidades;

public class Avaliacao {
    private Nota nota;
    private String descricao;
    private Propriedade propriedade;
    private Hospede hospede;
    private Proprietario proprietario;
    private Avaliacao avaliacao;

    public void AvaliarPropriedade(Propriedade propriedade, Hospede hospede, Nota nota, String descricao){
        this.avaliacao = avaliacao;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.descricao = descricao;
        propriedade.setAvaliacoes(this.avaliacao);
        System.out.println("Avaliação feita!");
    }
    public void avaliarHospede(Hospede hospede, Proprietario proprietario, Nota nota, String descricao){
        this.avaliacao = avaliacao;
        this.descricao = descricao;
        this.nota = nota;
        this.proprietario = proprietario;
        hospede.setAvaliacoes(avaliacao);
    }
}
