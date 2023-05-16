package entidades;
public class Pedido {
    
    private int idPedido;
    private Atendente atendente;
    private Cliente cliente;
    private Pizza pizza;
    private float totalPedido;

    public Pedido(int idPedido, Atendente atendente, Cliente cliente, Pizza pizza, float totalPedido) {
        this.idPedido = idPedido;
        this.atendente = atendente;
        this.cliente = cliente;
        this.pizza = pizza;
        this.totalPedido = totalPedido;
    }
    
    public Atendente getAtendente() {
        return atendente;
    }
    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public Pizza getPizza() {
        return pizza;
    }
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    public float getTotalPedido() {
        return totalPedido;
    }
    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }

    
}
