package in.vaksys.generous.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import in.vaksys.generous.R;

/**
 * Created by dell980 on 6/1/2016.
 */
public class MonitoringDonationFragment extends Fragment implements View.OnClickListener {

    private CardView card_main_one;
    View one, two, three;
    ImageView rightArrow, leftArrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_view, container, false);

        card_main_one = (CardView) rootView.findViewById(R.id.card_main_one);
        one = rootView.findViewById(R.id.one);
        two = rootView.findViewById(R.id.two);
        three = rootView.findViewById(R.id.three);
        rightArrow = (ImageView) rootView.findViewById(R.id.iv_right_arrow);
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
}
