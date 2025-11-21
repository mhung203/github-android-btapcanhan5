package com.example.retrofit2;
import retrofit2.http.GET;
import retrofit2.Call;
import java.util.List;
import java.util.Locale;

public interface ApiService {
    @GET("categories.php")
    Call<List<Category>>getCategoryAll();
}
