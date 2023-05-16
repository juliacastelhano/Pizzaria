package entidades;

public class Atendente {

    private int idAtendente;
    private String nome;



    public Atendente(int idAtendente, String nome) {
        this.idAtendente = idAtendente;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdAtendente() {
        return idAtendente;
    }
    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }
}
