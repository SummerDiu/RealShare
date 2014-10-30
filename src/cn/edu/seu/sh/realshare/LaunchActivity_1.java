package cn.edu.seu.sh.realshare;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LaunchActivity_1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.launch_activity_1, menu);
        return true;
    }
    
}
