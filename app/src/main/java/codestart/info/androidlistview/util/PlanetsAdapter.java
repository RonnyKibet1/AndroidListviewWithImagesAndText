package codestart.info.androidlistview.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import codestart.info.androidlistview.R;
import codestart.info.androidlistview.model.Planet;

/**
 * Created by ronnykibet on 3/22/15.
 */
public class PlanetsAdapter extends ArrayAdapter<Planet> {

    protected Context mContext;
    protected List<Planet> mPlanets;


    public PlanetsAdapter(Context context, List<Planet> objects) {
        super(context, R.layout.single_row, objects);
        mContext = context;
        mPlanets = objects;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;


            if (convertView == null) {
                convertView = LayoutInflater.from(mContext).inflate(
                        R.layout.single_row, null);
                holder = new ViewHolder();
                holder.imageView = (ImageView) convertView
                        .findViewById(R.id.imageview);
                holder.textView = (TextView) convertView
                        .findViewById(R.id.textview);


                convertView.setTag(holder);
            } else {

                holder = (ViewHolder) convertView.getTag();



            }

        Planet planet = mPlanets.get(position);
        holder.imageView.setImageResource(planet.getImage());
        holder.textView.setText(planet.getName());



        return convertView;
    }

    public static class ViewHolder {
        ImageView imageView;
        TextView textView;


    }
}
