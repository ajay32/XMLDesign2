package ajaymehta.xmldesign2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // margin attribute do two things ...if a  compoment has spacev(match_parent or any bigger than wrap_contet
        //1. it will squeeze it ..
        //2  as will it will give distance from other component ...


        // if a component is wrap_content ..it is only gonna give distance from other components...
    }
}
