import java.io.*;
import java.net.*;

public class downloadFile {
		public static void main (String args []){ 
		 	InputStream in=null; 
		 	FileOutputStream fOut=null; 
		 	try {
				//URL remoteFile = new URL ("https://www.xotours.net/images/Photo/Europe/Barcelona.jpg");
				//URL remoteFile = new URL ("https://if.unram.ac.id/wp-content/uploads/2020/08/opentalk2-770x410.png");
				URL remoteFile = new URL ("http://www.stendev.website/BTS/1.mp3");
		 		URLConnection fileStream = remoteFile.openConnection(); 
		 		//membuka input dan output stream 
		 		fOut = new FileOutputStream("BTS1.mp3"); 
		 		in = fileStream.getInputStream(); 
		 		
		 		//menyimpan file 
		 		int data; 
				while ((data=in.read())!=-1){ 
		 			fOut.write(data); 
		 			} 
		 	} 
			catch (Exception ex){ 
		 		ex.printStackTrace();
		 	} 
		 	finally { 
		 		System.out.println("File telah berhasil didownload"); 
				try { 
		 			in.close();  
					fOut.flush(); 
					fOut.close();
		 		} 
		 		catch (Exception e){ 
		 			e.printStackTrace(); 
		 			}
		 		} 
		 	}
	}
