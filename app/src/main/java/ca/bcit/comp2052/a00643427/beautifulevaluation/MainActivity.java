package ca.bcit.comp2052.a00643427.beautifulevaluation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static   Integer imageId=0;
    static float girls_Score[] = {3,3,3,3,3,3,3,3,3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String girls[] = getResources().getStringArray(R.array.girlsName_array);
        RatingBar ratingBar1 = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar1, float rating, boolean fromUser) {
                // Implement your logic here
                girls_Score[imageId] = rating;
                setTitle(girls[imageId]+" Beautiful Score: " + rating);
            }
        });

        final ImageView imageView = (ImageView) findViewById(R.id.imageView4) ;

        final Integer resID[] = {(Integer) R.drawable.bae_suzy,
                                R.drawable.bruna_marquezine,
                                R.drawable.lily_may_mac,
                                R.drawable.nana_1,
                                R.drawable.neelam_gill,
                                R.drawable.nyasha_matonhodze,
                                R.drawable.sara_sampaio,
                                R.drawable.sham_yen_yi,
                                R.drawable.zendaya_1};


        Button button1 = (Button) findViewById(R.id.previous);
        button1.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View v) {
                // Implement your logic here
                if (imageId==0)
                    imageId=9;
                imageId-=1;
                imageView.setImageResource(resID[imageId]);
                setTitle("Selected: " + girls[imageId]);
                Toast.makeText(MainActivity.this,girls[imageId] ,
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.next);
        button2.setOnClickListener(new android.view.View.OnClickListener() {
            //Integer id=0;
            public void onClick(View v) {
                // Implement your logic here
                if (imageId==8)
                    imageId=0;
                imageId+=1;
                imageView.setImageResource(resID[imageId]);
                setTitle("Selected: " + girls[imageId]);
                Toast.makeText(MainActivity.this, girls[imageId],
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button3 = (Button) findViewById(R.id.score);
        button3.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                // Implement your logic here
                //Toast.makeText(MainActivity.this, "Button Score!",
                //       Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, GirlsScore.class));
            }
        });
    }
}
