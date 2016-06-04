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
public class FoundationsFragment extends Fragment {

    private Spinner spDonationAccept;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_foundations, container, false);

        spDonationAccept = (Spinner) rootView.findViewById(R.id.sp_donationAccept);

        List<String> donationType = new ArrayList<String>();
        donationType.add("Type of Donation accepted?");
        donationType.add("Cash");
        donationType.add("Check");
        donationType.add("Debit-card");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, donationType);

        // Drop down layout style - list view with radio button
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spDonationAccept.setAdapter(dataAdapter1);

        return rootView;
    }
}
