package com.example.gautamdhariharan.semadio.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.gautamdhariharan.semadio.R;
import com.example.gautamdhariharan.semadio.other.ScreenParam;
import com.example.gautamdhariharan.semadio.activity.uploaderScreen;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyAccountFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyAccountFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyAccountFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MyAccountFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyAccountFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyAccountFragment newInstance(String param1, String param2) {
        MyAccountFragment fragment = new MyAccountFragment();
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
        return inflater.inflate(R.layout.fragment_my_account, container, false);
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
        ScreenParam sp = new ScreenParam();
        int height=sp.getScreenHeight(MyAccountFragment.this.getActivity());
        TextView textView = (TextView)getActivity().findViewById(R.id.dasht);
        textView.setHeight(height/6);
        textView = (TextView)getActivity().findViewById(R.id.welct);
        textView.setHeight(height/8);
        textView = (TextView)getActivity().findViewById(R.id.stats);
        textView.setHeight(height/8);
        Button b=(Button) getActivity().findViewById(R.id.uploadb);
        b.setHeight(height/6);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MyAccountFragment.this.getActivity(), uploaderScreen.class);
                startActivity(i);
            }
        });
        textView = (TextView)getActivity().findViewById(R.id.numt);
        textView.setHeight(height/12);
        textView = (TextView)getActivity().findViewById(R.id.vit);
        textView.setHeight(height/12);
        textView = (TextView)getActivity().findViewById(R.id.nol);
        textView.setHeight(height/12);
        textView = (TextView)getActivity().findViewById(R.id.vid1);
        textView.setHeight(height/3);
        textView = (TextView)getActivity().findViewById(R.id.vid2);
        textView.setHeight(height/3);
        textView = (TextView)getActivity().findViewById(R.id.vid3);
        textView.setHeight(height/3);
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
}
