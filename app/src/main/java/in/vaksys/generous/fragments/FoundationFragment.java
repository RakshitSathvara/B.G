package in.vaksys.generous.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import in.vaksys.generous.R;
import in.vaksys.generous.extras.MyApplication;

/**
 * Created by dell980 on 6/1/2016.
 */
public class FoundationFragment extends Fragment {
    @Bind(R.id.tv_name_foundation)
    TextView tvNameFoundation;
    @Bind(R.id.tv_comment_foundation)
    TextView tvCommentFoundation;
    @Bind(R.id.tv_like_foundation)
    TextView tvLikeFoundation;
    @Bind(R.id.tv_comapaign_foundation)
    TextView tvComapaignFoundation;
    @Bind(R.id.tv_site_foundation)
    TextView tvSiteFoundation;
    @Bind(R.id.tv_contact_foundation)
    TextView tvContactFoundation;

    private MyApplication myApplication;
    private Typeface fontType;

    public static FoundationFragment newInstance(int index) {
        FoundationFragment fragment = new FoundationFragment();
        Bundle b = new Bundle();
        b.putInt("index", index);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_foundation_main, container, false);
        ButterKnife.bind(this, rootView);

        /*fontType = myApplication.getGujFont(getActivity());
        tvComapaignFoundation.setTypeface(fontType);
        tvCommentFoundation.setTypeface(fontType);
        tvContactFoundation.setTypeface(fontType);
        tvLikeFoundation.setTypeface(fontType);
        tvNameFoundation.setTypeface(fontType);
        tvSiteFoundation.setTypeface(fontType);*/
        return rootView;
    }


}
