package com.example.piano;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.*;
import android.content.Intent;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import android.content.pm.ActivityInfo;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
SoundPool sp;

HashMap<Integer,Integer> hash;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadinglayout);


        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
               setContentView(R.layout.activity_main);

            }
        };
        handler.sendEmptyMessageDelayed(1,1000);

        sp=new SoundPool(10,AudioManager.STREAM_MUSIC,0);
        hash=new HashMap<Integer,Integer>();
        hash.put(0,sp.load(this,R.raw.note0,1));
        hash.put(1,sp.load(this,R.raw.note1,1));
        hash.put(2,sp.load(this,R.raw.note2,1));
        hash.put(3,sp.load(this,R.raw.note3,1));
        hash.put(4,sp.load(this,R.raw.note4,1));
        hash.put(5,sp.load(this,R.raw.note5,1));
        hash.put(6,sp.load(this,R.raw.note6,1));
        hash.put(7,sp.load(this,R.raw.note7,1));
        hash.put(8,sp.load(this,R.raw.note8,1));
        hash.put(9,sp.load(this,R.raw.note9,1));
        hash.put(10,sp.load(this,R.raw.note10,1));
        hash.put(11,sp.load(this,R.raw.note11,1));
        hash.put(12,sp.load(this,R.raw.note12,1));
        hash.put(13,sp.load(this,R.raw.note13,1));
        hash.put(14,sp.load(this,R.raw.note14,1));
        hash.put(15,sp.load(this,R.raw.note15,1));
        hash.put(16,sp.load(this,R.raw.note16,1));
        hash.put(17,sp.load(this,R.raw.note17,1));
        hash.put(18,sp.load(this,R.raw.note18,1));
        hash.put(19,sp.load(this,R.raw.note19,1));
        hash.put(20,sp.load(this,R.raw.note20,1));
        hash.put(21,sp.load(this,R.raw.note21,1));
        hash.put(22,sp.load(this,R.raw.note22,1));
        hash.put(23,sp.load(this,R.raw.note23,1));
        hash.put(24,sp.load(this,R.raw.note24,1));
        hash.put(25,sp.load(this,R.raw.note25,1));
        hash.put(26,sp.load(this,R.raw.note26,1));
        hash.put(27,sp.load(this,R.raw.note27,1));
        hash.put(28,sp.load(this,R.raw.note28,1));
        hash.put(29,sp.load(this,R.raw.note29,1));
        hash.put(30,sp.load(this,R.raw.note30,1));
        hash.put(31,sp.load(this,R.raw.note31,1));
        hash.put(32,sp.load(this,R.raw.note32,1));
        hash.put(33,sp.load(this,R.raw.note33,1));




    }

    public void onebtnclick(View view)
    {

        setContentView(R.layout.onephonelayout);

    }
    public void onebtnclick1(View view)
    {
        sp.play(hash.get(0),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView1)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView1)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }


    public void onebtnclick2(View view)
    {
        sp.play(hash.get(1),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView2)).setImageResource(R.drawable.onwh);

            }
        };

        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick3(View view)
    {
        sp.play(hash.get(2),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView3)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick4(View view)
    {
        sp.play(hash.get(3),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView4)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick5(View view)
    {
        sp.play(hash.get(4),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView5)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick6(View view)
    {
        sp.play(hash.get(5),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView6)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick7(View view)
    {
        sp.play(hash.get(6),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView7)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick8(View view)
    {
        sp.play(hash.get(7),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView8)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick9(View view)
    {
        sp.play(hash.get(8),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView9)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView9)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick10(View view)
    {
        sp.play(hash.get(9),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView10)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView10)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick14(View view)
    {
        sp.play(hash.get(10),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView14)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView14)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick15(View view)
    {
        sp.play(hash.get(11),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView15)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView15)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick16(View view)
    {
        sp.play(hash.get(12),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView16)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView16)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick17(View view)
    {
        sp.play(hash.get(13),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView17)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView17)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick18(View view)
    {
        sp.play(hash.get(14),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView18)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView18)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick20(View view)
    {
        sp.play(hash.get(15),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView20)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView20)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick21(View view)
    {
        sp.play(hash.get(16),1,1,0,0,1);
        ((ImageView)findViewById(R.id.imageView21)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView21)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }

    //two phone model
    private BluetoothAdapter btadapter;
    ArrayList<BluetoothDevice> list=new ArrayList<>();
    DeviceAdapter deviceAdapter;
    BluetoothDevice device;


    public void twobtnclick(View view) {
        setContentView(R.layout.twophonelayout);
        deviceAdapter=new DeviceAdapter(list,this);
        //蓝牙连接
        deviceAdapter1 = new DeviceAdapter(arrayList1,this);
        ListView listView1=  (ListView)findViewById(R.id.listview1);
        listView1.setAdapter(deviceAdapter1);

      ListView listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(deviceAdapter);
        btadapter=BluetoothAdapter.getDefaultAdapter();
        if(btadapter==null){
            return;
        }
        registerBluetoothReceiver();
        ((ListView) findViewById(R.id.listview1)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {

                BluetoothDevice mdevice=arrayList1.get(position);
                if (mConnectThread != null) {
                    mConnectThread.cancel();
                }
                mConnectThread = new ConnectThread(mdevice, btadapter, mUIHandler);
                mConnectThread.start();
            }
        });


        //打开扫描
    }

    public void isstart(){
        //判断是否打开

        if(!btadapter.isEnabled()){
            btadapter.enable();
        }
        //设为可见
        if(btadapter.getScanMode()!=BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE){
            Intent disintent=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            disintent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION,300);
            startActivity(disintent);
        }

    }
    public  void btnstart(View view){
        isstart();
    }
    public void btnsearch(View view) {
        isstart();
        if(btadapter.isDiscovering()){
            btadapter.cancelDiscovery();
        }else {
            btadapter.startDiscovery();
            ListView listview = (ListView) findViewById(R.id.listview);
            ((ImageView) findViewById(R.id.search)).setImageResource(R.drawable.stop);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView parent, View view, int position, long id) {
                    if (btadapter.isDiscovering()) {
                        btadapter.cancelDiscovery();
                    }
                    BluetoothDevice mdevice = list.get(position);
                    mdevice.createBond();
                }
            });
        }
    }

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if(BluetoothAdapter.ACTION_DISCOVERY_STARTED.equals(action)){
                ((ImageView)findViewById(R.id.search)).setImageResource(R.drawable.stop);
                Toast.makeText(MainActivity.this, "start searching", Toast.LENGTH_SHORT).show();
                list.clear();
                deviceAdapter.notifyDataSetChanged();
            }
            else if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                Boolean isexist = false;
                device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                if (device.getBondState() != BluetoothDevice.BOND_BONDED) {
                    if(!(device.getName()==null)) {
                        list.add(device);
                        deviceAdapter.notifyDataSetChanged();
                    }
                   }

            }else if(BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(action)){
                ((ImageView)findViewById(R.id.search)).setImageResource(R.drawable.search);

            }else if(BluetoothDevice.ACTION_BOND_STATE_CHANGED.equals(action)) {
                BluetoothDevice remoteDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                if(remoteDevice == null) {
                    showToast("null device");
                    return;
                }
                int status = intent.getIntExtra(BluetoothDevice.EXTRA_BOND_STATE, 0);
                if(status == BluetoothDevice.BOND_BONDED) {
                    list.remove(remoteDevice);
                    deviceAdapter.notifyDataSetChanged();
                    arrayList1.add(remoteDevice);
                    deviceAdapter1.notifyDataSetChanged();
                    showToast("matched " + remoteDevice.getName());
                } else if(status == BluetoothDevice.BOND_BONDING) {
                    showToast("Asking for match " + remoteDevice.getName());
                } else if(status == BluetoothDevice.BOND_NONE) {
                    showToast("not match " + remoteDevice.getName());
                }
            }


        }

    };
    private void registerBluetoothReceiver(){
        IntentFilter filter = new IntentFilter();
        filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_STARTED);
        filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
        filter.addAction(BluetoothDevice.ACTION_FOUND);
        filter.addAction(BluetoothDevice.ACTION_BOND_STATE_CHANGED);

        registerReceiver(receiver, filter);
    }

    ArrayList<BluetoothDevice>  arrayList1=new ArrayList<BluetoothDevice>();


DeviceAdapter deviceAdapter1;

    public void checkbtn(View view){
        isstart();
        deviceAdapter1.refresh(arrayList1);
        arrayList1.clear();
            Set<BluetoothDevice> pairedDevices = btadapter.getBondedDevices();
            if (pairedDevices.size() > 0) {
                for (BluetoothDevice device : pairedDevices) {
                    arrayList1.add(device);
                    deviceAdapter1.notifyDataSetChanged();
                }
            }

    }

    //连接
    private AcceptThread mAcceptThread;
    private ConnectThread mConnectThread;
    Toast mToast;
    private Handler mUIHandler = new MyHandler();
    private void say(String word) {
        if (mAcceptThread != null) {
            try {
                mAcceptThread.sendData(word.getBytes("utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        else if( mConnectThread != null) {
            try {
                mConnectThread.sendData(word.getBytes("utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

    }
   public void btntest(View view){

       if( mAcceptThread != null) {
           mAcceptThread.cancel();
       }
       mAcceptThread = new AcceptThread(btadapter, mUIHandler);
       mAcceptThread.start();
   }

    private class MyHandler extends Handler {

        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case Contant.MSG_GOT_DATA:
                    if(String.valueOf(message.obj).equals("1")) {
                        sp.play(hash.get(17),1,1,0,0,1);
                    }
                    else if(String.valueOf(message.obj).equals("2")) {
                    sp.play(hash.get(18),1,1,0,0,1);
                    }
                    else if(String.valueOf(message.obj).equals("3")) {
                        sp.play(hash.get(19),1,1,0,0,1);
                    }
                    else if(String.valueOf(message.obj).equals("4")) {
                        sp.play(hash.get(20),1,1,0,0,1);
                    }
                    else if(String.valueOf(message.obj).equals("5")) {
                        sp.play(hash.get(21),1,1,0,0,1);
                    }
                    else if(String.valueOf(message.obj).equals("6")) {
                        sp.play(hash.get(22),1,1,0,0,1);
                    }
                    else if(String.valueOf(message.obj).equals("7")) {
                        sp.play(hash.get(23), 1, 1, 0, 0, 1);
                    }
                    else if(String.valueOf(message.obj).equals("8")) {
                        sp.play(hash.get(24), 1, 1, 0, 0, 1);
                    }
                    else if (String.valueOf(message.obj).equals("9")) {
                            sp.play(hash.get(25), 1, 1, 0, 0, 1);
                    } else if (String.valueOf(message.obj).equals("10")) {
                            sp.play(hash.get(26), 1, 1, 0, 0, 1);
                    } else if (String.valueOf(message.obj).equals("11")) {
                            sp.play(hash.get(27), 1, 1, 0, 0, 1);
                    } else if (String.valueOf(message.obj).equals("12")) {
                            sp.play(hash.get(28), 1, 1, 0, 0, 1);
                    } else if (String.valueOf(message.obj).equals("13")) {
                            sp.play(hash.get(29), 1, 1, 0, 0, 1);
                    } else if (String.valueOf(message.obj).equals("14")) {
                            sp.play(hash.get(30), 1, 1, 0, 0, 1);
                    } else if (String.valueOf(message.obj).equals("15")) {
                            sp.play(hash.get(31), 1, 1, 0, 0, 1);
                    } else if (String.valueOf(message.obj).equals("16")) {
                            sp.play(hash.get(32), 1, 1, 0, 0, 1);
                    } else if (String.valueOf(message.obj).equals("17")) {
                            sp.play(hash.get(33), 1, 1, 0, 0, 1);
                    }

                    break;
                case Contant.MSG_ERROR:
                    showToast("error:" + String.valueOf(message.obj));
                    break;
                case Contant.MSG_CONNECT_SERVER:
                    setContentView(R.layout.onephonelayout);
                    showToast("connect to server");
                    break;
                case Contant.MSG_GOT_CLINET:
                    setContentView(R.layout.twopianolayout);
                    showToast("find a device");
                    break;
            }
        }
    }
    /*
    protected void onDestroy() {
        super.onDestroy();
        if (mAcceptThread != null) {
            mAcceptThread.cancel();
        }
        if (mConnectThread != null) {
            mConnectThread.cancel();
        }

        unregisterReceiver(receiver);
    }
    */
    private void showToast(String text){
        if(mToast == null){
            mToast = Toast.makeText(this, text,Toast.LENGTH_SHORT);
            mToast.show();
        }
        else {
            mToast.setText(text);
            mToast.show();
        }

    }
    public void onebtnclick30(View view) {
        say("1");
        ((ImageView)findViewById(R.id.imageView30)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView30)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick31(View view) { say("2");
        ((ImageView)findViewById(R.id.imageView31)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView31)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick32(View view) {
        say("3");
        ((ImageView)findViewById(R.id.imageView32)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView32)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick33(View view) {
        say("4");
        ((ImageView)findViewById(R.id.imageView33)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView33)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick34(View view) { say("5");
      ((ImageView)findViewById(R.id.imageView34)).setImageResource(R.drawable.downwh);
                    Handler handler = new Handler()
                    {
                        @Override
                        public void handleMessage(Message msg)
                        {
                            ((ImageView)findViewById(R.id.imageView34)).setImageResource(R.drawable.onwh);

                        }
                    };
                    handler.sendEmptyMessageDelayed(1,100);
    }
    public void onebtnclick35(View view) { say("6");
        ((ImageView)findViewById(R.id.imageView35)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView35)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick36(View view) { say("7");
        ((ImageView)findViewById(R.id.imageView36)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView36)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick37(View view) { say("8");
        ((ImageView)findViewById(R.id.imageView37)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView37)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick38(View view) { say("9");
        ((ImageView)findViewById(R.id.imageView38)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView38)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick39(View view) { say("10");
        ((ImageView)findViewById(R.id.imageView39)).setImageResource(R.drawable.downwh);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView39)).setImageResource(R.drawable.onwh);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick40(View view) { say("11");
        ((ImageView)findViewById(R.id.imageView40)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView40)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick41(View view) { say("12");
        ((ImageView)findViewById(R.id.imageView41)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView41)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick42(View view) { say("13");
        ((ImageView)findViewById(R.id.imageView42)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView42)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick43(View view) { say("14");
        ((ImageView)findViewById(R.id.imageView43)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView43)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick44(View view) { say("15");
        ((ImageView)findViewById(R.id.imageView44)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView44)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick45(View view) { say("16");
        ((ImageView)findViewById(R.id.imageView45)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView45)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
    public void onebtnclick46(View view) { say("17");
        ((ImageView)findViewById(R.id.imageView46)).setImageResource(R.drawable.downbl);
        Handler handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                ((ImageView)findViewById(R.id.imageView46)).setImageResource(R.drawable.onbl);

            }
        };
        handler.sendEmptyMessageDelayed(1,100);}
}

