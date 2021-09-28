package ru.gerch.homework_2;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteCalculateClient {
    public static final String UNIQUE_BINDING_NAME = "server.calculator";

    public static void main(String[] args) throws RemoteException, NotBoundException {
        final Registry registry = LocateRegistry.getRegistry(2732);

        Calculate calk = (Calculate) registry.lookup(UNIQUE_BINDING_NAME);

        System.out.println(calk.calculate(4, 5, -1));
    }
}