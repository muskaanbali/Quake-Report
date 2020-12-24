package com.example.android.quake_report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class QuakeAdapter extends ArrayAdapter<Quake> {

    /**
     * Constructs a new Adapter for Quake object
     * @param context
     * @param earthquakeData
     */
    public QuakeAdapter(Context context, List<Quake> earthquakeData )
    {
        super( context, 0, earthquakeData );
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {

        View listItemView = convertView;
        //Checkingif it is an existing view being resued or not
        //if not inflate a new one
        if( listItemView == null )
        {
            listItemView = LayoutInflater.from( getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false );
        }

        //Get the object located at this position in the list
        Quake currentEarthquake = getItem( position );

        TextView magnitudeTextView = ( TextView) listItemView.findViewById( R.id.magnitude);
        magnitudeTextView.setText((CharSequence) currentEarthquake.getMagnitudeInString()) ;

        TextView cityTextView = ( TextView ) listItemView.findViewById( R.id.city);
        cityTextView.setText( currentEarthquake.getCity() );

        TextView dateTextView = ( TextView ) listItemView.findViewById( R.id.date );
        dateTextView.setText( currentEarthquake.getDateInString() );

        //Return the listItemView that is showing appropriate data
        return listItemView;
    }
}
