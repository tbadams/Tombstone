package com.tadams.pcg.tomb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.tadams.pcg.tomb.model.CharClass;
import com.tadams.pcg.tomb.model.CharDeath;
import com.tadams.pcg.tomb.model.Danger;
import com.tadams.pcg.tomb.model.DeathFactory;
import com.tadams.pcg.tomb.model.Enemy;
import com.tadams.pcg.tomb.model.Trap;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final double TRAP_CHANCE = 0.2;
    private static final int GRAVE_WIDTH = 16;

    private final ArrayList<CharDeath> deathList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		final EditText nameEntry = (EditText)findViewById(R.id.char_name);
		final Spinner charClassEntry = (Spinner)findViewById(R.id.char_class_spinner);
		charClassEntry.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, CharClass.values()));
        final ListView deathListView = (ListView)findViewById(R.id.death_list);
        final ArrayAdapter<CharDeath> deathAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, deathList);
        deathListView.setAdapter(deathAdapter);
		Button genButton = (Button)findViewById(R.id.gen_button);
		genButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View p1) {
                String name = nameEntry.getText().toString();
                CharClass charClass = (CharClass) charClassEntry.getSelectedItem();
                CharDeath death = new DeathFactory().getDeath(name, charClass);
                deathList.add(death);
                deathAdapter.notifyDataSetChanged();
                ((TextView) findViewById(R.id.death_screen)).setText(getGraveString(death.toString()));
            }
        });


        ((TextView) findViewById(R.id.death_screen)).setText(getGraveString("Arthur Shitson died in a butt"));

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }
	
	public static Danger getDanger(long seed) {
        Random r = new Random(seed);
        if(r.nextDouble() < TRAP_CHANCE) {
            return new Trap(seed);
        }
        return new Enemy(seed);
    }

    private String makeGraveLine(String text) {
        if(text.length() <= GRAVE_WIDTH) {
            StringBuilder sb = new StringBuilder(25);
            int totalFiller = GRAVE_WIDTH - text.length();
            int leftFiller = totalFiller / 2;
            int rightfiller = totalFiller - leftFiller;
            sb.append("| ");
            addSpaces(sb, leftFiller);
            sb.append(text);
            addSpaces(sb, rightfiller);
            sb.append(" |\n");
            return sb.toString();
        } else {
            throw new IllegalArgumentException("too long");
        }
    }

    private void addSpaces(StringBuilder sb, int x) {
        for( int i = 0; i < x; i++) {
            sb.append(' ');
        }
    }

    private String getGraveString(String graveText) {
        StringBuilder sb = new StringBuilder();
        sb.append("----------\n")
                .append("/          \\\n")
                .append("/    REST    \\\n")
                .append("/      IN      \\\n")
                .append("/     PEACE      \\\n")
                .append("/                  \\\n");
        while(graveText.length() > GRAVE_WIDTH) {
            sb.append(makeGraveLine(graveText.substring(0, GRAVE_WIDTH)));
            graveText = graveText.substring(GRAVE_WIDTH);
        }
        sb.append(makeGraveLine(graveText));
        return sb.toString();
    }
}
