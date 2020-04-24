package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		
		//<binding class><
		activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
		// </binding class>
		

    }
}
