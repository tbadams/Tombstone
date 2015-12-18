package com.tadams.pcg.tomb;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.tadams.pcg.tomb.model.CharClass;
import com.tadams.pcg.tomb.model.CharDeath;
import com.tadams.pcg.tomb.model.DeathFactory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DeathsFragment.DeathListProvider{

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
		Button genButton = (Button)findViewById(R.id.gen_button);
		genButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View p1) {
                String name = nameEntry.getText().toString();
                CharClass charClass = (CharClass) charClassEntry.getSelectedItem();
                CharDeath death = new DeathFactory().getDeath(name, charClass);
                deathList.add(death);
                ListFragment deaths = (ListFragment)getFragmentManager().findFragmentById(R.id.deaths_fragment);
                if(deaths != null && deaths.isAdded()) {
                    ((ArrayAdapter<CharDeath>)deaths.getListAdapter()).notifyDataSetChanged();
                }
                ((TextView) findViewById(R.id.death_screen)).setText(getGraveString(death.toString()));
                nameEntry.setText("");
            }
        });


        ((TextView) findViewById(R.id.death_screen)).setText(getGraveString("Arthur Shitson died in a butt"));

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public List<CharDeath> getDeaths() {
        return deathList;
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
