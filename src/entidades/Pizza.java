package entidades;
public class Pizza {
    
    private int idPizza;
    private String sabor;
    private String tamanho;
    private float preco;
    private int quantidade;

    public Pizza(int idPizza, String sabor, String tamanho, float preco, int quantidade) {
        this.idPizza = idPizza;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public int getIdPizza() {
        return idPizza;
    }
    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    
}
