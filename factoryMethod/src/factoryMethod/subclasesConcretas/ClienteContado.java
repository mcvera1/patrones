package factoryMethod.subclasesConcretas;

import factoryMethod.abstractClass.Pedido;
import factoryMethod.concreteCreator.Cliente;

public class ClienteContado extends Cliente {
	
	protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
}
