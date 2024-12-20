package finalproject;

import finalproject.Connection.ConnectPLMDB;

public class Main {

    public static void main(String[] args) {

        ConnectPLMDB c = new ConnectPLMDB();
        c.Connect();
        
        Home ms = new Home();
        ms.setVisible(true);
    }    
}
