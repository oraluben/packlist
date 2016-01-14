/*
 * PackList is an open-source packing-list for Android
 *
 * Copyright (c) 2016 Nicolas Bossard.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.nbossard.packlist.gui;

/**
 * @author Created by nbossard on 01/01/16.
 */
interface IMainActivity {

    /** Creation and saving of a new trip.
     * @param parName name of new trip
     * @param  parStartDate start date of new trip
     * @param parEndDate  end date of new trip.
     */
    void createNewTrip(String parName, String parStartDate, String parEndDate, String parNote);
}
