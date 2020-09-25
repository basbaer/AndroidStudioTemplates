package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    ImageView background = activityMainBinding.backgroudMainActivityIV;

    //adjusting the picture
    ColorMatrix cm = new ColorMatrix();
    // Increase Contrast, Slightly Reduce Brightness
    float contrast = 0.5f;
    float brightness = 50;
    cm.set(new float[] { contrast, 0, 0, 0, brightness, 0,
      contrast, 0, 0, brightness, 0, 0, contrast, 0,
      brightness, 0, 0, 0, 1, 0 });

      background.setColorFilter(new ColorMatrixColorFilter(cm));


    }
  }
