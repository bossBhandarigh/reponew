import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HelloClient {

    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost", 5000);
        String str1 = "hello server how do you do!";
        OutputStream ostream = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(ostream);
        dos.writeBytes(str1);
        dos.close();
        ostream.close();
        s.close();
    }
}
