package in.vaksys.generous.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import in.vaksys.generous.R;
import in.vaksys.generous.adapters.SpinnerTextAdapter;
import in.vaksys.generous.extras.MyApplication;

public class RegisterActivity extends AppCompatActivity {

    @Bind(R.id.et_fname_register)
    EditText etFnameRegister;
    @Bind(R.id.et_name_register)
    EditText etNameRegister;
    @Bind(R.id.et_email_register)
    EditText etEmailRegister;
    @Bind(R.id.btn_registerClick_register)
    Button btnRegisterClickRegister;
    @Bind(R.id.tv_allReadyAccount_register)
    TextView tvAllReadyAccountRegister;
    @Bind(R.id.linear_register_layout)
    LinearLayout linearRegisterLayout;
    @Bind(R.id.et_password_register)
    EditText etPasswordRegister;
    @Bind(R.id.et_city_register)
    EditText etCityRegister;
    @Bind(R.id.sp_country_register)
    Spinner spCountryRegister;
    private Toolbar ToolbarRegister;
    private Button btnRegister;

    private Typeface font;

    MyApplication myApplication;

    String[] country = {"Country", "Africa", "U.S.A", "U.S", "India", "Japan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        myApplication = (MyApplication) getApplicationContext();

        ToolbarRegister = (Toolbar) findViewById(R.id.toolbar_register);
        setSupportActionBar(ToolbarRegister);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ToolbarRegister.setTitle("Register");


        SpinnerTextAdapter spinnerTextAdapter = new SpinnerTextAdapter(RegisterActivity.this, country);
        // attaching data adapter to spinner
        spCountryRegister.setAdapter(spinnerTextAdapter);

       /* font = myApplication.getGujFont(RegisterActivity.this);
        etFnameRegister.setTypeface(font);
        etNameRegister.setTypeface(font);
        etEmailRegister.setTypeface(font);
        etPasswordRegister.setTypeface(font);
        etCityRegister.setTypeface(font);*/

        btnRegister = (Button) findViewById(R.id.btn_registerClick_register);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
