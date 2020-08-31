package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //Intent switchs the Activity
    Intent intent = new Intent(getApplicationContext(), <Activity you want to switch to>.class);

    //Optional: give some information with the Intent
    intent.putExtra("username","Karl Kani");

    startActivity(intent);



  }
}
