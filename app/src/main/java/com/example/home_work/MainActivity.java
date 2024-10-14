package com.example.home_work;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        TextView textView = findViewById(R.id.textView);
        Button bt1 = findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int x = random.nextInt(5);
                if(x == 0)
                {
                    textView.setText("i like you");
                }
                else if(x == 1)
                {
                    textView.setText("i don't like you");
                }
                if(x == 2)
                {
                    textView.setText("stop pressing ");
                }
                else if(x == 3)
                {
                    textView.setText("no need to press again");
                }
                if(x == 4)
                {
                    textView.setText("you again?!?!?!");
                }


            }

        });


    }
}