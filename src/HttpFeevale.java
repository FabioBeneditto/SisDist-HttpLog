/**
 * @author Fabio Beneditto
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HttpFeevale {

    public static void main(String[] args) {
	    try{
            Socket s = new Socket("www.feevale.br", 80);
            PrintWriter out = new PrintWriter(s.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out.println("GET / HTTP/1.0");
            out.println();
            out.flush();

            String row;
            while((row = in.readLine()) != null){
                System.out.println(row);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
