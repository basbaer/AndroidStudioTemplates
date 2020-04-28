package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
		
		//<Alert Dialog>
		
		new AlertDialog.Builder(<current activity>.this)
			.setIcon(android.R.drawable.ic_dialog_alert)
			.setTitle("Are you sure?")
			.setMessage("Do you definitely want to do this?")
			.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterfacedialog, int which){

						Toast.makeText(MainActivity.this, "It's done",Toast.LENGTH_LONG).show();
				}
			})
			.setNegativeButton("No", null)
			.show();
			
		//</Alert Dialog>
		
		
		
		//<Advanced Alert Dialog>
		
		
		//creating the AlertDialog
		AlertDialog.Builder builder = new AlertDialog.Builder(GroupListActivity.this);

        LayoutInflater layoutInflater = getLayoutInflater();
		
		//get's the created layout
        View alertdialogView = layoutInflater.inflate(R.layout.alert_dialog_layout, null);

		//EditText, where the users types what is requested (e.g. a group name)
        EditText alertDialogEditText = findViewById(R.id.createGroupNameEditText);
        Button alertDialogButton = findViewById(R.id.createNewGroupButton);
		
		//defines if the builder can be canceled
        builder.setCancelable(true);

		//sets the created Layout for the builder
        builder.setView(alertdialogView);

        AlertDialog alertDialog = builder.create();

        alertDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        
				
				alertDialog.dismiss();
             }
        });

        alertDialog.show();
		
		
		//</Advanced Alert Dialog>

    }
}
