- ParseQueries:
	* <ParseQuery>
	* <add data to a column of the type Array>
	* <remove data from a column of the type Array>
	* <check if a certain list contains a certain value>

- create ParseObject:
	<create ParseObject>
	
	Addtional information:
	Saving Options
		.saveInBackground()
		-> Standard Saving Option

		.saveEventually()
		-> doesn't neccessarilly saves it immediately, but when the user comes online the next time

Note:
	- if you want to create a empty list in a Array-Column, just save as value:
		emptyList

