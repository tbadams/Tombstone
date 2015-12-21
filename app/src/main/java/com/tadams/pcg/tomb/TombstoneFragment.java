package com.tadams.pcg.tomb;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.tadams.pcg.tomb.model.CharClass;
import com.tadams.pcg.tomb.model.CharDeath;

/**
 * Created by tadams on 12/17/15.
 */
public class TombstoneFragment extends Fragment {

    private static final int GRAVE_WIDTH = 16;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tombstone, container, false);
        final DeathCreator activity = (DeathCreator)getActivity();

        final EditText nameEntry = (EditText)v.findViewById(R.id.char_name);
        final Spinner charClassEntry = (Spinner)v.findViewById(R.id.char_class_spinner);
        charClassEntry.setAdapter(new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_dropdown_item_1line, CharClass.values()));
        Button genButton = (Button)v.findViewById(R.id.gen_button);
        genButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View p1) {
                String name = nameEntry.getText().toString();
                CharClass charClass = (CharClass) charClassEntry.getSelectedItem();
                activity.makeDeath(name, charClass);
                nameEntry.setText("");
            }
        });
        return v;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void setDeath(CharDeath death) {
        ((TextView)getView().findViewById(R.id.death_screen)).setText(getGraveString(death.toString()));
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

    public interface DeathCreator {
        void makeDeath(String name, CharClass charClass);
    }
}
