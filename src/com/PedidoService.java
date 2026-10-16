package com;

public class PedidoService {
    
public void realizar(Pedido pedido){
 
        System.out.println("Realizando pedido...");
 
        System.out.println("Pedido realizado al cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
 
        System.out.println("Pedido realizado con exito.");
 
        MailService mailService =  new MailService(); //Creamos manualmente el obejto de la clase MailService
 
        String asunto = "Configuración de pedido.";
        String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de " + "'" + pedido.getProducto() + "'" +
        " por un total de $" + pedido.getTotal() + " ha sido realizado con éxito.";
 
        mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
 
        mailService = null; //Hace que el objeto sea elegido por el GC
 
    }
 
}