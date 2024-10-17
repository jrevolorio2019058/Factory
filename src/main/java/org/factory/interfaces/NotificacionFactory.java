package main.java.org.factory.interfaces;

import main.java.org.factory.notificacion.AppNotificacion;
import main.java.org.factory.notificacion.EmailNotificacion;
import main.java.org.factory.notificacion.SMSNotificacion;

public interface NotificacionFactory {

    EmailNotificacion crearEmailNotificacion();
    SMSNotificacion crearSMSNotificacion();
    AppNotificacion crearAppNotificacion();

}
