package main.java.org.factory.notificacion;

import main.java.org.factory.interfaces.NotificacionFactory;

public class UrgenteNotificacion implements NotificacionFactory {

    @Override
    public EmailNotificacion crearEmailNotificacion() {

        return new EmailNotificacion("URGENTE");

    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion("URGENTE");
    }

    @Override
    public AppNotificacion crearAppNotificacion() {

        return new AppNotificacion("URGENTE");

    }

}
