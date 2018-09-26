package com.example.lg.emergency;

/**
 * Created by davki on 2018-09-26.
 */

public class MapPoint {
    private String name;
    private double latitude;
    private double longitude;

    public MapPoint() {
        super();
    }

    public MapPoint(String name, double latitude, double longitude){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() { return name; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }

    public void setName(String name) { this.name = name; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

}
