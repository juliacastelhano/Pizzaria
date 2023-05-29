package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Pedido;

public class PedidoPersistencia {
	public static boolean incluir(Pedido pedido){
		try{
			EntityManager manager = EntityManagerFactory.getInstance();
			manager.getTransaction().begin();
			manager.persist(pedido);
			manager.getTransaction().commit();	
			return true;			
		}
		catch(Exception e){
			return false;
		}
	}
	public static Pedido consultarPedidos(Pedido pedido) {
		EntityManager manager = EntityManagerFactory.getInstance();
		Query consulta = manager.createQuery("from Conta where numeroAgencia = :paramAgencia and numeroConta = :paramConta");
		consulta.setParameter("paramId", pedido.getId());
		consulta.setParameter("paramQuantidade", pedido.getQuantidade());
		List<Pedido> pedidos = consulta.getResultList();
		if(!pedidos.isEmpty()){
			return pedidos.get(0);
		}
		return null;
	}
}

