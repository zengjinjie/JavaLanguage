import java.io.IOException;
import java.net.InetAddress;

/**
 * Created by zengjinjie on 2017/4/17 0017.
 */
public class InetAddressTest {
    public static void main(String[] args) throws IOException {
        if(args.length > 0) {
            String host = args[0];
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for (InetAddress a : addresses) {
                System.out.println(a);
            }
            byte[] addressByetes = addresses[0].getAddress();
            System.out.println(addressByetes);
        }
        else {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println(local);
        }

    }
}
