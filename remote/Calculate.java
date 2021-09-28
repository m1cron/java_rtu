package ru.gerch.homework_2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculate extends Remote {

    Result calculate(int a, int b, int c) throws RemoteException;

}