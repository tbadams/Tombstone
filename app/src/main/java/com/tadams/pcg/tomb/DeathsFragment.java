package com.tadams.pcg.tomb;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.tadams.pcg.tomb.model.CharDeath;

import java.util.List;

/**
 * Created by tadams on 12/17/15.
 */
public class DeathsFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<CharDeath> deathList = ((DeathListProvider)getActivity()).getDeaths();
        setListAdapter(new ArrayAdapter<CharDeath>(getActivity(), android.R.layout.simple_list_item_1, deathList));
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    interface DeathListProvider {
        List<CharDeath> getDeaths();
    }
}
