import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CapitalizeClient2 {
    public static void main(String[] args) throws IOException {

        try(var socket = new Socket("localhost",59898)) {
            System.out.println("Char active");
            var scanner = new Scanner(System.in);
            var out = new PrintWriter(socket.getOutputStream(),true);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        var in  = new Scanner(socket.getInputStream());
                        while (true){
                            if(in.hasNextLine()){
                                System.out.println(in.nextLine());
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
            while ( scanner.hasNextLine()){
                out.println(scanner.nextLine());
            }

        }
    }
}