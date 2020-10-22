package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;

  CustomAlertDialog custom_alert_Dialog;
  CustomAdapterForRecyclerView customAdapterForRecyclerView;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //create ArrayList and Save all the required information
    ArrayList<String> dataSetToBeDisplayedInRecyclerView = new ArrayListy<>();

    //set up Adapter
    customAdapterForRecyclerView = new Adapter_RecyclerView_AlertDialog(list_categories);



    custom_alert_Dialog = new Custom_AlertDialog(MainActivity.this, customAdapterForRecyclerView);

    custom_alert_Dialog.setCancelable(true);

    custom_alert_Dialog.show();



  }
}
