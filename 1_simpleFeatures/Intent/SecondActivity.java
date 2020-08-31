package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //to get the information send by the intent from the former activity
    Intent intent = getIntent();

    String username = intent.getStringExtra("username");

    Toast.makeText(this, username, Toast.LENGTH_SHORT).show();


    //in order to get a hashmap
    myHashMap = (<cast to right Hashmaptype>) intent.getSerializableExtra("myHashMap")



  }
}
