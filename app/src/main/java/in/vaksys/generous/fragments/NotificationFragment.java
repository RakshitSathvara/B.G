package in.vaksys.generous.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import in.vaksys.generous.R;

/**
 * Created by dell980 on 6/2/2016.
 */
public class NotificationFragment extends Fragment {

    private Spinner spNotiNameOfCompaign, spotificationRecieptDonations;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.comment, container, false);

//        spNotiNameOfCompaign = (Spinner) rootView.findViewById(R.id.sp_notification_nameOfFoundation);
//        spotificationRecieptDonations = (Spinner) rootView.findViewById(R.id.sp_notification_receiptDonation);
//
//        List<String> categories = new ArrayList<String>();
//        categories.add("3 Days");
//        categories.add("5 Days");
//        categories.add("10 Days");
//        categories.add("9 Days");
//        categories.add("7 Days");
//        categories.add("2 Days");
//
//        // Creating adapter for spinner
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);
//
//        // Drop down layout style - list view with radio button
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        // attaching data adapter to spinner
//        spNotiNameOfCompaign.setAdapter(dataAdapter);
//
//
//        List<String> donation = new ArrayList<String>();
//        donation.add("All Donations");
//        donation.add("1 month");
//        donation.add("6 month");
//
//
//        // Creating adapter for spinner
//        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, donation);
//
//        // Drop down layout style - list view with radio button
//        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        // attaching data adapter to spinner
//        spotificationRecieptDonations.setAdapter(dataAdapter1);

        return rootView;
    }
}
