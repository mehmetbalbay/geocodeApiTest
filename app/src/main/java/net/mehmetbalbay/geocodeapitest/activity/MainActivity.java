package net.mehmetbalbay.geocodeapitest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.mehmetbalbay.geocodeapitest.R;
import net.mehmetbalbay.geocodeapitest.model.GeoResponse;
import net.mehmetbalbay.geocodeapitest.retrofit.ApiClient;
import net.mehmetbalbay.geocodeapitest.retrofit.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private String YOUR_API_KEY = "YOUR_API_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<GeoResponse> call = apiService.geoApi("39.423803,29.971080" , YOUR_API_KEY);

        call.enqueue(new Callback<GeoResponse>() {
            @Override
            public void onResponse(Call<GeoResponse> call, Response<GeoResponse> response) {

            }

            @Override
            public void onFailure(Call<GeoResponse> call, Throwable t) {

            }
        });

    }
}
