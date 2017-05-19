package hack.opendata.jesuisencoursserver;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by bernara3 on 19.05.17.
 */

public class JSECApp extends Application {

    public static String TAG = "JSECApp";

    public static String currentUserId = "9001"; // TODO HARDCODED

    /**
     * Instance of JSECApp
     */
    private static JSECApp instance;
    public static JSECApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        // firebase
        FirebaseApp.initializeApp(this);
        database = FirebaseDatabase.getInstance();

    }

    /**
     * Firebase Instance (db)
     */
    private FirebaseDatabase database;
    public FirebaseDatabase getDatabase() {
        return database;
    }

}
