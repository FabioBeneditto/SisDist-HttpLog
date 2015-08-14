import java.net.ServerSocket;

/**
 * Created by fabio on 13/08/15.
 */
public class ServerHttp {
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(8080);
            ss.accept();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
