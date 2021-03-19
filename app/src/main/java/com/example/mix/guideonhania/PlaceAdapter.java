/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.mix.guideonhania;

        import android.content.Context;
        import android.support.annotation.NonNull;
        import android.support.v4.content.ContextCompat;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;
        import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place>  {

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param place is the list of {@link Place}s to be displayed.
     *
     */
    public PlaceAdapter(Context context, ArrayList<Place> place) {
        super(context, 0, place);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentLocation = getItem(position);

             // Find the TextView in the list_item.xml layout with the ID village name.
            TextView villageNameTextView = listItemView.findViewById(R.id.villageName_text_view);
            // Get the village name view from the currentPlace object and set this text on
            // the village TextView.
            villageNameTextView.setText(currentLocation.getVillageName());

            // Find the TextView in the list_item.xml layout with the ID village description.
            TextView villageDescriptionTextView = listItemView.findViewById(R.id.villageDescription_text_view);
            // Get the village description from the currentPlaces object and set this text on
            // the village TextView.
            villageDescriptionTextView.setText(currentLocation.getVillageDescription());

            // Find the TextView in the list_item.xml layout with the ID village address.
            TextView villageAddressTextView = listItemView.findViewById(R.id.villageAddress_text_view);
            // Get the village address from the currentPlaces object and set this text on
            // the village TextView.
            villageAddressTextView.setText(currentLocation.getVillageAddress());

            // Find the TextView in the list_item.xml layout with the ID village working hours.
            TextView villageHoursTextView = listItemView.findViewById(R.id.villageHours_text_view);
            // Get the village working hours from the currentPlaces object and set this text on
            // the village TextView.
            villageHoursTextView.setText(currentLocation.getVillageHours());

            // Find the TextView in the list_item.xml layout with the ID village tel.
            TextView villageTelTextView = listItemView.findViewById(R.id.villageTel_text_view);
            // Get the village tel from the current{places object and set this text on
            // the village TextView.
            villageTelTextView.setText(currentLocation.getVillageTel());

            // Find the TextView in the list_item.xml layout with the ID village_site_text_view.
            TextView villageSiteTextView = listItemView.findViewById(R.id.villageSite_text_view);
            // Get the village site from the currentPlaces object and set this text on
            // the village TextView.
            villageSiteTextView.setText(currentLocation.getVillageSite());


        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            // Get the image resource ID from the current Information object and set the image
            // to iconView
            imageView.setImageResource(currentLocation.getImage());

            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
            // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
            // the ListView.
            return listItemView;
        }
}