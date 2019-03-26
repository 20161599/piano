package com.example.piano;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public class ConnectedThread extends Thread {
SoundPool sp;
    BluetoothSocket msocket;
    InputStream minputstream;
    OutputStream moutputstream;
    Handler mhandler;

    public ConnectedThread(BluetoothSocket socket,Handler handler){
        msocket=socket;
        mhandler=handler;

        InputStream tempin=null;
        OutputStream tempout=null;
        try{
            tempin=socket.getInputStream();
            tempout=socket.getOutputStream();
        }catch (IOException e){
        }
        minputstream=tempin;
        moutputstream=tempout;
    }
    byte[] buffer;

    HashMap<Integer,Integer> hash;
    public void run() {

        buffer = new byte[1024];
        int bytes;
        while (true) {
            try {

                bytes = minputstream.read(buffer);

                if (bytes > 0) {
                    Message message = mhandler.obtainMessage(Contant.MSG_GOT_DATA, new String(buffer, 0, bytes, "utf-8"));
                    mhandler.sendMessage(message);
                }
                Log.d("GOTMSG", "message size" + bytes);
            } catch (IOException e) {
                mhandler.sendMessage(mhandler.obtainMessage(Contant.MSG_ERROR,e));
                break;
            }
        }
    }
    public void write(byte[] bytes){
        try{
                moutputstream.write(bytes);
        }catch (IOException e){
        }
    }
    public void cancle(){
        try{
            msocket.close();
        }catch (IOException e){
        }
    }
}
