package main.java.org.factory;

import main.java.org.factory.interfaces.NotificacionFactory;
import main.java.org.factory.notificacion.AppNotificacion;
import main.java.org.factory.notificacion.EmailNotificacion;
import main.java.org.factory.notificacion.NotificacionFactoryCreator;
import main.java.org.factory.notificacion.SMSNotificacion;

public class Main {
    public static void main(String[] args) {

        NotificacionFactory factory = NotificacionFactoryCreator.crearFactory("REGULAR");

        EmailNotificacion email = factory.crearEmailNotificacion();
        SMSNotificacion sms = factory.crearSMSNotificacion();
        AppNotificacion app = factory.crearAppNotificacion();

        email.enviarMensaje("email");
        sms.enviarMensaje("sms");
        app.enviarMensaje("app");

    }
}