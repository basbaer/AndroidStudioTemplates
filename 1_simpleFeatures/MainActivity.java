package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //<binding class>
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);
    // </binding class>


    //<binding seperate layout>
    
    //the binding has to be alreade enabled
    <bindingClass> binding = <bindingClass>.inflate(getLayoutInflater());

    //example
    //AlertDialogBinding alertDialogBinding = AlertDialogBinding.inflate(getLayoutInflater());
    //MyLayoutBinding binding = MyLayoutBinding.inflate(getLayoutInflater());


    //</binding seperate layout>







    //hide the actionBar
    getSupportActionBar().hide();


  }
}
