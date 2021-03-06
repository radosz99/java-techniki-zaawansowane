package rmi.server;

import rmi.algorithms.IElement;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServer extends Remote {
    List<IElement> solve(List<IElement> list, String clientId) throws RemoteException, InterruptedException;
    void setActive(boolean active) throws RemoteException;
}
