1. Android Version has to be Android 7 or higher

2. Android Manifest:
	<application
        android:resizeableActivity="true"
	...>
	<activity android:name=".MainActivity"
            android:supportsPictureInPicture="true">
	<layout
		<!--you can set some layout properties!-->
                android:defaultHeight="500dp"
                android:gravity="top"
                android:minWidth="300dp"/>
	...
	
3. MainActivity