/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjavanet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Visual Studio
 */
public class AddrLookupApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Lấy đối tượng InetAddress chứa thông tin máy chủ.
            InetAddress host = InetAddress.getByName("www.google.com");
            InetAddress[] hostArray = InetAddress.getAllByName("www.google.com");
            //Lấy tên Server nếu có
            String hostName = host.getHostName();
            //In các thông tin ra màn hình
            System.out.println("Host Name: " +hostName);
            System.out.println("IP address: " + host.getHostAddress());
            for(int i = 0; i < hostArray.length; i++){
                 System.out.println("InetAddress[]:" +hostArray[i]);
            }
        } catch (UnknownHostException e) {
            System.out.println("Address not found: " + e.getMessage());
        }
    }
}
