
package resetmaszyny;

import java.net.InetAddress;
import java.net.NetworkInterface;

public class ResetMaszyny {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		String adres = "127.0.0.1";
		while (true) {
			try {
				Thread.sleep(3000);
				System.out.println(InetAddress.getLocalHost().getHostAddress());
				if (InetAddress.getLocalHost().getHostAddress().equals(adres)) {
					r.exec("shutdown -r -t 5");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
