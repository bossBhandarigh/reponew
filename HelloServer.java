import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.*;

public class HelloServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("server is ready");
        Socket s = ss.accept();
        InputStream istream = s.getInputStream();
        DataInputStream dis = new DataInputStream(istream);
        String s1 = dis.readLine();
        System.out.println(s1);
        dis.close();
        istream.close();
        s.close();
        ss.close();
    }
}
