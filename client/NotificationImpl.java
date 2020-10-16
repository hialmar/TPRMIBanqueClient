package client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import partage.Notification;

/**
 * Classe qui affiche les notifications
 * @author torguet
 *
 */
public class NotificationImpl extends UnicastRemoteObject implements Notification {

	/**
	 * constructeur vide
	 * @throws RemoteException : s'il y a un problème avec l'interface
	 */
	protected NotificationImpl() throws RemoteException {
		super();
	}

	/**
	 * Méthode qui affiche la notification transmise par le serveur
	 * @param message : message de notification
	 * @throws RemoteException  : s'il y a un problème avec RMI
	 */
	@Override
	public void notifier(String message) throws RemoteException {
		// on fait un simple affichage
		System.out.println(message);
	}

}
