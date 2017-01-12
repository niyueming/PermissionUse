package net.nym.permissionuse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.nym.permissionlibrary.activity.NPermissionActivity;
import net.nym.permissionlibrary.permission.NPermission;

public class MainActivity extends NPermissionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new NPermission.Builder(this)
                .requestCode(REQUEST_CAMERA)
                .permissions(PERMISSIONS_CAMERA)
                .build()
                .request();
    }
}
