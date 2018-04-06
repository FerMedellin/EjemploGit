package handler.moi.android.fr.emptyactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {

    private CardView profileCard,mapCard,cameraCard,statsCard,saveCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //set view references to our objects by defining them
        profileCard = (CardView) findViewById(R.id.profile_card);
        mapCard = (CardView) findViewById(R.id.map_card);
        cameraCard = (CardView) findViewById(R.id.camera_card);
        statsCard = (CardView) findViewById(R.id.stats_card);
        saveCard = (CardView) findViewById(R.id.save_card);

        //Add click listener to the cards
        profileCard.setOnClickListener(this);
        mapCard.setOnClickListener(this);
        cameraCard.setOnClickListener(this);
        statsCard.setOnClickListener(this);
        saveCard.setOnClickListener(this);
    }

    @Override
    //the onclikc method will be called when we click on a cardview
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.profile_card : i = new Intent(this,MainActivity.class);startActivity(i);break;
            case R.id.map_card : i = new Intent(this,MapsActivity.class);startActivity(i);break;
            case R.id.camera_card : i = new Intent(this,Camera.class);startActivity(i);break;
            case R.id.stats_card: i = new Intent(this,Stats.class);startActivity(i);break;
            case R.id.save_card: i = new Intent(this,SaveActivity.class);startActivity(i);break;
            default:break;


        }

    }
}
