package net.mehmetbalbay.geocodeapitest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Geocode {

    @SerializedName("results")
    @Expose
    private List<Result> results;

}
