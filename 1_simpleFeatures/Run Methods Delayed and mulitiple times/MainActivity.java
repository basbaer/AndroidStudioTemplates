package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);


    //handler let's something happen with a delay (in ms) (e.g. 2000 ms)
    //in the Runnable you can override the run() method and let i run in time intervals
    //terminated by the handler
    Handler handler = new Handler();


    handler.postDelayed(new Runnable() {
      @Override
      public void run() {

        //Code that should be run from time to time

        //call the handler again, so this run method is called recrusive
        handler.postDelayed(this, <delay of call in ms>);

      }
    }, <delay of call in ms>);

  }

}
}
