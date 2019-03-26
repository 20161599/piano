package com.example.piano;


import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.Color;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DeviceAdapter extends BaseAdapter {
    private ArrayList<BluetoothDevice> mData;
    private Context mContext;
LayoutInflater inflater;
    public DeviceAdapter(ArrayList<BluetoothDevice> data, Context context){
        mData = data;
        mContext = context.getApplicationContext();
        inflater=LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View converView, ViewGroup viewGroup) {
       View view=inflater.inflate(R.layout.listlayout,null);
        TextView name=(TextView) view.findViewById(R.id.name);
        TextView address=(TextView) view.findViewById(R.id.address);


        name.setText((String) mData.get(i).getName());
        address.setText((String) mData.get(i).getAddress());

        return view;
    }

    //刷新列表，防止搜索结果重复出现
    public void refresh(ArrayList<BluetoothDevice> data){
        mData = data;
        notifyDataSetChanged();
    }

}
