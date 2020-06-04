package com.example.<your package>;



public class MapsActivity extends AppCompatActivity {

    private ActivityMapsBinding activityMainBinding;

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		activityMapsBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMapsBinding.getRoot());
		
		
		//creates a MapFragment from R.id.map
		SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

		//gets the map in the background
		mapFragment.getMapAsync(this);

		//is called, when the map is ready
		@Override
		public void onMapReady(GoogleMapgoogleMap){
			mMap = googleMap;

			//Add a marker in Sydney and move the camera
			LatLngsydney = new LatLng(-34,151);
			mMap.addMarker(new MarkerOptions().position(sydney).title("MarkerinSydney"));
			mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
		}
		
		
		
		

    }
}
