package in.vaksys.generous.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import in.vaksys.generous.R;

/**
 * Created by dell980 on 6/2/2016.
 */
public class FoundationsFragment extends Fragment implements View.OnClickListener {

    private Spinner spDonationAccept;
    private LinearLayout linear_One;
    View foundation_new;
    Button btnSave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_foundations, container, false);

        spDonationAccept = (Spinner) rootView.findViewById(R.id.sp_donationAccept);

        linear_One = (LinearLayout) rootView.findViewById(R.id.linear_one);
        foundation_new = rootView.findViewById(R.id.foundation_new);
        btnSave = (Button) rootView.findViewById(R.id.btn_acceptAndSave_fragmentFoundation);

        foundation_new.setVisibility(View.GONE);

        btnSave.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_acceptAndSave_fragmentFoundation:
                foundation_new.setVisibility(View.VISIBLE);
                linear_One.setVisibility(View.GONE);
                break;
        }
    }
}
