package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //get the current User
    ParseUser.getCurrentUser();





    //<create ParseObject><

    //create the ParseObject -> in the Constructor you have to give the name of the class
    ParseObject myParseObject = new ParseObject("Group");

    //set/create attributs for the variable
    myParseObject.put("groupName", "My private Group");

    //save it
    myParseObject.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e) {
        if(e == null){
          Log.i("SaveInBackground", "Successful");
        }else{
          e.printStackTrace();
        }
      }
    });

    // </create ParseObject>






    //<ParseQuery>

    //Different Options


    //Option 1: get all Objects of the class
    ParseQuery<ParseObject> myParseQuery = ParseQuery.getQuery("<name of class>");

    myParseQuery.findInBackground(new FindCallback<ParseObject>(){
      @Override
      public void done(List<ParseObject> objects, ParseException e){

        if(e == null){

          Log.i("findInBackground", "Retrieved " + objects.size() + " objects");

          if(objects.size() > 0){

            for(ParseObject object : objects){

              Log.i("QueryResults", object.toString());
            }
          }
        }
      }
    });


    //Option 2: Find a ParseObject by its id
    ParseQuery<ParseObject> myParseQuery = ParseQuery.getQuery("<name of class>");

    myParseQuery.getInBackground("<objectId>", new GetCallback<ParseObject>(){
      @Override
      public void done(ParseObject object, ParseException e){

        if(e == null && object != null){

          Log.i("ObjectValue", object.getString("<attribute you want the value of>"));

        }

      }
    });



    //Option 3: get objects with specific values
    ParseQuery<ParseObject> myParseQuery = ParseQuery.getQuery("<name of class>");

    myParseQuery.<method>

    //e.g.: Exclude the currenUser from the results
    myParseQuery.whereNotEqualTo("objectId", ParseUser.getCurrenUser().getObjectId());



    //get a User
    ParseQuery<ParseUser> myParseUserQuery = ParseQuery.getQuery("<name of class>");

    myParseUserQuery.getInBackground("<objectId>", new GetCallback<ParseObject>(){
      @Override
      public void done(ParseObject object, ParseException e){

        if(e == null && object != null){

          Log.i("ObjectValue", object.getString("<attribute you want the value of>"));

        }

      }
    });







    //special features for queries

    //set a Limit of the results
    myParseQuery.setLimit(<maxium number of results>);


    //Arrange results in alphabetical order according to the values of a specific coloum
    myParseQuery.addAscendingOrder("<coloum>");

    //get only fields entries where special coloum has no entry
    myParseQuery.whereDoesNotExist("<coloum>") ;

    //get results around a Geopoint
    myParseQuery.whereNear(">coloum>", <GeoPoint>);


    //Update a value
    ParseQuery<ParseObject> queryForObjectIWantToUpdate = ParseQuery.getQuery("<name of class>");

    queryForObjectIWantToUpdate.getInBackground("<objectId>", new GetCallback<ParseObject>(){
      @Override
      public void done(ParseObject object, ParseException e){

        if(e == null && object != null){

          object.put("<coloum>", <value>);

        }

      }
    });




    //</ParseQuery>








  }
}
