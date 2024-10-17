package main.java.org.factory.notificacion;

import main.java.org.factory.interfaces.NotificacionFactory;

public class NotificacionFactoryCreator {

    public static NotificacionFactory crearFactory(String tipo){

        switch(tipo.toUpperCase()){

            case "URGENTE":

                return new UrgenteNotificacion();

            case "REGULAR":

                return new RegularNotificacionFactory();

            default:

                throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);

        }

    }

}
