package com.example.asus.lv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by asus on 2015/12/11.
 */
public class VpAdapter extends ArrayAdapter<Voiceplayer> {
    private int resourceId;
    public VpAdapter(Context context,int textviewResoursceId,List<Voiceplayer> person)
    {
        super(context,textviewResoursceId,person);
        resourceId=textviewResoursceId;

    }

    public VpAdapter(SecondActivity secondActivity, int member_list) {
        super(secondActivity, member_list);
    }

    public View getView(int number,View convertView,ViewGroup parent)
    {
        Voiceplayer voiceplayer=getItem(number);
        View view= LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView VpimageId= (ImageView) view.findViewById(R.id.Voiceplayer_image);
        TextView Vpname= (TextView) view.findViewById(R.id.Voiceplayer_name);
        VpimageId.setImageResource(voiceplayer.getImageId());
        Vpname.setText(voiceplayer.getName());
        return view;
    }


}
