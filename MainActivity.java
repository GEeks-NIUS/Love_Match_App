package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;


public class MainActivity extends Activity 
{  
    private TextView tV1;
	private TextView tV2;
	private TextView TextRes;
	private EditText etyName;
	private EditText etycName;
	private Button matchBtn;
	private Button resBtn;
	private Integer name1, name2, rem;

	private void MatchFunction(){
  
		if(etycName.length() == 0){
			TextRes.setText("Please Fill Up Your Crush's Full Name!!!");
		}
		else if(etyName.length() == 0){
			TextRes.setText("Please Fill Up Your Nickname!!!");
		}
		else{
			
			name1 = etycName.length();
			name2 =  etyName.length();
			rem = name1 % name2;
			
            switch(rem){
			case 0:
				TextRes.setText("FRIENDS Only! :-)");
			break;

			case 1:
				TextRes.setText("LOVERS! <3");
			break;

			case 2:
				TextRes.setText("ATTRACTED to Each Other! ;¬)");
			break;

			case 3:
				TextRes.setText("turns to MARRIAGE! :¬*");
			break;

			case 4:
				TextRes.setText("ENEMIES! ;¬(");
			break;

			default:
				TextRes.setText("SOULMATES! @_@");
			break;
			
			}
         
		}
		
	}
   
	private void EditTextClearFunction(){
		
		tV1.setText("Your Crush's Full Name");
		tV2.setText("Your Nickname");
		etyName.setText("");
		etycName.setText("");
	}
	
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		TextRes = (TextView)findViewById(R.id.result);
		tV1 = (TextView)findViewById(R.id.textv1);
		tV2 = (TextView)findViewById(R.id.textv2);
		etyName = (EditText)findViewById(R.id.yName);
		etycName = (EditText)findViewById(R.id.ycName);
		matchBtn = (Button)findViewById(R.id.goBtn);
	    resBtn = (Button)findViewById(R.id.resetBtn);
		
		matchBtn.setOnClickListener(new View.OnClickListener()
		{
		
	        
			@Override
		    public void onClick(View arg0)
			{
				MatchFunction();
			}
			
		});
	
		resBtn.setOnClickListener (new View.OnClickListener()
		{
		 
			@Override
			public void onClick(View arg0){
			
			   TextRes.setText("F.L.A.M.E.S.");
	    	   EditTextClearFunction();
			
			}
			
		});
	
		etyName.setOnClickListener (new View.OnClickListener()
			{

				@Override
				public void onClick(View arg0){

                 EditTextClearFunction();

				}

			});
	
		etycName.setOnClickListener (new View.OnClickListener()
			{

				@Override
				public void onClick(View arg0){

				 EditTextClearFunction();
					
				}

			});
	
	}
}
    
	
