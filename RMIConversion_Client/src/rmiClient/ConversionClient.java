package rmiClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmiservice.Iconversion;

public class ConversionClient {

	public static void main(String[] args)  {
		Iconversion stub;
		try {
			stub = (Iconversion)Naming.lookup("rmi://localhost:1099/ObjetDistant");
			//res mt3ha remote je vais caster de la classe mére 
			System.out.println(stub.convertirMontant(700.00));
			System.out.println(stub.convertirMontant(1050.00));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
