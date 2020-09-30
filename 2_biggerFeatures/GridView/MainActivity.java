package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;

  GridView myGridView;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //initilazing the GridView
    myGridView = activityMainBinding.gridView;

    //setting up a adapter for it
    MyGridViewAdapter adapter = new MyGridViewAdapter(getApplicationContext());

    myGridView.setAdapter(adapter);

  }
}
