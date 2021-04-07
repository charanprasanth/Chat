package com.charan.chat.Fragments;

import com.charan.chat.Notifications.MyResponse;
import com.charan.chat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAXPSkPZY:APA91bE7IE0TXj9IRZUZDIUIu5IMs_y06BdBbrbcLhZysQn5mV0_00eiMX6_15BTmOhBlT_XYuyaxPkTf96SFotg_ehIiQGu2Q7kJwemeCf8huukXSV9--0_EhVEQKnB8EDJd8m0OsDn"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
