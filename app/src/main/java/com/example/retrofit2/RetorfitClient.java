package com.example.retrofit2;
import  retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetorfitClient {
    private static Retrofit retrofit = null;
    private static final String Base_URL ="http://app.iotstar.vn:8081/appfoods/";
    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
        }
    }
