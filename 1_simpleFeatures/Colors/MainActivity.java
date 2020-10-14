package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //get Color from hexa-code
    int mcolor = Color.parseColor(colorString);

    //get the values of for a, r, g and b
    int alpha = Color.alpha(mcolor);
    int r = Color.red(mcolor);
    int g = Color.green(mcolor);
    int b = Color.blue(mcolor);

    //set the values for a, r, g, and b
    int color = Color.argb(<alpha>, <red>, <green>, <blue>);
    int color = Color.rgb(<red>, <green>, <blue>);

  }


  //method which reduces the brightness
  public int reduceBrightnessOfColor(int color){

    int alpha = Color.alpha(color);
    int r = Color.red(color);
    int g = Color.green(color);
    int b = Color.blue(color);

    int MAX_VALUE = 200;

    if(r > MAX_VALUE){color = Color.argb(alpha, MAX_VALUE, g, b);}
    if(g > MAX_VALUE){color = Color.argb(alpha, r, MAX_VALUE, b);}
    if(b > MAX_VALUE){color = Color.argb(alpha, r, g, MAX_VALUE);}

    return color;

}

}
