package in.vaksys.generous.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import in.vaksys.generous.R;
import in.vaksys.generous.extras.MyApplication;

/**
 * Created by dell980 on 6/1/2016.
 */
public class MonitoringDonationFragment extends Fragment implements View.OnClickListener {

    @Bind(R.id.tv_helpMoocconName_one)
    TextView tvHelpMoocconNameOne;
    @Bind(R.id.tv_helpMoocconAmount_two)
    TextView tvHelpMoocconAmountTwo;
    @Bind(R.id.tv_helpMoocconDate_three)
    TextView tvHelpMoocconDateThree;
    @Bind(R.id.tv_helpMooccon_sosAfrica)
    TextView tvHelpMoocconSosAfrica;
    @Bind(R.id.tv_donor)
    TextView tvDonor;
    @Bind(R.id.tv_date)
    TextView tvDate;
    @Bind(R.id.tv_amount)
    TextView tvAmount;
    @Bind(R.id.tv_donorName_donorList)
    TextView tvDonorNameDonorList;
    @Bind(R.id.tv_dateDonor_donorList)
    TextView tvDateDonorDonorList;
    @Bind(R.id.tv_ammount_donorList)
    TextView tvAmmountDonorList;
    @Bind(R.id.tv_typeOfDonation)
    TextView tvTypeOfDonation;
    @Bind(R.id.tv_number)
    TextView tvNumber;
    @Bind(R.id.tv_cityAndCountry)
    TextView tvCityAndCountry;
    @Bind(R.id.tv_methodOfRecu)
    TextView tvMethodOfRecu;
    @Bind(R.id.tv_typeOfDonation_moroccon)
    TextView tvTypeOfDonationMoroccon;
    @Bind(R.id.tv_number_moroccon)
    TextView tvNumberMoroccon;
    @Bind(R.id.tv_city_moroccon)
    TextView tvCityMoroccon;
    @Bind(R.id.tv_country_moroccon)
    TextView tvCountryMoroccon;
    @Bind(R.id.tv_location)
    TextView tvLocation;
    @Bind(R.id.tv_locationMessage)
    TextView tvLocationMessage;
    private CardView card_main_one;
    View one, two, three;
    ImageView leftArrow;
    LinearLayout rightArrow;

    MyApplication myApplication;
    Typeface fontType;

    public static MonitoringDonationFragment newInstance(int index) {
        MonitoringDonationFragment fragment = new MonitoringDonationFragment();
        Bundle b = new Bundle();
        b.putInt("index", index);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_view, container, false);
        ButterKnife.bind(this, rootView);
        /*fontType = myApplication.getGujFont(getActivity());
        tvHelpMoocconAmountTwo.setTypeface(fontType);
        tvHelpMoocconDateThree.setTypeface(fontType);
        tvHelpMoocconNameOne.setTypeface(fontType);
        tvHelpMoocconSosAfrica.setTypeface(fontType);
        tvAmount.setTypeface(fontType);
        tvDate.setTypeface(fontType);
        tvDonor.setTypeface(fontType);
        tvAmmountDonorList.setTypeface(fontType);
        tvDonorNameDonorList.setTypeface(fontType);
        tvDateDonorDonorList.setTypeface(fontType);
        tvTypeOfDonation.setTypeface(fontType);
        tvNumber.setTypeface(fontType);
        tvCityAndCountry.setTypeface(fontType);
        tvMethodOfRecu.setTypeface(fontType);
        tvTypeOfDonationMoroccon.setTypeface(fontType);
        tvNumberMoroccon.setTypeface(fontType);
        tvCityMoroccon.setTypeface(fontType);
        tvCountryMoroccon.setTypeface(fontType);
        tvLocation.setTypeface(fontType);
        tvLocationMessage.setTypeface(fontType);*/


        card_main_one = (CardView) rootView.findViewById(R.id.card_main_one);
        one = rootView.findViewById(R.id.one);
        two = rootView.findViewById(R.id.two);
        three = rootView.findViewById(R.id.three);
        rightArrow = (LinearLayout) rootView.findViewById(R.id.iv_right_arrow);
        leftArrow = (ImageView) rootView.findViewById(R.id.iv_left_arrow);

        one.setVisibility(View.GONE);
        two.setVisibility(View.GONE);

        card_main_one.setOnClickListener(this);
        rightArrow.setOnClickListener(this);
        leftArrow.setOnClickListener(this);


        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card_main_one:
                one.setVisibility(View.VISIBLE);
                three.setVisibility(View.GONE);
                break;

            case R.id.iv_right_arrow:
                two.setVisibility(View.VISIBLE);
                one.setVisibility(View.GONE);
                three.setVisibility(View.GONE);
                break;
            case R.id.iv_left_arrow:
                two.setVisibility(View.GONE);
                one.setVisibility(View.GONE);
                three.setVisibility(View.VISIBLE);
                break;

        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
