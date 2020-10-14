package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //fastest and ugliest way
    //setting up the spinner
    Spinner spinner = activityMainBinding.<mySpinner>;
    String[] spinnerArray = {<spinner entries>};
    SpinnerAdapter spinnerAdapter = new ArrayAdapter(this, R.layout.spinner_activity_layout, R.id.spinnerAdapterTextView, spinnerArray);
    spinner.setAdapter(spinnerAdapter);





    //standard way
    Spinner spinner = activityMainBinding.<mySpinner>;
    String[] spinnerArray = {<spinner entries>};

    SpinnerAdapter spinnerAdapter = new SpinnerAdapter() {

      //here you manipulate the view for the drop down menu
      @Override
      public View getDropDownView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        LayoutInflater inflater = getLayoutInflater();
        row = inflater.inflate(R.layout.<myLayout>, null);

        //e.g. a TextView is manipulated
        TextView text = row.findViewById(R.id.<myTextView>);
        text.setText(spinnerArray[position]);

        return row;
      }

      @Override
      public void registerDataSetObserver(DataSetObserver observer) {

      }

      @Override
      public void unregisterDataSetObserver(DataSetObserver observer) {

      }

      //the amount of items which are in the dropDownMenu
      @Override
      public int getCount() {
        return spinnerArray.length;
      }

      @Override
      public Object getItem(int position) {

        return spinnerArray[position];
      }

      @Override
      public long getItemId(int position) {
        return 0;
      }

      @Override
      public boolean hasStableIds() {
        return false;
      }

      //here you manipulate the view that is displayed (can be the same as the drop down menu)
      @Override
      public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        LayoutInflater inflater = getLayoutInflater();
        row = inflater.inflate(R.layout.<myLayout>, null);

        //e.g. a TextView is manipulated
        TextView text = row.findViewById(R.id.<myTextView>);
        text.setText(spinnerArray[position]);

        return row;
      }

      @Override
      public int getItemViewType(int position) {
        return 0;
      }

      //amount of different views that are displayed
      @Override
      public int getViewTypeCount() {
        return 1;
      }

      @Override
      public boolean isEmpty() {
        return false;
      }
    };

    spinner.setAdapter(spinnerAdapter);




    //set an on item selected listener
    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

  }
}
