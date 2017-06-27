package com.hfad.retrodatafetch;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sdobhal on 6/27/2017.
 */


public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
