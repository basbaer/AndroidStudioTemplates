0. Implement the RecyclerView (and - if you want your own custom layout - the CardView) in the build.gradle (Module: app) dependencies:
	----------------------------------------
	implementation 'androidx.recyclerview:recyclerview:1.1.0'
	(implementation 'androidx.cardview:cardview:1.0.0')
	---------------------------------------

1. Create a Recycler-View in den Activity's xml-file
Important:
Set layout_width and layout_height not do defined values
	->  build constraints and set: 

	android:layout_width="0dp"
	android:layout_height="0dp"

	--> now the width and the height reaches til the linked constraints

2. Go to the Activity

3. Create MyAdapter-class
	Two options:
		○ click on the red light bulb an open it
		○ create an new Java Class with RightClick on 'app > java > com.example.<your app name>' and the New > JavaClass
	-> name it like your the Constructor of your Adapter

	?? 	-> + add <MyAdapter.MyViewHolder>   to the extend:
	public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
	??

4. Create Methods with red light bulb
	while setting up the methods:
	-> you can choose between given layouts or setting up your own (therefore you have to create an other .xml-file)

5. Optional (for custom Layout):
	-> recycler_view_layout.xml

	When creating a xml-file for the layout:
	- always set for layout_width and layout_height the value "wrap_content" (otherwise later one entry will be as big as the whole screen)
	- give the TextView an id