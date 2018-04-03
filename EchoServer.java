import java.io.*;
import java.net.*;
public class EchoServer
{
	public EchoServer(int portnum)
         {
	  try
	  {
            server = new ServerSocket(portnum);
           }
	  catch (Exception err)
	  {
            System.out.println(err);
	}
}
public void serve()
 {
 try
   {
    while (true)
    {
    Socket client = server.accept();
    BufferedReader r = new BufferedReader(new InputStreamReader(client.getInputStream()));
    PrintWriter w = new PrintWriter(client.getOutputStream(), true);
    w.println("Welcome to the Java EchoServer.  Type 'bye' to close.");
    String line;
    do
     {
      line = r.readLine();
