import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by fabio on 13/08/15.
 */
public class ServerHttp {
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            String row;
            while((row = in.readLine()).length() > 0){
                System.out.println(row);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
