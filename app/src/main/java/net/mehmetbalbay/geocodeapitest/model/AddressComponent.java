package net.mehmetbalbay.geocodeapitest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddressComponent {

    @SerializedName("long_name")
    @Expose
    private String long_name;
    @SerializedName("short_name")
    @Expose
    private String short_name;
    @SerializedName("types")
    @Expose
    private List<String> types;

    public AddressComponent(String long_name, String short_name, List<String> types) {
        this.long_name = long_name;
        this.short_name = short_name;
        this.types = types;
    }

    public String getLong_name() {
        return long_name;
    }

    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
}
