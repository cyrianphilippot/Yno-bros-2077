package server;
import ynobros2077.*;

import java.awt.event.ActionEvent;
import java.io.*;
import java.net.*;
import java.util.Date;
 
public class clientConnexion {
 
   public static void main(String[] args) {
 
  
       final String serverHost = "localhost";
 
       Socket socketOfClient = null;
       BufferedWriter os = null;
       BufferedReader is = null;
 
       try {
      
            
           // Send a request to connect to the server is listening
           // on machine 'localhost' port 7777.            
           socketOfClient = new Socket(serverHost, 7777);
      
           // Create output stream at the client (to send data to the server)
           os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));
 
      
           // Input stream at Client (Receive data from the server).
           is = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));
 
       } catch (UnknownHostException e) {
           System.err.println("Don't know about host " + serverHost);
           return;
       } catch (IOException e) {
           System.err.println("Couldn't get I/O for the connection to " + serverHost);
           return;
       }
 
       try {
    	   
    	   
    
           // Write data to the output stream of the Client Socket.
           os.write("Hi now is " + new Date());
        
           // End of line
           os.newLine();
        
           // Flush data.
           os.flush();  
           
           pageMenu.launchPageMenu();
       
    	   os.write("QUIT");  
           os.newLine();
           os.flush();
           
           
           
           
           
           // Read data sent from the server.
           // By reading the input stream of the Client Socket.
           String responseLine;
           while ((responseLine = is.readLine()) != null) {
               System.out.println("Server: " + responseLine);
               if (responseLine.indexOf("OK") != -1) {
                   break;
               }
           }
 
           os.close();
           is.close();
           socketOfClient.close();
       } catch (UnknownHostException e) {
           System.err.println("Trying to connect to unknown host: " + e);
       } catch (IOException e) {
           System.err.println("IOException:  " + e);
       }
   }

private static void write(String string) {
	// TODO Auto-generated method stub
	
}
 
}