package com.example.android.quake_report;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quake {

    /** Location of Earthquake */
    private String mCity;

    /** Date of Earthquake */
    private Date mDate;

    /** Magnitude of earthquake */
    private double mMagnitude;

    public Quake()
    {}

    Quake( String city, Date date, double magnitude )
    {
        this.mCity = city;
        this.mDate = date;
        this.mMagnitude = magnitude;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        this.mCity = city;
    }

    public Date getDate() {
        return mDate;
    }

    public String getDateInString()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
        return  formatter.format( getDate() ) ;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getMagnitudeInString()
    {
        return Double.toString( getMagnitude() );
    }


    public void setMagnitude(double magnitude) {
        this.mMagnitude = magnitude;
    }
}
