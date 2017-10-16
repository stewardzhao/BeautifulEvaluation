package ca.bcit.comp2052.a00643427.beautifulevaluation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static ca.bcit.comp2052.a00643427.beautifulevaluation.MainActivity.girls_Score;

public class GirlsScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls_score);

       final String girls1[] = getResources().getStringArray(R.array.girlsName_array);

        TextView textView1 = (TextView) findViewById(R.id.textView);
        Integer arraySize = girls1.length;
        for(int l=0; l<arraySize; l++){
            textView1.append(girls1[l]+"  "+girls_Score[l]+"\n");
        }

        Button buttonNext = (Button) findViewById(R.id.backHome);
        buttonNext.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(GirlsScore.this, MainActivity.class));
            }
        });
    }
}
