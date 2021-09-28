package ru.gerch.homework_2;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RemoteCalculateServer extends UnicastRemoteObject implements Calculate {

    protected RemoteCalculateServer() throws RemoteException {
        super();
    }

    @Override
    public Result calculate(int a, int b, int c) throws RemoteException {
        double temp = Math.pow(b, 2) - (4 * a * c);
        double result1 = (-b + Math.sqrt(temp)) / (2 * a);
        double result2 = (-b - Math.sqrt(temp)) / (2 * a);
        return new Result(result1, result2);
    }

    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(2732);
        registry.rebind("server.calculator", new RemoteCalculateServer());
        System.out.println("server ready");
    }
}
