package com.example.anthony.quizv1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TextFrag.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TextFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TextFrag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4 = "param4";

    // TODO: Rename and change types of parameters
    private String q1;
    private String q2;
    private String q3;
    private String q4;

    private TextView question;
    private RadioButton button1;
    private RadioButton button2;
    private RadioButton button3;

    private String[] question1 = {"What is the number for mobile systems and development",
            "367" , "407" , "536"};
    private String [] question2 = {"What days of the week do we have class?", "M W TH",
            "W TH F", "M W F"};
    private String [] question3 = {"What union is the computer science building next to", "Union " +
            "South", "Memorial Union"};


    private OnFragmentInteractionListener mListener;

    public TextFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TextFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static TextFrag newInstance(String param1, String param2, String param3, String param4) {
        TextFrag fragment = new TextFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        args.putString(ARG_PARAM4, param4);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            q1= getArguments().getString(ARG_PARAM1);
            q2 = getArguments().getString(ARG_PARAM2);
            q3 = getArguments().getString(ARG_PARAM3);
            q4 = getArguments().getString(ARG_PARAM4);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text, container, false);
        question = (TextView)view.findViewById(R.id.radioButton);
        button1 = (RadioButton)view.findViewById(R.id.radioButton);
        button2 = (RadioButton)view.findViewById(R.id.radioButton);
        button3 = (RadioButton)view.findViewById(R.id.radioButton);

        if(q1==null)
        {
            question.setText(question1[0]);
            button1.setText(question1[1]);
            button2.setText(question1[2]);
            button3.setText(question1[3]);
        }
        return view;
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
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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
