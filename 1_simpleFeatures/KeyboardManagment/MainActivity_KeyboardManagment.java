package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;

  //<let a specific key do something>
  //first look at the onCreate method
  @Override
  public boolean onKey(View v, int keyCode, KeyEvent event) {

    //first term: which key should cause an action
    //second term: so the method gets only called once (and not, when the user places his finger AND
    //he lifts it again)
    if(keyCode == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_DOWN){

      //specific action

    }

    return false;
  }

  //</let a specific key do something>


  //<let keyboard disappear by tabing somewhere>
  //first look in onCreat Method
  public void onClick(View v){

    //check which view has been tabed (there could be other views, that should not start to run this method)
    if(v.getId() == R.id.<first elements id> || v.getId() == R.id.<second elements id>){

      View focusedView = this.getCurrentFocus();

      if(focusedView != null){

        //hide the keyboard
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);


      }
    }

  }

  //<let keyboard disappear by tabing somewhere>



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //<let a specific key do something>
    //type this and then get rid of the error by clicking on the red lightbulb and implement the corresponding method
    //the onKey method is created
    noteET.setOnKeyListener(this);

    //</let a specific key do something>


    //<let keyboard disappear by tabing somewhere>
    //write this and implement the OnClickliksteners
    <first element>.setOnClickListener(this);
    <second element>.setOnClickListener(this);

    //see onClickMethod
    //</let keyboard disappear by tabing somewhere>



  }
}
