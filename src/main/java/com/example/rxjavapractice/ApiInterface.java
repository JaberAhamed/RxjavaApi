package com.example.rxjavapractice;




import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by azeR on 9/20/2018.
 */

public interface ApiInterface {




   /* @GET("gymlist")
    Call<GymSearchResponse> getGymSelectList(@Query("username") String username,
                                             @Query("password") String password

    );*/


    @GET("gymlist")
    Observable<GymSearchResponse> getUserDetails(@Query("username") String username,
                                                      @Query("password") String password

    );


}