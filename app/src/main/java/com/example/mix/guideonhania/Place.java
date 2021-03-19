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

/**
 * {@link Place} represents all the main informations of the place that the user wants to learn.
 * It contains a village name, description, address, local telephone, internet site and working hours of the stores and public places and an image for that place.
 */
public class Place {

    /** Village name */
    private int mVillageName;

    /** Village   Description */
    private int mVillageDescription;

    /** Village  address */
    private int mVillageAddress;

    /** Village  working hours */
    private int mVillageHours;

    /** Village  contact telephone */
    private int mVillageTel;

    /** Village  internet site */
    private int mVillageSite;

    /** Image resource ID for the village */

    private int mImage = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this village */
    private static final int NO_IMAGE_PROVIDED = -1;


      /**
     * Create a new Place object.
       * @param villageName is the name of the village
       * @param villageDescription is the short description of the village
       * @param villageAddress is the address of the village
       * @param villageHours is the working hours we can find open the stores and public places in the village
       * @param villageTel is the local telephones numbers we can ask for informations
       * @param villageSite is the site of the village in the internet
       * @param image is the drawable resource ID for the image associated with the village
       */
    public Place(int villageName, int villageDescription, int villageAddress, int villageHours, int villageTel, int villageSite, int image ) {
        mVillageName = villageName;
        mVillageDescription = villageDescription;
        mVillageAddress = villageAddress;
        mVillageHours = villageHours;
        mVillageTel = villageTel;
        mVillageSite= villageSite;
        mImage = image;
    }

    /**
     * Get the default name of the village.
     */
    public int getVillageName() {
        return mVillageName;
    }

    /**
     * Get the general description of the village.
     */
    public int getVillageDescription() {
        return mVillageDescription;
    }

    /**
     * Get the address of the village.
     */
    public int getVillageAddress() {
        return mVillageAddress;
    }

    /**
     * Get the general working hours of the village.
     */
    public int getVillageHours() {
        return mVillageHours;
    }

    /**
     * Get the telephone numbers of the village.
     */
    public int getVillageTel() {
        return mVillageTel;
    }

    /**
     * Get the internet site of the village.
     */
    public int getVillageSite() {
        return mVillageSite;
    }

    /**
     * Return the image resource ID of the village.
     */
    public int getImage() {
        return mImage;
    }


    public boolean hasImage() { return mImage != NO_IMAGE_PROVIDED; }
}
