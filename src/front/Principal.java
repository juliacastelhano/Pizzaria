package front;
public class Principal {
    public static void main(String[] args) {
    	int opc;
		do{
			System.out.println("\n\n");
			System.out.println("*** MENU ***");
			System.out.println("1 - Cliente");
			System.out.println("2 - Atendente");
			System.out.println("3 - Pedido");
			System.out.println("4 - Finalizar");
			opc = Console.readInt("Opção: ");
			switch(opc){
				case 1:
					new AppCliente();
					break;
				case 2:
					new AppAtendente();
					break;
				case 3:
					break;
			}
		}while(opc != 4);
	}
        
    }
