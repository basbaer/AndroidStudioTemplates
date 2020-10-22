This example shows how to set up a AlertDialog with a RecyclerView:

1. Create xml-files:

	- AlertDialog_layout.xml
		-> here you set up, how your AlertDialog will look
		-> in this example, it only contains the RecyclerView
	
	- RecycerViews_item_layout.xml
		-> here you set up, how each item/rom of the RecyclerView will look
		-> in this example, it only contains a checkbox


2. MainActivity.java
	- get the data you want to display in the RecyclerView

	- create your CustomAdapter


3. CustomAdapterForRecyclerView
	- set up your Adapter as usual


4. create new class which sets up the AlertDialog
	-> Custom_AlertDialog.java


5. Go back to MainActivity and set up the AlertDialog
	
