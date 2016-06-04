package in.vaksys.generous.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.vaksys.generous.R;

/**
 * Created by dell980 on 6/1/2016.
 */
public class MonitoringDonationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.food_view, container, false);

        return rootView;
    }
}
