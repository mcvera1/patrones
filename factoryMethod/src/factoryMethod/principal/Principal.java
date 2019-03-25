package factoryMethod.principal;

import factoryMethod.concreteCreator.Cliente;
import factoryMethod.subclasesConcretas.ClienteContado;
import factoryMethod.subclasesConcretas.ClienteCredito;

public class Principal {
    public static void main(String[] args){
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);
    }
}
