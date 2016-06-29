package com.example.lenovo.helloworld;

//import android.app.AlertDialog;
//import android.app.NotificationManager;
//import android.app.PendingIntent;

//import android.content.Context;
//import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
//import android.support.v4.app.NotificationCompat;
//import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
//import android.widget.CheckBox;
import android.widget.LinearLayout;
//import android.widget.RadioButton;
import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linea4);
    }
}
        /*Button r1 = (Button) findViewById(R.id.btn1);
        Button r2 = (Button) findViewById(R.id.btn2);
        Button r3 = (Button) findViewById(R.id.btn3);

        r1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView vv = (TextView) findViewById(R.id.texto);
                vv.setText("r1");
            }

        });
*//**
 View lay1 = findViewById(R.id.layout1);
 View lay2 = findViewById(R.id.layout2);
 final View fondo = (LinearLayout) findViewById(R.id.fondo);
 Button boton = new Button(this);
 boton.setText("marinita");
 ((LinearLayout) fondo).addView(boton);
 lay1.setOnTouchListener(new View.OnTouchListener() {
@Override
public boolean onTouch(View v, MotionEvent event) {
fondo.setBackgroundColor(Color.RED);
return false;
}
});

 lay2.setOnTouchListener(new View.OnTouchListener() {
@Override
public boolean onTouch(View v, MotionEvent event) {
fondo.setBackgroundColor(Color.rgb(0, 255, 255));
return false;
}
});
 lay1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
TextView texto = (TextView) findViewById(R.id.texto);
texto.setText("me cliquearon :O");
}
});
 }
 }
 /*

 AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
 builder.setMessage("Andresito te amo <3 ").setTitle("Mensajin");
 builder.setPositiveButton("aceptar",null);
 AlertDialog dialog = builder.create();
 dialog.show();*/

  /*      Toast toast = Toast.makeText(getApplicationContext(),"Borrando tarjeta SD...", Toast.LENGTH_SHORT);
        toast.show();
*//*
        try {

            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(this)
                            .setSmallIcon(R.drawable.gonzacsb)
                            .setContentTitle("My notification")
                            .setContentText("Hello World!");
// Creates an explicit intent for an Activity in your app
            Intent resultIntent = new Intent(this, ResultActivity.class);

// The stack builder object will contain an artificial back stack for the
// started Activity.
// This ensures that navigating backward from the Activity leads out of
// your application to the Home screen.
            TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
// Adds the back stack for the Intent (but not the Intent itself)
            stackBuilder.addParentStack(ResultActivity.class);
// Adds the Intent that starts the Activity to the top of the stack
            stackBuilder.addNextIntent(resultIntent);
            PendingIntent resultPendingIntent =
                    stackBuilder.getPendingIntent(
                            0,
                            PendingIntent.FLAG_UPDATE_CURRENT
                    );
            mBuilder.setContentIntent(resultPendingIntent);
            NotificationManager mNotificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
// mId allows you to update the notification later on.
            mNotificationManager.notify(1, mBuilder.build());
        }catch(Exception e){
            e.printStackTrace();
        }


        }

/*
    public void solucion(View w){
        new Thread(new Runnable() {
            @Override
            public void run() {
                final TextView lbl = (TextView) findViewById(R.id.lb1);

                for (int i = 0; i <= 10; i++) {
                    final int j= i;
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            lbl.setText("" + j);
                        }

                    });

                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();<3
                    }

                }
            }
        }).start();

    }


 /*       final View layoutBtas= findViewById(R.id.afuera);
        layoutBtas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layoutBtas.setBackgroundColor(Color.GREEN);
            }

        });

*/
  /*      layoutBtas.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent e){
                layoutBtas.setBackgroundColor(Color.BLUE);
                return false;
            }

        });

        View uno=findViewById(R.id.uno);
        View dos=findViewById(R.id.dos);

        uno.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent e){
                layoutBtas.setBackgroundColor(Color.MAGENTA);
                return true;
            }

        });

        dos.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent e){
                layoutBtas.setBackgroundColor(Color.BLACK);
                return false;
            }

        });

        //View Checkbox = findViewById(R.id.check);
        //Checkbox.setOnLongClickListener(new View.OnClickListener());
        //@Override public void onClick(View v)

    }


    public void click(View v){
        TextView label= (TextView) findViewById(R.id.texto);
        switch(v.getId()){
            case R.id.btn1:
                    label.setText("Boton 1");

                break;

            case R.id.btn2:
                label.setText("Boton 2");
                break;


            case R.id.btn3:
                label.setText("Boton 3");
                break;
        }
    }


    public void clickCheck(View v) {
        View n = findViewById(R.id.layout);

        if (((CheckBox) v).isChecked())
            n.setVisibility(View.VISIBLE);
        else
            n.setVisibility(View.INVISIBLE);
    }


public void click(View v){
    TextView label= (TextView) findViewById(R.id.texto);
    switch(v.getId()){
        case R.id.btn1:
            label.setText("Boton 1");
            break;

        case R.id.btn2:
            label.setText("Boton 2");
            break;


        case R.id.btn3:
            label.setText("Boton 3");
            break;
    }
}*/

