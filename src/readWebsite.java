import java.net.*;
import java.io.*;

public class readWebsite {

	public static void main(String args[]){ 
	       String nextLine;
	       URL url = null;
	       URLConnection urlConn = null;
	       InputStreamReader  inStream = null;
	       BufferedReader buff = null;
	       
	       try{
	         // index.html adalah nama file default dari URL
	         url  = new URL("http://www.google.com");
	         urlConn = url.openConnection();
	         inStream = new InputStreamReader(urlConn.getInputStream(), "UTF8");
	         buff  = new BufferedReader(inStream);
	        
	         // Membaca dan mencetak tiap baris dari index.html
	         while (true){
	             nextLine =buff.readLine();  
	             if (nextLine !=null){
	                System.out.println(nextLine);
	             }else{
	               break;
	             }
	         }
	      } catch(MalformedURLException e){
	         System.out.println("Cek kembali URL:" + e.toString() );
	      } catch(IOException  e1){
	         System.out.println("Tidak dapat membaca dari Internet: " + e1.toString() ); 
	} finally {
	           if (inStream != null){
	            try{      
	                   inStream.close();
	                   buff.close();
	               } catch(IOException e1){
	                   System.out.println("Tidak dapat menutup stream: "+ e1.getMessage());
	               }
	             }
	       }
	   }
} 
	            

