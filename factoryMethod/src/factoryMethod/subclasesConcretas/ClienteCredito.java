package factoryMethod.subclasesConcretas;

import factoryMethod.abstractClass.Pedido;
import factoryMethod.concreteCreator.Cliente;

public class ClienteCredito extends Cliente {
	
	protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}
