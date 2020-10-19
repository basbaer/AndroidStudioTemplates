package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;

  private SwipeGestureDetector swipeGestureDetector;
  private GestureDetectorCompat gestureDetectorCompat;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    setUpSwipeGestureDetector();

    //get your view on set onTouchListener
    <view>.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View v, MotionEvent event) {

        Log.d("TouchEvent", event.toString());

        gestureDetectorCompat.onTouchEvent(event);


        return true;
      }
    });



  }

  private void setUpSwipeGestureDetector(){

    swipeGestureDetector = new SwipeGestureDetector(new SwipeActions() {
      @Override
      public void onSwipeLeft() {
        leftSwipe();
      }

      @Override
      public void onSwipeRight() {
        rightSwipe();
      }

      @Override
      public void onSwipeUp() {

      }

      @Override
      public void onSwipeDown() {

      }
    });

    gestureDetectorCompat = new GestureDetectorCompat(getApplicationContext(), swipeGestureDetector);


  }



}
