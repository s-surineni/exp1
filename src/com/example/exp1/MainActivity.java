package com.example.exp1;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	//Button fon=(Button)findViewById(R.id.click);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startLis();
        
    }

    void startLis(){
    	Button fon=(Button)findViewById(R.id.click);
    	fon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				getTheIn();
			}
		});
    }
    
    void getTheIn(){
    	EditText nm1=(EditText)findViewById(R.id.name1);
    	EditText nm2=(EditText)findViewById(R.id.name2);
    	String nam1=nm1.getText().toString();
    	String nam2=nm2.getText().toString();
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
