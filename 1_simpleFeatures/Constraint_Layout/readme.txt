Widgets:
- Guidelines:
	-> to these lines, the constraints can be attached

	-> Attributes:

		app:layout_constraintGuide_percent="0.50"


		-> set's the guideline in the middle of the screen


Attributes:

- app:layout_constraintWidth_default=""   /  app:layout_constraintHeight_default=""
   

	-> possible values: spread, percent, wrap
	

	What it does:

	it changes the size of the view in relation to the space it get's between other views to which the constraints are set
	(only works, when the width / size is set to 0dp)





- app:layout_goneMarginStart / End / Top / Bottom

	What it does:
  	this margin becomes active, when the view to which this view is constraint, is removed




- app:layout_constraintVertical_chainStyle=""


  -> possible values: packed, spread, spread_inside


	
	What it does:
	it moves multiple views, while this attribute has to be set in the first view of the chain



- app:layout_constraintBaseline_toBaselineOf="<id>"
	

	What it does:
	sets the baseline of the texts to the same level
