package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
		
		//<Sign up a user>
		ParseUser user = new ParseUser();

		user.setUsername("discobreak21");

		user.setPassword("myPassword");

		user.signUpInBackground(new SignUpCallback(){
			@Override
			public void done(ParseException e){

				if(e == null){

					Log.i("SignUp", "Successful");

				}else{

					Log.i("SignUp", "Failed");

				}

			}	
		});
		
		//</Sign up a user>
		
		
		//<Log in a User>
		ParseUser.logInInBackground("<username>", "<password>",new LogInCallback(){
			@Override
			public void done(ParseUser user, ParseException e){

				if(user != null){

					Log.i("LogIn", "Successful");

				}else{

					Log.i("LogIn", "Failed: " + e.toString());

				}

			}
		});
		
		//</Log in a User>
		
		
		
		
		//<Log in a User anonymous>
		            
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
		
		
		
		//<check if user is logged in>
		if(ParseUser.getCurrentUser().getUsername() != null){

			Log.i("currentUser", "User logged in " + ParseUser.getCurrentUser().getUsername());

		}else{

			Log.i("currenUser", "User not logged in");

		}
		
		//<check if user is logged in>
		
		
		//<Log out a User>
		ParseUser.logOut();
		//</Log out a User>
		

    }
}
