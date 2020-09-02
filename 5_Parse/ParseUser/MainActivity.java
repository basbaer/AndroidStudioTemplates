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

    //<get a list of all users>
    ParseQuery<ParseUser> userParseQuery = ParseQuery.getQuery("_User");


    userParseQuery.findInBackground(new FindCallback<ParseUser>(){
      @Override
      public void done(List<ParseUser> userList, ParseException e){

        if(e == null){

          Log.i("findInBackground", "Retrieved " + userList.size() + " objects");

          if(userList.size() > 0){

            for(ParseUser user : userList){

              Log.i("QueryResults", user.getUsername());

              //add the users to an ArrayList
              userArrayList.add(user.getUsername());


            }
          }
        }

      }


    });
    //</get a list of all users>


    //<Users-Query>
    ParseQuery<ParseUser> UserQuery = ParseUser.getQuery();
    UserQuery.whereEqualTo("<name of column>", "<value>");
    UserQuery.findInBackground(new FindCallback<ParseUser>() {
      public void done(List<ParseUser> objects, ParseException e) {
        if (e == null) {
          // The query was successful.
        } else {
          // Something went wrong.
        }
      }
    });

    //</Users-Query>





  }
}
