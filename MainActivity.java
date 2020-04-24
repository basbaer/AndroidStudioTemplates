package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
		
		

    }
}
