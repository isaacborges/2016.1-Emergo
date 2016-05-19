package unlv.erc.emergo.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.client.Firebase;

import helper.Services;
import unlv.erc.emergo.R;

public class MainScreenController extends Activity {

    private Button goButton , fineButton;
    private Services services;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Firebase.setAndroidContext(this);


        setContentView(R.layout.main_screen);
        goButton = (Button) findViewById(R.id.buttonGo);
        fineButton = (Button) findViewById(R.id.buttonOkay);
    }

    public void goClicked(View main_Screen){

        Toast.makeText(this , "Função não habilitada!" , Toast.LENGTH_SHORT).show();
    }

    public void okayClicked(View main_Screen){

        this.services = new Services();
        this.services.selectHealhUnitys(services.getUserPosition());

        Intent mapScreen = new Intent();
        mapScreen.setClass(this, MapScreenController.class);
        startActivity(mapScreen);
    }

}
