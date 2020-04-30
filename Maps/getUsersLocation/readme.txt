Information: 
- to show a location in the logs use: location.toString()

- the check for the sdk < 23 is no longer necessary since the apps only run on phones with sdk 23 or higher

1. set permission in AndroidManifest.xml (if it's not done automaically)
	------------------------------------------------------------------------
	<uses-permissionandroid:name="android.permission.ACCESS_FINE_LOCATION"/>
	------------------------------------------------------------------------

2. MapsActivity