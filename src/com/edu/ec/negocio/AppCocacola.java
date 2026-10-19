package com.edu.ec.negocio;


public class AppCocacola {
public static void main(String[] args) throws Exception {
     PedidoBebida pedido = new PedidoBebida(
                "PED-001",
                "Gabriel Piña",
                "gdpina@uce.edu.ec",
                "Coca-Cola de 3 litros",
                4,
                3.00
        );

        GestionPedidos gestionPedidos = new GestionPedidos();

        gestionPedidos.realizar(pedido);

        pedido = null;
        gestionPedidos = null;
}

}