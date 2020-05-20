package pt.ipg.portugalcovid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "DadosPessoais.db";
    public static final String TABLE_NAME = "DadosPessoais_table.db";
    public static final String ID = "ID";
    public static final String NOME = "NOME";
    public static final String TELEFONE = "TELEFONE";
    public static final String EMAIL = "EMAIL";
    public static final String IDADE = "IDADE";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME TEXT, TELEFONE INTEGER, EMAIL TEXT, IDADE INTEGER )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
}
