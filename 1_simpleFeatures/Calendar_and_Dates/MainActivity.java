package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //setting up a Calendar Variable -> now it is set by the exact date and time of the creation
    Calendar mCalendar = Calendar.getInstance();

    //changing the date / time
    //Important: look how it is counted -> e.g. month 0 is january, so december is 11
    mCalendar.set(<year>, <month>, <date>, <hourOfDay>, <minute>, <second>);

    //or with a date Variable
    Date date = new Date();
    mCalendar.setTime(date);


    //if a field of the calendar should be display, use the following method
    //field: e.g Calendar.MONTH
    String printString = mCalendar.getDisplayName(<field>, Calendar.LONG, Locale.getDefault())


    //displaying a date, use the DateFormat oder SimpleDateFormat
    String printDate = DateFormat.getDateInstance().format(<date>);



    //get the amount of days between to today and a Date
    //getting the difference between today and the day the activity was last done
    //0 -> activity was last done today
    //-5 -> activity was last done 5 days ago
    // 8 -> activity will be done 8 days in the future
    int daysBetween = getAmountOfDaysBetweenTodayAndADate(<date>);


  }

  private int getAmountOfDaysBetweenTodayAndADate(Date latestDateOfActivity){

    Calendar latestCalendarOfActivity = Calendar.getInstance();

    latestCalendarOfActivity.setTime(latestDateOfActivity);

    Calendar currentCalendar = Calendar.getInstance();

    //set the currentCalendar variable to the last millisecond of the current date (so that the comparison is always right)
    //otherwise, the could be a false outcome
    currentCalendar.set(Calendar.HOUR_OF_DAY, currentCalendar.getActualMaximum(Calendar.HOUR_OF_DAY));
    currentCalendar.set(Calendar.MINUTE, currentCalendar.getActualMaximum(Calendar.MINUTE));
    currentCalendar.set(Calendar.SECOND, currentCalendar.getActualMaximum(Calendar.SECOND));
    currentCalendar.set(Calendar.MILLISECOND, currentCalendar.getActualMaximum(Calendar.MILLISECOND));

    long milliSecondsBetween = (latestCalendarOfActivity.getTime().getTime() - currentCalendar.getTime().getTime());

    //needed to distinguish between today and tomorrow
    int daysAdd = 0;

    if(milliSecondsBetween > 0L){daysAdd = 1;}

    int daysbetween = (int) (milliSecondsBetween/ (1000*60*60*24));

    return daysbetween + daysAdd;


  }


  

  private Calendar rollBackCorrect(Calendar calendar, int daysToRollBack){

    if(daysToRollBack < calendar.get(Calendar.DATE)){

        calendar.roll(Calendar.DATE, -daysToRollBack);

    }

    //checks if the month has to be changed
    while(daysToRollBack > (calendar.get(Calendar.DATE))){
        //subtracts as much days as the month has
        daysToRollBack = daysToRollBack - calendar.get(Calendar.DATE) + 1;

        //if there are still days left, the month is rolled back by one
        if(daysToRollBack > 0) {

            //rolls back the month by one
            calendar.roll(Calendar.MONTH, -1);

            //sets the date to the last date of the month
            calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));

            //if the new month is December, it means, that it is gone passed the silvester and the Year is also rolled back by 1
            if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER) {

                calendar.roll(Calendar.YEAR, -1);

            }
        }

    }

    return calendar;

}
