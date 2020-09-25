package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;
  SharedPreferences sharedPreferences;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    sharedPreferences = this.getSharedPreferences("<Package name>", Context.MODE_PRIVATE);

    //saving something in the sharedPreference
    sharedPreferences.edit().putString(<key>,<value>).apply();

    //get something from sharedPreference
    //default value is needed, if there is nothing stored corresponding to the key
    sharedPreferences.get(<key>, <defaul_value>);


    //<save a ArrayList in a SharedPreference: Option 1>
    //needs a ObjectSerializer
    try{
      sharedPreferences.edit().putString("<key>", ObjectSerializer.serialize(<your ArrayList>)).apply();
    }catch(IOExceptione){
      e.printStackTrace();
    }

    //get a ArrayList from SharedPreference
    ArrayList<String> arrayList = new ArrayList<>();


    try{
      //default value is a empty ArrayList
      arrayList  = (ArrayList<String>) ObjectSerializer.deserialize(sharedPreferences.getString("<key>", ObjectSerializer.serialize(new ArrayList<String>())));
    }catch(IOException e){
      e.printStackTrace();
    }

    //</save a ArrayList in a SharedPreference: Option 1>



    //<save a ArrayList in a SharedPreference: Option 2>
    //save it in a HashSet
    Hashset<String> set = new HashSet(<my ArrayList>);

    sharedPreferences.edit().putStringSet("<key>", set).apply();

    //get it back
    Hashset<String> newSet = (HashSet<String>) sharedPreferences.getStringSet("<key>", null);
    ArrayList<String> arrayList = new ArrayList<>(newSet);




    //</save a ArrayList in a SharedPreference: Option 2>




  }
}
