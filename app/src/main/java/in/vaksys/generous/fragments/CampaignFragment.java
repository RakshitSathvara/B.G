package in.vaksys.generous.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import in.vaksys.generous.R;

/**
 * Created by dell980 on 6/1/2016.
 */
public class CampaignFragment extends Fragment implements View.OnClickListener {

    private ImageView ivFood;

    private FoodFragment foodFragment;
    private View foodView;
    private LinearLayout linearMainCampaign;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_screen, container, false);

        ivFood = (ImageView) rootView.findViewById(R.id.iv_food);
        foodView = rootView.findViewById(R.id.click_food);
        linearMainCampaign = (LinearLayout) rootView.findViewById(R.id.linear_main_campaign);

        foodView.setVisibility(View.GONE);

        ivFood.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_food:
                foodView.setVisibility(View.VISIBLE);
                linearMainCampaign.setVisibility(View.GONE);
                break;
        }

    }
}
