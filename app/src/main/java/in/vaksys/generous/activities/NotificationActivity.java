package in.vaksys.generous.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import in.vaksys.generous.R;


public class NotificationActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_list);

        toolbar = (Toolbar) findViewById(R.id.notificationTool_bar);
        setSupportActionBar(toolbar);
    }
}
