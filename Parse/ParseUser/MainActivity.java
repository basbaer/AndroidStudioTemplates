package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
		
		
		//<Log in a User anonymous>
		
		
		//LogIn a User without Username and password
		            
        ParseAnonymousUtils.logIn(new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {

				if(e == null){
					Log.i("Anonymous LogIn", "Successful");
				}else{
					Log.i("Anonymous LogIn", "Failed");
				}

             }
        });
		
		//</Log in a User anonymous>

    }
}
