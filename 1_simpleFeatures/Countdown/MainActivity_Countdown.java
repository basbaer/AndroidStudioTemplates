package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //the method is gone, when the countdown is run down
    new CountDownTimer(<how long the countdown should run (in ms)>, <how big one 'tick' is (the steps) (in ms)>){

      public void onTick(long millisecondsUntilDone){

        //Countdowniscountingdown

      }

      public void onFinish(){

        //Counterisfinished!

      }

    }.start();

  }
}
