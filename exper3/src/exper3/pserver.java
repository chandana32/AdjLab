package exper3;

//server implementation
import java.rmi.*;
import java.rmi.server.*;

public class pserver extends UnicastRemoteObject implements power{

public pserver() throws RemoteException{
  super();
}
public int pow(int a, int b) throws RemoteException{
  int y = (int)(Math.pow(a,b));
  return y;
}

public static void main(String args[]) throws Exception{
  pserver server = new pserver();
  System.out.println("RMI server is running..!!");
  Naming.rebind("server",server);
}

}