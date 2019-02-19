package clicksource.ir.tas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnTas;
    TextView txtNumber;
    String test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber=(TextView) findViewById(R.id.txt_main_number);
        btnTas=(Button)findViewById(R.id.btn_main_tas);

        btnTas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number=new Random().nextInt(6);
                number++;
                txtNumber.setText(number+"");
            }
        });
    }
}
