package com.example.mix.guideonhania;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        /** TODO: Insert all the code from the SightsActivity’s onCreate() method after the setContentView method call */
        // Create a list of places
        final ArrayList<Place> sight = new ArrayList<Place>();
        sight.add(new Place(R.string.sights_name_one,R.string.sights_description_one,R.string.sights_address_one,R.string.sights_hours_one,R.string.sights_tel_one,R.string.sights_site_one, R.drawable.sights_one));
        sight.add(new Place(R.string.sights_name_two,R.string.sights_description_two,R.string.sights_address_two,R.string.sights_hours_two,R.string.sights_tel_two,R.string.sights_site_two,R.drawable.sights_two));
        sight.add(new Place(R.string.sights_name_three,R.string.sights_description_three,R.string.sights_address_three,R.string.sights_hours_three,R.string.sights_tel_three,R.string.sights_site_three, R.drawable.sights_three));
        sight.add(new Place(R.string.sights_name_four,R.string.sights_description_four,R.string.sights_address_four,R.string.sights_hours_four,R.string.sights_tel_four,R.string.sights_site_four, R.drawable.sights_four));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        PlaceAdapter adapter  = new PlaceAdapter(getActivity(), sight);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
        return rootView;
    }

}
