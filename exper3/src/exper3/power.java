package exper3;
	//interface implementation
	import java.rmi.*;
	public interface power extends Remote
	{
	  //remote methods declaration
	public int pow(int a, int b) throws RemoteException;
	}