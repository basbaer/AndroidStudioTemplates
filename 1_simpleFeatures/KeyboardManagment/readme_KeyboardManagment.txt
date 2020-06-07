- <let a specific key do something> 

- let keyboard disappear if users taps somewhere
	1. Set ID's for every elements, that could be tapped (Relative Layout in the background, pictures, etc.)

	2. MainActivity 
	<let keyboard disappear by tabing somewhere>

- let keyboard show or disappear when an activity starts
	-> go to manifest
	--> to hide it:
	-------------------------------------------------------------------
	<application ... >
    		<activity
        		android:windowSoftInputMode="stateHide" ... >
       			 ...
    		</activity>
    		...
	</application>
	------------------------------------------------------------------

	--> to show it
	------------------------------------------------------------------
	<application ... >
    		<activity
        		android:windowSoftInputMode="stateVisible" ... >
       			 ...
    		</activity>
    		...
	</application>
	------------------------------------------------------------------

	