package com.edu.ec.negocio;


public class GestionPedidos {

    Notificador notificador = new Notificador();

    public void realizar(PedidoBebida pedido) {

        double subtotal = pedido.getCantidad() * pedido.getPrecioUnitario();

        System.out.println("-----PEDIDO COCA-COLA-----");
        System.out.println("Pedido: " + pedido.getNumero());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Cantidad: " + pedido.getCantidad());

        System.out.printf("Precio unitario: $%.2f%n", pedido.getPrecioUnitario());
        System.out.printf("Total del pedido: $%.2f%n", subtotal);

        String asunto = "Confirmacion del pedido " + pedido.getNumero();

        String cuerpo = "Estimado "
                + pedido.getCliente()
                + ", su pedido de "
                + pedido.getCantidad()
                + " unidades de "
                + pedido.getProducto()
                + " por un total de $"
                + String.format("%.2f", subtotal)
                + " ha sido registrado.";

        notificador.enviar(pedido.getCorreo(), asunto, cuerpo);
        notificador = null;
    }
}

