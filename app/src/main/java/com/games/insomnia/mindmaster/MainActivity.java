package com.games.insomnia.mindmaster;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.games.insomnia.mindmaster.utils.BoardSettings;
import com.games.insomnia.mindmaster.utils.GameModesEnum;

import roboguice.util.Ln;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Game game = new Game(GameModesEnum.CLASSIC.getMode());
        Ln.d(game.getCurrentMode());
        BoardSettings.getInstance().setMode(GameModesEnum.CLASSIC.getMode());
        Ln.d(game.getCurrentMode());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
