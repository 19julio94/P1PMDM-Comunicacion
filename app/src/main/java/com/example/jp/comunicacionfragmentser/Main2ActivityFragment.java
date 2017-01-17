package com.example.jp.comunicacionfragmentser;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;
import static com.example.jp.comunicacionfragmentser.MainActivityFragment.CODE;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista2=inflater.inflate(R.layout.fragment_main2, container, false);


        TextView texto2=(TextView)vista2.findViewById(R.id.tv2);
        String str=getActivity().getIntent().getStringExtra("llamarActivity1");

        texto2.setText(str);
        Button botonEnviar=(Button)vista2.findViewById(R.id.send);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent();
                i2.putExtra("LlamarActivity2","Hola desde la activity 2");

                getActivity().setResult(RESULT_OK,i2);
                getActivity().finish();


            }
        });






        return vista2;
    }
}
