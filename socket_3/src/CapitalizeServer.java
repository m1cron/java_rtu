import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.Executors;

public class CapitalizeServer {
    public static void main(String[] args) throws IOException {
        try(var listener = new ServerSocket(59898)) {
            System.out.println("Start server...");
            List<Socket> list = new ArrayList<>();
            Timer timer = new Timer();
            var pool = Executors.newFixedThreadPool(20);
            A a = new A();
            while (true){
                Socket s = listener.accept();
                list.add(s);
                pool.execute(new Capitalizer(s,list,a,timer));
                }
            }
        }

    }
