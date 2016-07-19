package in.vaksys.generous.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import in.vaksys.generous.R;
import in.vaksys.generous.adapters.SpinnerTextAdapter;

/**
 * Created by dell980 on 6/2/2016.
 */
public class FoundationsFragment extends Fragment implements View.OnClickListener {

    private Spinner spDonationAccept, spFoundation, spReminder, spReminderCampaigns;
    private LinearLayout linear_One;
    View foundation_new;
    Button btnSave;

    String[] titles = {"Type of Donation accepted?", "Cash", "Drugs or health equipment", "Books","Computer accessories"
            ,"Furniture or appliances","Other Donations"};
    String[] status = {"Status of the foundation", "International organization", "State organization",
            "Organization approved by the state", "Other"};

    String[] reminder = {"I participate", "I participate", "I participate", "I participate"};
    String[] reminderFraq = {"I participate", "I participate", "I participate", "I participate"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_foundations, container, false);

        spDonationAccept = (Spinner) rootView.findViewById(R.id.sp_donationAccept);
        spFoundation = (Spinner) rootView.findViewById(R.id.sp_status_foundation_settings);

        SpinnerTextAdapter spinnerTextAdapter1 = new SpinnerTextAdapter(getActivity(), status);
        spFoundation.setAdapter(spinnerTextAdapter1);


        spReminder = (Spinner) rootView.findViewById(R.id.reminder_campaign);
        spReminderCampaigns = (Spinner) rootView.findViewById(R.id.requently_reminder);

        SpinnerTextAdapter spinnerReminder = new SpinnerTextAdapter(getActivity(), reminder);
        spReminder.setAdapter(spinnerReminder);

        SpinnerTextAdapter spinnerReminderFraq = new SpinnerTextAdapter(getActivity(), reminderFraq);
        spReminderCampaigns.setAdapter(spinnerReminderFraq);

        linear_One = (LinearLayout) rootView.findViewById(R.id.linear_one);
        foundation_new = rootView.findViewById(R.id.foundation_new);
        btnSave = (Button) rootView.findViewById(R.id.btn_acceptAndSave_fragmentFoundation);

        foundation_new.setVisibility(View.GONE);

        btnSave.setOnClickListener(this);

      /*  ArrayList<String> donationType = new ArrayList<String>();
        donationType.add("Type of Donation accepted?");
        donationType.add("Cash");
        donationType.add("Check");
        donationType.add("Debit-card");*/


//        // Creating adapter for spinner
//        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(getActivity(), R.layout.text_spinner, R.id.spin_text, donationType);
//
//        // Drop down layout style - list view with radio button
//        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        SpinnerTextAdapter spinnerTextAdapter = new SpinnerTextAdapter(getActivity(), titles);

        // attaching data adapter to spinner
        spDonationAccept.setAdapter(spinnerTextAdapter);

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
