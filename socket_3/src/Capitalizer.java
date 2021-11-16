import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class Capitalizer implements Runnable{
    private Socket socket;
    private List<Socket> list;
    private Timer t;
    private A a;

    public Capitalizer(Socket socket, List<Socket> list,A a,Timer timer) {
        t = timer;
        this.socket = socket;
        this.list = list;
        this.a = a;
    }

    @Override
    public void run() {
        System.out.println("Подключение: "+socket);
        try {
            var in = new Scanner(socket.getInputStream());//Тут получаем данные
           // тут отправляем данные
            TimerTask repeatedTask = new TimerTask() {
                public void run() {
                    if(!a.getList().isEmpty()){
                        for(Socket s: list){
                            PrintWriter out = null;
                            try {
                                out = new PrintWriter(s.getOutputStream(),true);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            out.println(a.getMess());
                        }
                        a.delMess();
                    }

                }
            };
            long delay = 0;
            long period = 5000;
            t.scheduleAtFixedRate(repeatedTask, delay, period);
            while (in.hasNextLine()){
                a.setMess(in.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
