package in.vaksys.generous.activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.vaksys.generous.R;

public class LoginActivity extends AppCompatActivity {

    private Toolbar loginToolbar;
    private Button btnSign, btn_login;

    private LinearLayout linerNew, linearNew1;
    View viewone;
    TextView campaign, tvForgotPassword;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginToolbar = (Toolbar) findViewById(R.id.loginToolbar);
        setSupportActionBar(loginToolbar);
        loginToolbar.setTitle("Login");

        tvForgotPassword = (TextView) findViewById(R.id.tv_forgotpassword);
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new Dialog(LoginActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.interface_two);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        btnSign = (Button) findViewById(R.id.btn_sign);
        campaign = (TextView) findViewById(R.id.campaign);
        campaign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ListCampaignActivity.class));
                finish();
            }
        });
        viewone = findViewById(R.id.viewNew);
        linearNew1 = (LinearLayout) findViewById(R.id.linearNew1);

        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewone.setVisibility(View.VISIBLE);
                linearNew1.setVisibility(View.GONE);

            }
        });

        viewone.setVisibility(View.GONE);

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                finish();
            }
        });


//        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                startActivity(new Intent(LoginActivity.this, MainActivity.class));
//                finish();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
}
