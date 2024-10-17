package main.java.org.factory.notificacion;

import main.java.org.factory.interfaces.Notificacion;

public class SMSNotificacion implements Notificacion {

    private String prioridad;

    public SMSNotificacion(String prioridad) {

        this.prioridad = prioridad;

    }

    public void enviarMensaje(String mensaje) {

        System.out.println("Estado: " + prioridad);

        System.out.println("Mensaje enviado por SMS");

    }

}
