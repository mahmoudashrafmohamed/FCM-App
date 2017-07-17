package com.mahmoud_ashraf.fcm_app;

import android.content.Intent;

import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by mahmoud_ashraf on 7/17/2017.
 */

public class FCMTokenRefreshListenerService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, FCMRegistrationService.class);
        intent.putExtra("refreshed", true);
        startService(intent);
    }
}
