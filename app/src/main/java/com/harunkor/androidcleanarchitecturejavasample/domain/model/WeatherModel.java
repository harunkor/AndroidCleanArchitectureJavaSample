
package com.harunkor.androidcleanarchitecturejavasample.domain.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class WeatherModel {

    @SerializedName("data")
    @Expose
    private List<Data> data = null;
    @SerializedName("count")
    @Expose
    private Integer count;

    public List<Data> getData() {
        return data;
    }


    public Integer getCount() {
        return count;
    }


}
