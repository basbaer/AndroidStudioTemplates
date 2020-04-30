package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;

  Handler handler = new Handler();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //handler let's something happen with a delay (e.g. 2000 ms)
    //Runnable is a method, that runs every second, minute or whatever (int is time in ms)
    handler.postDelayed(new Runnable() {
      @Override
      public void run() {

        //Code that should be run from time to time

        //call the handler in the run method so it's recrusive and does not only call it once
        handler.postDelayed(this, <delay of call in ms>);

      }
    }, <delay of call in ms>);

  }

}
}
