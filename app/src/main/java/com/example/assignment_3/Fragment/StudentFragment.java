package com.example.assignment_3.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.assignment_3.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudentFragment extends Fragment  implements AdapterView.OnItemClickListener{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_courses, container, false);
    }
    @Override
    public void onViewCreated(@Nullable View view ,@Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        String[] Course = {"Abubakar","Ali","Umar","Usman","Abdullah","Akram","Salman","Haziq","Haris","Babar","Hafeez"};
        ListView listView =(ListView)view.findViewById(R.id.CoursesList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),R.layout.listdesign,Course);
        //  ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),R.layout.simple_list_item_1,Course);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}