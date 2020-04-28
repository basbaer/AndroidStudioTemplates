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
		
		
		
		//<add new Location>
		LatLng caymanIslands = new LatLng(19.317783,-81.2363317);
		//</add new Location>
		
		
		//<add marker> and customize it (here: defaultMarker, color:blue)
		mMap.addMarker(newMarkerOptions().position(<LatLng variable>).title("MarkerOnMyLatLng")
				.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
		
		//</add marker>
		
		
		
		//<move camera to a location>
		mMap.moveCamera(CameraUpdateFactory.newLatLng(<LatLng variable>));
		
		//</move camera to a location>
		
		
		
		//<change zoom level>
		
		
		//zoom level is a int between 1 and 20
		mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(<LatLng variable>, 10));
		
		//it is also possible to set the corner points of the view
		mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(<LatLng's here>));
		
		
		//</change zoom level>
		
		
		//<change to satelite image>
		mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		
		//</change to satelite image>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

    }
}
