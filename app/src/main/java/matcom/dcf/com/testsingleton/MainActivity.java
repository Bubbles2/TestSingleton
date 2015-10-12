package matcom.dcf.com.testsingleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), Singleton.getInstance().getString(), Toast.LENGTH_SHORT).show();

        Toast.makeText(getApplicationContext(), Singleton.getInstance().getString(), Toast.LENGTH_SHORT).show();


    }
}
