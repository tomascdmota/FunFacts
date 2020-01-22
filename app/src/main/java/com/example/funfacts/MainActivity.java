    package com.example.funfacts;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;

    import androidx.appcompat.app.AppCompatActivity;

    import java.util.Objects;
    import java.util.Random;

    public class MainActivity extends AppCompatActivity {

    Button button;
    Random r;
    int red, green, blue, purple, white, black, orange, brown, yellow, grey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        button = findViewById(R.id.btn);


     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             startActivity(new Intent(MainActivity.this, FunFacts.class));
         }
     });




    }

}
