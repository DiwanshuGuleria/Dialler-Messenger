package com.example.user.diallermessenger;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;



public class Contacts extends Fragment {


    public Contacts() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final String[] names={"Fire","Water","Earth","Sky","Wind"};
        //for default adapter
        // ListAdapter SageAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Type);
     //   ListAdapter SageAdapter = new CustomAdapter(this,Type);
       // ListView SageList = (ListView)findViewById(R.id.Listview);
        ListAdapter SageAdapter = new custom_contact_adapter(this,nu);
        ListView SageList = (ListView)getView().findViewById(R.id.listView);
        SageList.setAdapter(SageAdapter);

        SageList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String type = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(Contacts.this,names,Toast.LENGTH_LONG).show();
                    }
                });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }

}
