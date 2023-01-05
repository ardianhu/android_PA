package com.example.wireframe;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {
    //membuat database
    //nama database
    private static final String DB_NAME = "userdb";
    //database version
    private static final int DB_VERSION = 1;
    //nama tabel
    private static final String TABLE_NAME = "user";
    //nama-nama kolom
    private static final String ID_COL = "id";
    private static final String NAME_COL = "name";
    private static final String PASSWORD_COL = "password";

    public DBHandler(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }
    //membuat database dg menjalankan sqlite query
    @Override
    public void onCreate(SQLiteDatabase db){
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + PASSWORD_COL + " TEXT)";

        db.execSQL(query);
    }
    public void addNewUser(String userName, String userPassword){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME_COL, userName);
        values.put(PASSWORD_COL, userPassword);
        db.insert(TABLE_NAME, null, values);
        db.close();
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
