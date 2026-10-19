package com.edu.ec.negocio;

public class Notificador {

    public void enviar(String correo, String asunto, String cuerpo) {

        System.out.println("\n-----NOTIFICACION DEL PEDIDO-----");
        System.out.println("Destinatario: " + correo);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + cuerpo);
        System.out.println("Notificacion preparada.");
    }

}
