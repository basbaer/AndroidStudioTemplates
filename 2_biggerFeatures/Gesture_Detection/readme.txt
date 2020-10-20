1. create a interface: SwipeActions
	> 1_SwipeActionsInterface.java

2. create a class: SwipeGestureDetector
	> 2_SwipeGestureDetecorClass.java

3. Set an onTouch-Listener
	> 3_MainActivity.java


Note:
If it doesn't work, check in the logs if the "ACTION_DOWN" is consumed by an child's onClickListener
	-> Work-around:
		- set an onTouchListener on the view so the "ACTION_DOWN" is passed by
		- create a variable inside the onTouchListener to save the view (or the information to identify it) in it
		- in the Main-SwipegestureDetection set up a method inside the onClick() to do the click 