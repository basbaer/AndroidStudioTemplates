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
    public void onMapReady(GoogleMap googleMap){
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




    //<google maps intent with starting navigation>

    //navigation from current positon to a specific Location




    // Create a Uri from an intent string. Use the result to create an Intent.
    Uri gmmIntentUri = Uri.parse("google.navigation:q=" + <latitude of aim> + "," + <longitude of aim>);


    // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);


    // Make the Intent explicit by setting the Google Maps package
    mapIntent.setPackage("com.google.android.apps.maps");

    // Attempt to start an activity that can handle the Intent
    startActivity(mapIntent);





    //</google maps intent with starting navigation>





    //<google maps intent showing route (starting with current Location)>



    // Create a Uri from an intent string. Use the result to create an Intent.
    Uri gmmIntentUri = Uri.parse("http://maps.google.com/maps?daddr=" + currentLatLngRider.latitude + "," + currentLatLngRider.longitude);

    // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);


    // Make the Intent explicit by setting the Google Maps package
    mapIntent.setPackage("com.google.android.apps.maps");

    // Attempt to start an activity that can handle the Intent
    startActivity(mapIntent);



    //</google maps intent to showing route (starting with current location)>





    //<google maps intent showing route (from Point A to Point B)>



    // Create a Uri from an intent string. Use the result to create an Intent.
    Uri.parse("http://maps.google.com/maps?saddr=" + <latitude Point A> + "," + <longitude point A> + ""&daddr=" + <latitude Point B> "," + <longitude Point B> ));

    // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);


    // Make the Intent explicit by setting the Google Maps package
    mapIntent.setPackage("com.google.android.apps.maps");

    // Attempt to start an activity that can handle the Intent
    startActivity(mapIntent);





    //</google maps intent showing route (from Point A to Point B)>






















  }
}
