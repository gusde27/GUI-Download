import java.io.*;

public class dataStream {
    public static void main(String[] args) {
        //DataInputStream membaca java primitives
        //DataOutputStream menulis java primitives
        File file = new File("contohdatastream.txt");
        if (file.exists())
        {
            System.out.println("File sudah ada  " + file.getName());
        }
        else
        {
            try {
                if(file.createNewFile())
                {
                    System.out.println("File berhasil dibuat");
                    System.out.println("Lokasi file " + file.getPath());
                }
                else
                {
                    System.out.println("Tidak bisa membuat file");
                }
            }
            catch (Exception e)
            {
                System.out.println(e.toString());
            }
        }
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getName()));
            DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));
            
            out.writeInt(70);
            out.writeDouble(456.67);
            out.writeFloat(123.45F);
            
            int var1 = in.readInt();
            double var2 = in.readDouble();
            float var3 = in.readFloat();
            
            System.out.println("nilai integer : " + var1);
            System.out.println("nilai double : " + var2);
            System.out.println("nilai float : " + var3);
            //in and out
            out.close();
            in.close();
        }
        catch (Exception e)
        { 
            System.out.println(e.toString());
        }
    }
}
