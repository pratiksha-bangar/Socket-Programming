
import java.net.*;   // serversocket class
import java.io.*;    // inputstream, bufferreadee

class Server
{
    public static void main(String ars[]) throws Exception
    {
        System.out.println("------- Server Application Running --------");

        ServerSocket ssobj = new ServerSocket(2100);    // 2100 is port no  --- open

        System.out.println("Server is Waiting for Client at Port Number 2100");

        Socket sobj = ssobj.accept();                   // Accept request from client

        System.out.println("Connection Established with the client");

        PrintStream ps = new PrintStream(sobj.getOutputStream());                    // send output

        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));   // give input 
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));               // keyboard kadun input

        String str1,str2;

        System.out.println("-------------- Marvellous Chat Messanger application Started ------------");

        while((str1 =br1.readLine()) != null)
        {
            System.out.println("Client Says:"+str1);
            System.out.println("Enter message for client:");
            str2 = br2.readLine();   // give msg
            ps.println(str2);       // send msg
        }
        System.out.println("Thank You for using the Marvellous Chat Application");
    }
}