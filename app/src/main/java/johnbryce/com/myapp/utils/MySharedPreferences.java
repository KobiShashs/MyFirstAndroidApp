package johnbryce.com.myapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {

    private static final String FILE_NAME = "MYAPP";
    //Keys
    private static final String IS_LOGGED_IN = "IsLoggedIn";
    private static final String USER_EMAIL = "UserEmail";


    public static boolean isLoggedIn(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(IS_LOGGED_IN,false);
    }

    public static void updateLoggedIn(Context context,boolean value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(IS_LOGGED_IN, value);
        editor.commit();

    }

    public static String getUserEmail(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getString(USER_EMAIL,"");
    }

    public static void updateUserEmail(Context context,String email){
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USER_EMAIL, email);
        editor.commit();
    }





}



