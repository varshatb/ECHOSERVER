import java.io.*;
import java.net.*;
public class EchoClient
{
	public static void main(String[] args)
	{
		try
		{
			Socket s = new Socket("127.0.0.1", 9999);
			BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
