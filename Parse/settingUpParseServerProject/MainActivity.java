package com.example.<your package>;

//to connect with parse ParseAnalytics is neccessary
import com.parse.ParseAnalytics;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);
		
		<connect with ParseServer>
		ParseAnalytics.trackAppOpenedInBackground(getIntent());
		
		</connect with ParseServer>

    }
}
