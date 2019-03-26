package com.example.piano;


import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;

import java.io.IOException;
import java.util.UUID;

import android.os.*;
public class AcceptThread extends Thread {
    String uuid="00001101-0000-1000-8000-00805F9B34FB";
    UUID MY_UUID=UUID.fromString(uuid);
    private static final String NAME = "BlueToothClass";
    private final BluetoothServerSocket mmServerSocket;
    private final BluetoothAdapter mBluetoothAdapter;
    private final Handler mHandler;
    private ConnectedThread mConnectedThread;

    public AcceptThread(BluetoothAdapter adapter, Handler handler) {
        // 使用一个临时对象，该对象稍后被分配给mmServerSocket，因为mmServerSocket是最终的
        mBluetoothAdapter = adapter;
        mHandler = handler;
        BluetoothServerSocket tmp = null;
        try {
            // MY_UUID是应用程序的UUID，客户端代码使用相同的UUID
            tmp = mBluetoothAdapter.listenUsingRfcommWithServiceRecord(NAME, MY_UUID);
        } catch (IOException e) { }
        mmServerSocket = tmp;
    }

    public void run() {
        BluetoothSocket socket;
        //持续监听，直到出现异常或返回socket
        while (true) {
            try {
                mHandler.sendEmptyMessage(Contant.MSG_START_LISTENING);
                socket = mmServerSocket.accept();
            } catch (IOException e) {
                mHandler.sendMessage(mHandler.obtainMessage(Contant.MSG_ERROR, e));
                break;
            }
            // 如果一个连接被接受
            if (socket != null) {
                // 在单独的线程中完成管理连接的工作
                manageConnectedSocket(socket);
                try {
                    mmServerSocket.close();
                    mHandler.sendEmptyMessage(Contant.MSG_FINISHI_LISTENING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    private void manageConnectedSocket(BluetoothSocket socket) {
        //只支持同时处理一个连接
        if( mConnectedThread != null) {
            mConnectedThread.cancle();
        }
        mHandler.sendEmptyMessage(Contant.MSG_GOT_CLINET);
        mConnectedThread = new ConnectedThread(socket, mHandler);
        mConnectedThread.start();
    }

    /**
     * 取消监听socket，使此线程关闭
     */
    public void cancel() {
        try {
            mmServerSocket.close();
            mHandler.sendEmptyMessage(Contant.MSG_FINISHI_LISTENING);
        } catch (IOException e) { }
    }

    public void sendData(byte[] data) {
        if( mConnectedThread!=null){
            mConnectedThread.write(data);
        }
    }
}
