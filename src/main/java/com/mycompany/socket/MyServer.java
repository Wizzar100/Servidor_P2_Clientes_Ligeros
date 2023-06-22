/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author gutie
 */
public class MyServer {
    
    public static void main(String[] args) throws IOException {
        System.out.println("El servidor esta corriendo en el puerto 5678");
        String msg;
        
        ServerSocket ss = new ServerSocket(5678);
        
        while(true){
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            msg = dis.readUTF();
            dis.close();
            s.close();
            System.out.println("Mensaje recibido por Android Studio "+msg);
        }
    }
    
}
