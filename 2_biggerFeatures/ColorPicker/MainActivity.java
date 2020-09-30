package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;

  GridView colorPickerGridView;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //setting up the ColorPickerGridView
    colorPickerGridView = activityMainBinding.colorGridView;

    //implement an Adapter
    ColorPickerAdapter colorPickerAdapter = new ColorPickerAdapter(this);

    colorPickerGridView.setAdapter(colorPickerAdapter);


  }
}
