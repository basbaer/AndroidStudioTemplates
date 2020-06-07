package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;

  //links the menu to the activity
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {

    MenuInflater menuInflater = getMenuInflater();

    menuInflater.inflate(R.<menu_file>, menu);


    return super.onCreateOptionsMenu(menu);
  }

  //sets the options for the menu
  @Override
  public boolean onOptionsItemSelected(MenuItem item) {

    switch (item.getItemId()){
      case R.id.<id of the item>:

      new AlertDialog.Builder(MainActivity.this)
      .setIcon(android.R.drawable.ic_dialog_info)
      .setTitle("Information")
      .setMessage("To delete a note, tab your finger on it for 2 seconds \n \n The notes are saved automatically while typing")
      .setPositiveButton("Understood", null)
      .show();

    }

    return super.onOptionsItemSelected(item);
  }



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);



  }
}
