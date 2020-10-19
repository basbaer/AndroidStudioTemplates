package com.example.<your package>;



public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding activityMainBinding;

  private static SQLiteDatabase myDatabase;

  //need this variable, if you are creating the db in a seperate class
  private Context context;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = activityMainBinding.getRoot();
    setContentView(view);

    //<Setting up SQLite Database>
    //if you want to create the db in a seperate class (which is not an activity), you need a variable for the context
    //for more information look below the normal process



    try{

      //creating the Database

      //mode: simplest one is MODE_PRIVATE
      //ErrorCatchingMethod/Factory: simplest one is null
      myDatabase = this.openOrCreateDatabase("<name of db>", MODE_PRIVATE, null);



      //creates the table with the coloums and their corresponding data types
      //INTEGER PRIMARY KEY automatically creates ids
      myDatabase.execSQL("CREATE TABLE IF NOT EXISTS <name of table> (id INTEGER PRIMARY KEY, username VARCHAR, age INT(3))");


    }catch (Exception e){
      e.printStackTrace();
    }

    //</Setting up SQLite Database>





    //<insert data in the db>
    //Option 1:

    myDatabase.execSQL("INSERT INTO <name of table> (<first coloumn>, <second coloumn>) VALUES (<value of first coloumn>, <value of second coloumn>)");

    //example
    //myDatabase.execSQL("INSERT INTO users (username, age) VALUES ('discobreak21', 22)");



    //Option 2:
    ContentValues values = new ContentValues();

    values.put("<name of coloum>", <values>);
    //...

    //this method returns the id and inserts the data
    long id = database.insert("<name of table>", null, values);


    //</insert data in the db>



    //<get data from db>
    //Method that interrupst the query: easiest way: null
    Cursor c = myDatabase.rawQuery("SELECT * FROM <name of table>", <Method that interrupts the query>);

    int myColumnIndex = c.getColumnIndex("<name of column>");

    boolean moreEntries = c.moveToFirst();

    while(moreEntries){

      //via the column index you can choose of which column you want the value

      Log.i("value of the column xy", c.getString(myColumnIndex));

      //moveToNext returns false if it is passed the last item
      moreEntries = c.moveToNext();

    }


    //</get data from db>





    //<change a value>
    myDatabase.execSQL("UPDATE <name of table> SET <name of variable>  = <value> WHERE <name of variable = <value>");

    //example
    //"UPDATE events SET year = 2012 WHERE title = 'DFB-Pokal'"

    //</change a value>



    //<Advanced Queries>

    //get only certain attributes
    Cursor c = myDatabase.rawQuery("SELECT * FROM <name of table> WHERE <name of variable> <Bedingung>");

    //example
    //"SELECT * FROM events WHERE year < 1950"
    //"SELECT * FROM events WHERE title = '1. Meisterschaft'"



    //get certain attributes with more than one condition
    Cursor c = myDatabase.rawQuery("SELECT * FROM <name of table> WHERE <name of variable> <Bedingung> AND <name of variable> <Bedingung>");

    //example
    //"SELECT * FROM events WHERE year < 1950" AND title = '1. Meisterschaft'"



    //get data, where you don't know the whole data (e.g all names which start with k)

    // % means that it doesn't matter what follows
    //can also be put in front of the expression
    Cursor c = myDatabase.rawQuery(Cursor c = myDatabase.rawQuery("SELECT * FROM <name of table> WHERE <name of variable> LIKE <expresion with % in it>");



    //limit the number of results
    Cursor c = myDatabase.rawQuery("[...] WHERE <name of variable> <Bedingung> LIMIT <Number of maximum resluts>");

    //example
    //"[...] WHERE title LIKE '%Sieg%' LIMIT 2"



    //delete entry
    //best way to delete is by id (it's not always possible to combine a '=-Statement' with a limit)
    myDatabase.execSQL("DELETE FROM <name of table> WHERE <name of variable> = <value of variable>");

    //example
    //"DELETE FROM events WHERE title = '1. Meisterschaft'");



    //checking if a specific entry alread EXISTS
    Cursor c = MainActivity.database.rawQuery("SELECT * FROM <your table> WHERE <Abfrage> ", null);

    if(!c.moveToFirst()){


    }

    //</Advanced queries>





    //<Setting up SQLite Databes in a seperate class>

    //you have to get the context via the constructor of the class
    SQLiteDatabase usersDatabase = context.openOrCreateDatabase("<name of db>", MODE_PRIVATE, null);
    //then go on as usual



    //</Setting up SQLite Databes in a seperate class>



    //<create sql-Code with variables>
    String sql = "INSERT INTO <nameoftable> (<coloumsoftable>) VALUES (?, ?, ?)";

    SQLiteStatement statement = <database>.compileStatement(sql);

    statement.bindString(1, <value of first coloum>);

    statement.bindString(2, <value of second coloum>);

    statement.bindString(3, <value of third coloum>);

    statement.execute();

    //</create sql-Code with variables>



  }
}
