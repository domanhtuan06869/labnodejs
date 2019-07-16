package com.cao.nang.labnodejs.retrofitapi;

/**
 * Created by Chike on 12/4/2016.
 */

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://10.22.207.112:3000";

    public static JsonPlaceHolderApi getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(JsonPlaceHolderApi.class);
    }
}
