package ie.webware.algebra;

import android.content.*;
import android.database.sqlite.*;
import ie.webware.algebra.*;
import java.io.*;

public class Database 
{
	private Database() {}
	private static SQLiteDatabase instance = null;
	public static boolean isExistingDatabase = true;

	public static SQLiteDatabase getInstance(Context context) {
		File dbFilePath = null;
		if(instance == null) {
			if(databaseExists(context)) {
				dbFilePath = context.getDatabasePath(Constants.dbName);
				instance = SQLiteDatabase.openDatabase(dbFilePath.getPath(), null, SQLiteDatabase.OPEN_READWRITE);
			} else {
				instance = new DatabaseHelper(context).getWritableDatabase();
				isExistingDatabase = false;
			}
		}
		return instance;
	}

	public static boolean databaseExists(Context context) {
		File dbFilePath = context.getDatabasePath(Constants.dbName);
		if(dbFilePath.exists()) {
			return true;
		} else {
			return false;
		}
	}
}
