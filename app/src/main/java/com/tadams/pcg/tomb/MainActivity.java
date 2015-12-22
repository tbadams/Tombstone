package com.tadams.pcg.tomb;

import android.app.ListFragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tadams.pcg.tomb.model.CharClass;
import com.tadams.pcg.tomb.model.CharDeath;
import com.tadams.pcg.tomb.model.DeathFactory;
import com.tadams.pcg.tomb.model.DeathSeed;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DeathsFragment.DeathListProvider,
        TombstoneFragment.DeathCreator {

    private static final String DEATHS_KEY = "deathslist";


    private final ArrayList<CharDeath> deathList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        SharedPreferences sp = getSharedPreferences(DEATHS_KEY, MODE_PRIVATE);
        if(sp.contains(DEATHS_KEY)) {
            String listJson = sp.getString(DEATHS_KEY, "");
            if(listJson.length() > 0) {
                List<DeathSeed> seedList = new Gson().fromJson(listJson, new TypeToken<List<DeathSeed>>(){}.getType());
                for(DeathSeed seed: seedList) {
                    deathList.add(new DeathFactory().getDeath(seed.name, seed.charClass));
                }
            }
        }

        setContentView(R.layout.main);


        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    protected void onDestroy() {
        List<DeathSeed> cacheList = new ArrayList<>();
        for(CharDeath death: deathList) {
            cacheList.add(death.getDeathSeed());
        }

        String listJson = new Gson().toJson(cacheList); //, new TypeToken<List<CharDeath>>(){}.getType());
        SharedPreferences sp = getSharedPreferences(DEATHS_KEY, MODE_PRIVATE);
        sp.edit().putString(DEATHS_KEY, listJson).apply();
        super.onDestroy();
    }

    @Override
    public List<CharDeath> getDeaths() {
        return deathList;
    }

    @Override
    public void onDeathSelected(CharDeath death) {
        setDeath(death);
    }


    @Override
    public void makeDeath(String name, CharClass charClass) {
        CharDeath death = new DeathFactory().getDeath(name, charClass);
        deathList.add(death);
        ListFragment deaths = (ListFragment)getFragmentManager().findFragmentById(R.id.deaths_fragment);
        if(deaths != null && deaths.isAdded()) {
            ((ArrayAdapter<CharDeath>)deaths.getListAdapter()).notifyDataSetChanged();
        }
        setDeath(death);
    }

    private void setDeath(CharDeath death) {
        TombstoneFragment tombstone = (TombstoneFragment)getFragmentManager().findFragmentById(R.id.tombstone_fragment);
        if(tombstone != null && tombstone.isAdded()) {
            tombstone.setDeath(death);
        }
    }
}
