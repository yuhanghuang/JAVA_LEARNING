package com.hyh.Internet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }

    public void go() {
        try {
            Socket socket = new Socket("127.0.0.1",5400);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            System.out.println("you should : "+advice);
            reader.close();
        } catch (Exception ex){
            System.out.println("出错了");
            ex.printStackTrace();
        }
    }
}
