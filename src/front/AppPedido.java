package front;

import entidades.Cliente;
import entidades.Pedido;
import entidades.Pizza;
import entidades.Atendente;
import persistencia.ClientePersistencia;
import persistencia.PedidoPersistencia;
import persistencia.PizzaPersistencia;
import persistencia.AtendentePersistencia;

public class AppPedido {
    public AppPedido() {
        int opc;
        do {
            System.out.println("\n\n*** PIZZARIA ***");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Consultar pedidos");
            System.out.println("3 - Sair");
            opc = Console.readInt("Opção: ");
            switch (opc) {
                case 1:
                    fazerPedido();
                    break;
                case 2:
                    break;
            }
        } while (opc != 3);
    }

    private static void fazerPedido() {
        System.out.println("\n\n*** FAZER PEDIDO ***");
        Pedido pedido = new Pedido();

        // Obter informações do cliente
        Cliente objCliente = new Cliente();
        objCliente.setNome(Console.readString("Informe o nome do cliente: "));
        if (ClientePersistencia.procurarPorNome(objCliente) == null) {
            System.out.println("Cliente não cadastrado. Faça o cadastro antes de fazer um pedido.");
            return;
        }
        pedido.setCliente(objCliente);
        
     // Obter informações do atendente
        Atendente objAtendente = new Atendente();
        objAtendente.setNome(Console.readString("Informe o nome do atendente: "));
        if (AtendentePersistencia.procurarPorNome(objAtendente) == null) {
            System.out.println("Atendente não cadastrado. Verifique o nome informado.");
            return;
        }
        pedido.setAtendente(objAtendente);
        
        // Obter informações da pizza
   
        Pizza objPizza = new Pizza();
        objPizza.setSabor(Console.readString("Informe o sabor da pizza: ")); 
        if (PizzaPersistencia.procurarPorSabor(objPizza) == null) {
            System.out.println("Pizza não encontrada. Verifique o sabor informado.");
            return;
        }
        pedido.setPizza(objPizza);

        // Obter informações do pedido (aqui eu peguei o exemplo no ChatGPT)
        int quantidade = Console.readInt("Informe a quantidade: ");
        pedido.setQuantidade(quantidade);
        String tamanho = Console.readString("Informe o tamanho: ");
        pedido.setTamanho(tamanho);

        // Salvar o pedido no banco de dados
        if (PedidoPersistencia.incluir(pedido)) {
            System.out.println("\n\nPedido realizado com sucesso!");
        } else {
            System.out.println("\n\nFalha ao realizar o pedido.");
        }
    }

}
