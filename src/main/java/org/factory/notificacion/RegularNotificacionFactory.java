package main.java.org.factory.notificacion;

import main.java.org.factory.interfaces.NotificacionFactory;

public class RegularNotificacionFactory implements NotificacionFactory {

    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion("REGULAR");
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion("REGULAR");
    }

    @Override
    public AppNotificacion crearAppNotificacion(){

        return new AppNotificacion("REGULAR");

    }

}
