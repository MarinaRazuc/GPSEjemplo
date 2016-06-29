package fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lenovo.gpsejemplo.R;

public class botones extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.botoneslayout, container, false);
       /* Button button = (Button) view.findViewById(R.id.botonGuardarPos);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            // Do something in response to button click


            }
        });*/
        return view;
    }




}