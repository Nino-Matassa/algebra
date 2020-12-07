package ie.webware.algebra;
import android.content.*;
import android.database.sqlite.*;
import java.io.*;

public class DatabaseHelper extends SQLiteOpenHelper
{

	public DatabaseHelper(Context context)
	{
		super(context, Constants.dbName, null, /*DB Version*/1);
	}
	
	// Creating table sql
//	private String createTableRegion = "create table " + Constants.tblRegion + 
//	"(" + Constants.pkId + " INTEGER PRIMARY KEY AUTOINCREMENT, " + 
//	Constants.colContinent + " TEXT NOT NULL);";
//
//	private String createTableCountry = "create table " + Constants.tblCountry + 
//	"(" + Constants.pkId + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
//	Constants.fkRegion + " INT NOT NULL, " +
//	Constants.colCountryCode + " TEXT, " +
//	"FOREIGN KEY (" + Constants.fkRegion + ") REFERENCES " + Constants.tblRegion + 
//	" (" + Constants.pkId + "));";
//
//	private String createTableData = "create table " + Constants.tblData + 
//	"(" + Constants.pkId + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
//	Constants.fkCountry + " INT NOT NULL, " +
//	"FOREIGN KEY (" + Constants.fkCountry + ") REFERENCES " + Constants.tblCountry + 
//	" (" + Constants.pkId + "));";

	@Override
	public void onCreate(SQLiteDatabase db)
	{
//		db.execSQL(createTableRegion);
//		db.execSQL(createTableCountry);
//		db.execSQL(createTableData);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
//    db.execSQL("DROP TABLE IF EXISTS " + Constants.tblRegion);
//    db.execSQL("DROP TABLE IF EXISTS " + Constants.tblCountry);
//    db.execSQL("DROP TABLE IF EXISTS " + Constants.tblData);
//    onCreate(db);
	}
}


