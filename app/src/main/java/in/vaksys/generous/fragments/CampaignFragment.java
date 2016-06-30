package in.vaksys.generous.fragments;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import in.vaksys.generous.R;
import in.vaksys.generous.activities.RegisterCampaignActivity;
import in.vaksys.generous.adapters.SpinnerTextAdapter;
import in.vaksys.generous.extras.MyApplication;

/**
 * Created by dell980 on 6/1/2016.
 */
public class CampaignFragment extends Fragment implements View.OnClickListener {

    @Bind(R.id.tv_food)
    TextView tvFood;
    @Bind(R.id.tv_clothes)
    TextView tvClothes;
    @Bind(R.id.tv_schooling)
    TextView tvSchooling;
    @Bind(R.id.tv_health)
    TextView tvHealth;
    @Bind(R.id.tv_animals)
    TextView tvAnimals;
    @Bind(R.id.tv_nature)
    TextView tvNature;
    @Bind(R.id.tv_globalCrisis)
    TextView tvGlobalCrisis;
    @Bind(R.id.tv_compignName_foodList)
    TextView tvCompignNameFoodList;
    @Bind(R.id.tv_compignAmount_foodList)
    TextView tvCompignAmountFoodList;
    @Bind(R.id.tv_compignDate_foodList)
    TextView tvCompignDateFoodList;
    @Bind(R.id.tv_compignDonation_foodList1)
    TextView tvCompignDonationFoodList;
    @Bind(R.id.tv_compignView_foodList)
    TextView tvCompignViewFoodList;
    @Bind(R.id.tv_compignComment_foodList)
    TextView tvCompignCommentFoodList;
    @Bind(R.id.tv_compignStar_foodList)
    TextView tvCompignStarFoodList;
    private ImageView ivFood;

    private LinearLayout one, two;
    private RadioGroup rgOne;
    private Spinner spOne, sp_type_dona, sp_month, sp_year;
    private TextView tvOne, tv_terms;
    private View clickDonation, clickClothes;
    private RadioButton rb_donation, rb_otherDonation;
    private RadioGroup myRadioGroup, visaGroup;


    private FoodFragment foodFragment;
    private View foodView, click_btn_giveDonation;
    private LinearLayout linearMainCampaign, linear_clothes_compaign;

    private Button btnGiveDonation;
    private EditText etNamePaypal, etEmailPaypal, etPasswordPaypal, et_name_visa;

    MyApplication myApplication;
    private Typeface fontType;

    private FloatingActionButton fabList;

    String[] typeDonation = {"Type Of donation", "Clothes", "Drugs or Health equipment", "Books",
            "Computer accessories", "Other donations"};


    String[] typeRecuperation = {"At home", "Send by post", "Delivered directly to the foundation", "Others"};

    String[] month = {"Month", "01", "02", "03", "04", "05", "06", "07", "08"};

    String[] year = {"Year", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"};

    public static CampaignFragment newInstance(int index) {
        CampaignFragment fragment = new CampaignFragment();
        Bundle b = new Bundle();
        b.putInt("index", index);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_screen, container, false);
        ButterKnife.bind(this, rootView);
        ivFood = (ImageView) rootView.findViewById(R.id.iv_food);
        foodView = rootView.findViewById(R.id.click_food);
        linearMainCampaign = (LinearLayout) rootView.findViewById(R.id.linear_main_campaign);

        /*fabList = (FloatingActionButton) rootView.findViewById(R.id.fabList);

        fabList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), RegisterCampaignActivity.class));
            }
        });*/
        TextView list = (TextView) rootView.findViewById(R.id.fabList);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), RegisterCampaignActivity.class));
            }
        });

        sp_month = (Spinner) rootView.findViewById(R.id.sp_month);
        SpinnerTextAdapter spMonth = new SpinnerTextAdapter(getActivity(), month);
        sp_month.setAdapter(spMonth);


        sp_year = (Spinner) rootView.findViewById(R.id.sp_year);
        SpinnerTextAdapter spYear = new SpinnerTextAdapter(getActivity(), year);
        sp_year.setAdapter(spYear);


        clickDonation = rootView.findViewById(R.id.click_donation);
        clickClothes = rootView.findViewById(R.id.click_clothes);

        btnGiveDonation = (Button) rootView.findViewById(R.id.btn_give_donation_campaign_people);

        visaGroup = (RadioGroup) rootView.findViewById(R.id.rg_visa_paypal);

        linear_clothes_compaign = (LinearLayout) rootView.findViewById(R.id.linear_clothes_compaign);

        one = (LinearLayout) rootView.findViewById(R.id.linear_person_number);
        two = (LinearLayout) rootView.findViewById(R.id.linear_condition);
        rgOne = (RadioGroup) rootView.findViewById(R.id.myRadioGroup_amount);
        spOne = (Spinner) rootView.findViewById(R.id.sp_method_recuputation);
        tvOne = (TextView) rootView.findViewById(R.id.tv_estimated_value_donation);
        tv_terms = (TextView) rootView.findViewById(R.id.tv_terms);

        rb_otherDonation = (RadioButton) rootView.findViewById(R.id.rb_otherDonation);
        rb_donation = (RadioButton) rootView.findViewById(R.id.rb_donation);
        myRadioGroup = (RadioGroup) rootView.findViewById(R.id.myRadioGroup);

        sp_type_dona = (Spinner) rootView.findViewById(R.id.sp_type_dona);

        etNamePaypal = (EditText) rootView.findViewById(R.id.et_name_paypal);
        etEmailPaypal = (EditText) rootView.findViewById(R.id.et_email_paypal);
        etPasswordPaypal = (EditText) rootView.findViewById(R.id.et_password_paypal);
        et_name_visa = (EditText) rootView.findViewById(R.id.et_name_visa);

        click_btn_giveDonation = rootView.findViewById(R.id.click_btn_giveDonation);
        click_btn_giveDonation.setVisibility(View.GONE);
        etNamePaypal.setVisibility(View.GONE);
        etEmailPaypal.setVisibility(View.GONE);
        etPasswordPaypal.setVisibility(View.GONE);

        SpinnerTextAdapter spinnerTextAdapter = new SpinnerTextAdapter(getActivity(), typeDonation);
        // attaching data adapter to spinner
        sp_type_dona.setAdapter(spinnerTextAdapter);

        SpinnerTextAdapter spinnerTextAdapter1 = new SpinnerTextAdapter(getActivity(), typeRecuperation);
        spOne.setAdapter(spinnerTextAdapter1);

        myRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_donation) {
                    one.setVisibility(View.GONE);
                    two.setVisibility(View.GONE);
                    spOne.setVisibility(View.GONE);
                    tvOne.setVisibility(View.GONE);

                    tv_terms.setVisibility(View.VISIBLE);
                    tv_terms.setVisibility(View.VISIBLE);
                    rgOne.setVisibility(View.VISIBLE);
                } else if (checkedId == R.id.rb_otherDonation) {
                    one.setVisibility(View.VISIBLE);
                    two.setVisibility(View.VISIBLE);
                    tv_terms.setVisibility(View.GONE);
                    rgOne.setVisibility(View.GONE);
                    spOne.setVisibility(View.VISIBLE);
                    tvOne.setVisibility(View.VISIBLE);
                    tv_terms.setVisibility(View.GONE);
                }
            }
        });


        visaGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rb_visa) {
                    etNamePaypal.setVisibility(View.GONE);
                    etEmailPaypal.setVisibility(View.GONE);
                    etPasswordPaypal.setVisibility(View.GONE);
                    et_name_visa.setVisibility(View.VISIBLE);
                } else if (checkedId == R.id.rb_paypal) {
                    et_name_visa.setVisibility(View.GONE);
                    etNamePaypal.setVisibility(View.VISIBLE);
                    etEmailPaypal.setVisibility(View.VISIBLE);
                    etPasswordPaypal.setVisibility(View.VISIBLE);

                }
            }
        });


        foodView.setVisibility(View.GONE);
        clickDonation.setVisibility(View.GONE);
        clickClothes.setVisibility(View.GONE);

        one.setVisibility(View.GONE);
        two.setVisibility(View.GONE);
        spOne.setVisibility(View.GONE);
        tvOne.setVisibility(View.GONE);

        ivFood.setOnClickListener(this);
        tvCompignDonationFoodList.setOnClickListener(this);
        linear_clothes_compaign.setOnClickListener(this);
        btnGiveDonation.setOnClickListener(this);
        /*fontType = myApplication.getGujFont(getActivity());
        tvFood.setTypeface(fontType);
        tvAnimals.setTypeface(fontType);
        tvClothes.setTypeface(fontType);
        tvGlobalCrisis.setTypeface(fontType);
        tvHealth.setTypeface(fontType);
        tvNature.setTypeface(fontType);
        tvSchooling.setTypeface(fontType);
        tvCompignAmountFoodList.setTypeface(fontType);
        tvCompignCommentFoodList.setTypeface(fontType);
        tvCompignDateFoodList.setTypeface(fontType);
        tvCompignNameFoodList.setTypeface(fontType);
        tvCompignStarFoodList.setTypeface(fontType);*/

        tvFood.setText("Food");
        tvClothes.setText("Clothes");
        tvSchooling.setText("Schooling");
        tvNature.setText("Nature");
        tvGlobalCrisis.setText("Global Crisis");
        tvAnimals.setText("Animals");
        tvHealth.setText("Health");


        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_food:
                foodView.setVisibility(View.VISIBLE);
                linearMainCampaign.setVisibility(View.GONE);
                break;

            case R.id.tv_compignDonation_foodList1:
                clickDonation.setVisibility(View.VISIBLE);
                foodView.setVisibility(View.GONE);
                linearMainCampaign.setVisibility(View.GONE);
                break;
            case R.id.linear_clothes_compaign:
                clickClothes.setVisibility(View.VISIBLE);
                linearMainCampaign.setVisibility(View.GONE);
                break;
            case R.id.btn_give_donation_campaign_people:
                click_btn_giveDonation.setVisibility(View.VISIBLE);
                clickDonation.setVisibility(View.GONE);
                foodView.setVisibility(View.GONE);
                linearMainCampaign.setVisibility(View.GONE);
                break;
        }
    }

}
