package id.sch.smktelkom_mlg.learn.praktekactivity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String  Tag = "LivecycleTag";
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(Tag, "onCreate: ");

        mediaPlayer = MediaPlayer.create(this, R.raw.song);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag, "onResume:");
        mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag, "onPause: ");
        mediaPlayer.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag, "onDestroy: ");

        if (mediaPlayer != null)
            mediaPlayer.release();

    }



}
