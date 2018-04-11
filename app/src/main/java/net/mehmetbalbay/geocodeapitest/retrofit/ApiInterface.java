package net.mehmetbalbay.geocodeapitest.retrofit;

import net.mehmetbalbay.geocodeapitest.model.GeoResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/maps/api/geocode/json")
    Call<GeoResponse> geoApi (@Query("latlng") String latlng, @Query("key") String api_key);

}
