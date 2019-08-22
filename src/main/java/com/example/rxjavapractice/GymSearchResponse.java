package com.example.rxjavapractice;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GymSearchResponse implements Serializable {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("GymList")
    @Expose
    private List<GymSearchResponseList> companyList = null;
    private final static long serialVersionUID = 2975648311112651536L;

    /**
     * No args constructor for use in serialization
     *
     */
    public GymSearchResponse() {
    }

    /**
     *
     * @param desc
     * @param companyList
     * @param status
     */
    public GymSearchResponse(String status, String desc, List<GymSearchResponseList> companyList) {
        super();
        this.status = status;
        this.desc = desc;
        this.companyList = companyList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<GymSearchResponseList> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<GymSearchResponseList> companyList) {
        this.companyList = companyList;
    }

}
