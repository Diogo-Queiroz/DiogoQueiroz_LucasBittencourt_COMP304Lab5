package com.diogo.diogoqueiroz_lucasbittencourt_comp304lab5;

public class Landmark
{
    public String name;
    public String type;
    public String address;
    public String longitude;
    public String latitude;

    public Landmark(String name, String type, String address, String longitude, String latitude)
    {
        this.name = name;
        this.type = type;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getLongitude()
    {
        return longitude;
    }
    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }
    public String getLatitude()
    {
        return latitude;
    }
    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }
}
