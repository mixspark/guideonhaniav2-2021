package com.example.mix.guideonhania;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OldTownFragment extends Fragment {


    public OldTownFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        /** TODO: Insert all the code from the OldTownActivity’s onCreate() method after the setContentView method call */
        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.odtown_name_one,R.string.oldtown_description_one,R.string.oldtown_address_one,R.string.oldtown_hours_one,R.string.oldtown_tel_one,R.string.oldtown_site_one, R.drawable.oldtown_one));
        places.add(new Place(R.string.odtown_name_two,R.string.village_description_two,R.string.oldtown_address_two,R.string.oldtown_hours_two,R.string.oldtown_tel_two,R.string.oldtown_site_two, R.drawable.oldtown_two));
        places.add(new Place(R.string.odtown_name_two,R.string.oldtown_description_three,R.string.oldtown_address_three,R.string.oldtown_hours_three,R.string.oldtown_tel_three,R.string.oldtown_site_three,R.drawable.oldtown_three));
        places.add(new Place(R.string.odtown_name_one,R.string.oldtown_description_four,R.string.oldtown_address_four,R.string.oldtown_hours_four,R.string.oldtown_tel_four,R.string.oldtown_site_four, R.drawable.oldtown_four));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

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
