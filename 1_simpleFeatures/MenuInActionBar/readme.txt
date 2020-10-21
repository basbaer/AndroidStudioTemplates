1. Create a new folder for the menu (if it doesn't exist already)
	Rechtsklick auf res (im Verzeichnis auf der linken Seite):
	-> New > Android Resource Directory
		- name: menu
		- Resource Type: Menu

2. Create a menu-file (xml-file)
	- select the new created folder
	
	- file > new > Menu Resource file
		file name: e.g. main_menu

3. Create the Items in the xml-file
	
	<?xml version = "1.0" encoding = "utf-8"?>
	<menu xmlns:android="http://schemas.android.com/apk/res/android">
	
	<item android:title="Settings"
	android:id="@+id/settings"></item>
	
	<item android:title="Help"
	android:id="@+id/help"></item>
	</menu>

4. MainActivity

Note: you can add multiple menu Buttons to the toolbar
	> menu_layout.xml
