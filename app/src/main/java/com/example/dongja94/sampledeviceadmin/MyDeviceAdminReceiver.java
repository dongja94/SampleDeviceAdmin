package com.example.dongja94.sampledeviceadmin;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class MyDeviceAdminReceiver extends DeviceAdminReceiver {
    public MyDeviceAdminReceiver() {
    }

    @Override
    public void onEnabled(Context context, Intent intent) {
    }

    @Override
    public CharSequence onDisableRequested(Context context, Intent intent) {
        return super.onDisableRequested(context, intent);
    }

    @Override
    public void onDisabled(Context context, Intent intent) {
    }

    @Override
    public void onPasswordChanged(Context context, Intent intent) {

    }

    @Override
    public void onPasswordFailed(Context context, Intent intent) {

    }

    @Override
    public void onPasswordSucceeded(Context context, Intent intent) {

    }

    @Override
    public void onPasswordExpiring(Context context, Intent intent) {

    }

    @Override
    public void onProfileProvisioningComplete(Context context, Intent intent) {
    }

    @Override
    public void onReadyForUserInitialization(Context context, Intent intent) {
    }

    @Override
    public void onLockTaskModeEntering(Context context, Intent intent, String pkg) {

    }

    @Override
    public void onLockTaskModeExiting(Context context, Intent intent) {

    }

    @Override
    public String onChoosePrivateKeyAlias(Context context, Intent intent, int uid, Uri uri, String alias) {
        return super.onChoosePrivateKeyAlias(context, intent, uid, uri, alias);
    }

    @Override
    public void onSystemUpdatePending(Context context, Intent intent, long receivedTime) {
    }
}
