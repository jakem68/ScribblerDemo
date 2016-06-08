/*
package be.sirris;

*/
/**
 * Created by jan on 6/5/16.
 *//*

public class Server {
    public void start (){

    }

    public void send(String message){

    }
}




	 public static void sendMessage(String message) throws IOException {

	 // TODO: check whether is works without starting a new thread each time????
	 new Thread(new Server()).start(); DataOutputStream out = new
	 DataOutputStream(pcsocket.getOutputStream()); out.writeUTF(message); //
	 try {
		 Thread.sleep(500);
		 }
	 catch (Exception e) {
	 }

	 out.flush();
	 out.close();
	 }

	 static class Server {
		 private static final String UR10_IP = "192.168.2.100";
		 private static final int PORT = 30000;

	 */
/**
		 Monitor a port for connections. Each time one is established, pass
		 resulting Socket to handleConnection.
	  *//*



	 public void listen() {
		 try {
			 ServerSocket listener = new
					 ServerSocket(PORT);
			 Socket server = listener.accept();
			 handleConnection(server);
			 listener.close();
		 } catch (IOException ioe) {
			 System.out.println("IOException: " + ioe);
			 ioe.printStackTrace();
		 }
	 }

	 */
/**
		 This is the method that provides the behavior to the server, since it
		 determines what is done with the resulting socket. This generic
		 version simply reports the host that made the connection, shows the
		 first line the client sent, and sends a single line in response.
		 *//*


		 protected void handleConnection(Socket server) throws IOException {
		 PrintWriter out = new PrintWriter(server.getOutputStream(), true);
		 System.out.println("Generic Network Server: got connection from " +
		 server.getInetAddress().getHostName() + "\n"); out.println("(0, 0)");
		 // server.close(); } }
		 //////////////////////////////////////////////////////////
*/
