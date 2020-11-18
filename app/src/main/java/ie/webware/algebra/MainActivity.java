package ie.webware.algebra;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.nio.charset.*;
import java.io.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textView = findViewById(R.id.textId);
        textView.setText(Constants.Sigma);
        
    }
}

/*

*/
