package com.example.gautamdhariharan.semadio.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.gautamdhariharan.semadio.R;
import com.example.gautamdhariharan.semadio.activity.video;
import com.example.gautamdhariharan.semadio.other.ScreenParam;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private LinearLayout ll;

    private OnFragmentInteractionListener mListener;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onActivityCreated(Bundle SavedInstance){
        super.onActivityCreated(SavedInstance);
        home_setup();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    void home_setup(){
        ScreenParam sp = new ScreenParam();
        int width = sp.getScreenWidth(HomeFragment.this.getActivity());
        int height = sp.getScreenHeight(HomeFragment.this.getActivity());
        TextView text;
        int height_ad,height_vid;
        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
            height_ad=(int)(height/2.5);
            height_vid=height/3;
            width= width*3/4;
        }
        else{
            height_ad= (int) (height/1.8);
            height_vid=(height/2);
            width=width*3/4;
        }
        ll=(LinearLayout)getActivity().findViewById(R.id.adll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_ad);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomeFragment.this.getActivity(),video.class);
                    startActivity(i);
                }
            });
        }
        ll=(LinearLayout)getActivity().findViewById(R.id.engll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomeFragment.this.getActivity(),video.class);
                    startActivity(i);
                }
            });
        }
        ll=(LinearLayout)getActivity().findViewById(R.id.hinll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomeFragment.this.getActivity(),video.class);
                    startActivity(i);
                }
            });
        }
        ll=(LinearLayout)getActivity().findViewById(R.id.tamll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomeFragment.this.getActivity(),video.class);
                    startActivity(i);
                }
            });
        }
        ll=(LinearLayout)getActivity().findViewById(R.id.mpll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomeFragment.this.getActivity(),video.class);
                    startActivity(i);
                }
            });
        }
        ll=(LinearLayout)getActivity().findViewById(R.id.telll);
        for(int j=0;j<ll.getChildCount();j++){
            text = (TextView)ll.getChildAt(j);
            text.setWidth(width);
            text.setHeight(height_vid);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(HomeFragment.this.getActivity(),video.class);
                    startActivity(i);
                }
            });
        }
        text = (TextView)getActivity().findViewById(R.id.mostviewed);
        text.setHeight(height/5);
        text = (TextView)getActivity().findViewById(R.id.english);
        text.setHeight(height/5);
        text = (TextView)getActivity().findViewById(R.id.hindi);
        text.setHeight(height/5);
        text = (TextView)getActivity().findViewById(R.id.tamil);
        text.setHeight(height/5);
        text = (TextView)getActivity().findViewById(R.id.kannada);
        text.setHeight(height/5);

    }

    public void click(View v){
        Intent i = new Intent(HomeFragment.this.getActivity(),video.class);
        startActivity(i);
    }

}
