
import java.net.*;
import java.io.*;

class Client
{
    public static void main(String ars[]) throws Exception
    {
        System.out.println("------- Client Application Running --------");

        
        
        
        
        Socket sobj = new Socket("localhost",2100);      // Request to server

        System.out.println("Connection established with the Server");

        PrintStream ps = new PrintStream(sobj.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1,str2;

        System.out.println("------------Marvellous Chat Messanger application Started------------");

        while(!(str1 = br2.readLine()).equals("End"))
        {
            ps.println(str1);
            str2 = br1.readLine();
            System.out.println("Enter the Message for Server:");
            System.out.println("Server Says:"+str2);
        }
        System.out.println("Thank You for using the Marvellous Chat Application");

    }
}