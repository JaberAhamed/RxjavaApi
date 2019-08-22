package com.example.rxjavapractice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GymSearchResponseList implements Serializable {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("contact_number")
    @Expose
    private String contactNumber;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("min")
    @Expose
    private int min;
    @SerializedName("max")
    @Expose
    private int max;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("is_subscribe")
    @Expose
    private int isSubscribe;
    private final static long serialVersionUID = 296560877553716796L;

    /**
     * No args constructor for use in serialization
     *
     */
    public GymSearchResponseList() {
    }

    /**
     *
     * @param min
     * @param id
     * @param logo
     * @param contactNumber
     * @param max
     * @param location
     * @param address
     * @param name
     * @param gender
     * @param longitude
     * @param latitude
     * @param isSubscribe
     * @param city
     */
    public GymSearchResponseList(int id, String name, String contactNumber, String address, String gender, String latitude, String longitude, String location, String city, int min, int max, String logo, int isSubscribe) {
        super();
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
        this.gender = gender;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = location;
        this.city = city;
        this.min = min;
        this.max = max;
        this.logo = logo;
        this.isSubscribe = isSubscribe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(int isSubscribe) {
        this.isSubscribe = isSubscribe;
    }
}