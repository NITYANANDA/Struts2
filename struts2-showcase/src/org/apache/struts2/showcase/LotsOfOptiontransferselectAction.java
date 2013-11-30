/*
 * $Id: LotsOfOptiontransferselectAction.java 1400220 2012-10-19 18:49:39Z jogep $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.struts2.showcase;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 */
@SuppressWarnings("serial")
public class LotsOfOptiontransferselectAction extends ActionSupport {

	private List<String> _favouriteCartoonCharactersKeys;
	private List<String> _notFavouriteCartoonCharactersKeys;

	private List<String> _favouriteCarsKeys;
	private List<String> _notFavouriteCarsKeys;

	private List<String> _favouriteMotorcyclesKeys;
	private List<String> _notFavouriteMotorcyclesKeys;

	private List<String> _favouriteCountriesKeys;
	private List<String> _notFavouriteCountriesKeys;

	private List<String> _favouriteCitieskeys;
	private List<String> _notFavouriteCitieskeys;
	
	private List<String> _favouriteSportsKeys;
	private List<String> _notFavouriteSportsKeys;

	private List<String> _prioritisedFavouriteCartoonCharacters;
	private List<String> _prioritisedFavouriteCars;
	private List<String> _prioritisedFavouriteCountries;

	
	// Cartoon Characters
	public Map<String, String> getDefaultFavouriteCartoonCharacters() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("heMan", "He-Man");
		m.put("popeye", "Popeye");
		m.put("mockeyMouse", "Mickey Mouse");
		return m;
	}

	public Map<String, String> getDefaultNotFavouriteCartoonCharacters() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("donaldDuck", "Donald Duck");
		m.put("atomicAnt", "Atomic Ant");
		m.put("pinkPainter", "Pink Painter");
		return m;
	}

	public List<String> getFavouriteCartoonCharacters() {
		return _favouriteCartoonCharactersKeys;
	}

	public void setFavouriteCartoonCharacters(List<String> favouriteCartoonCharacters) {
		_favouriteCartoonCharactersKeys = favouriteCartoonCharacters;
	}

	public List<String> getNotFavouriteCartoonCharacters() {
		return _notFavouriteCartoonCharactersKeys;
	}

	public void setNotFavouriteCartoonCharacters(List<String> notFavouriteCartoonCharacters) {
		_notFavouriteCartoonCharactersKeys = notFavouriteCartoonCharacters;
	}


	// Cars
	public Map<String, String> getDefaultFavouriteCars() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("alfaRomeo", "Alfa Romeo");
		m.put("Toyota", "Toyota");
		m.put("Mitsubitshi", "Mitsubitshi");
		return m;
	}

	public Map<String, String> getDefaultNotFavouriteCars() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("ford", "Ford");
		m.put("landRover", "Land Rover");
		m.put("mercedes", "Mercedes");
		return m;
	}

	public List<String> getFavouriteCars() {
		return _favouriteCarsKeys;
	}

	public void setFavouriteCars(List<String> favouriteCars) {
		_favouriteCarsKeys = favouriteCars;
	}

	public List<String> getNotFavouriteCars() {
		return _notFavouriteCarsKeys;
	}

	public void setNotFavouriteCars(List<String> notFavouriteCars) {
		_notFavouriteCarsKeys = notFavouriteCars;
	}


	// Motorcycles
	public Map<String, String> getDefaultFavouriteMotorcycles() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("honda", "Honda");
		m.put("yamaha", "Yamaha");
		m.put("Aprillia", "Aprillia");
		return m;
	}

	public Map<String, String> getDefaultNotFavouriteMotorcycles() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("cagiva", "Cagiva");
		m.put("harleyDavidson", "Harley Davidson");
		m.put("suzuki", "Suzuki");
		return m;
	}

	public List<String> getFavouriteMotorcycles() {
		return _favouriteMotorcyclesKeys;
	}

	public void setFavouriteMotorcycles(List<String> favouriteMotorcycles) {
		_favouriteMotorcyclesKeys = favouriteMotorcycles;
	}

	public List<String> getNotFavouriteMotorcycles() {
		return _notFavouriteMotorcyclesKeys;
	}

	public void setNotFavouriteMotorcycles(List<String> notFavouriteMotorcycles) {
		_notFavouriteMotorcyclesKeys = notFavouriteMotorcycles;
	}


	// Countries
	public Map<String, String> getDefaultFavouriteCountries() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("england", "England");
		m.put("america", "America");
		m.put("brazil", "Brazil");
		return m;
	}

	public Map<String, String> getDefaultNotFavouriteCountries() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("germany", "Germany");
		m.put("china", "China");
		m.put("russia", "Russia");
		return m;
	}

	public List<String> getFavouriteCountries() {
		return _favouriteCountriesKeys;
	}

	public void setFavouriteCountries(List<String> favouriteCountries) {
		_favouriteCountriesKeys = favouriteCountries;
	}

	public List<String> getNotFavouriteCountries() {
		return _notFavouriteCountriesKeys;
	}

	public void setNotFavouriteCountries(List<String> notFavouriteCountries) {
		_notFavouriteCountriesKeys = notFavouriteCountries;
	}
	
	

	// Sports
	public Map<String, String> getDefaultFavoriteSports() {
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("basketball", "Basketball");
		m.put("football", "Football");
		m.put("baseball", "Baseball");
		return m;
	}

	public Map<String, String> getDefaultNotFavoriteSports() {
		return new LinkedHashMap<String, String>();
	}

	public List<String> getFavouriteSports() {
		return _favouriteSportsKeys;
	}

	public void setFavouriteSports(List<String> favouriteSportsKeys) {
		this._favouriteSportsKeys = favouriteSportsKeys;
	}

	public List<String> getNonFavouriteSports() {
		return _notFavouriteSportsKeys;
	}

	public void setNonFavouriteSports(List<String> notFavouriteSportsKeys) {
		this._notFavouriteSportsKeys = notFavouriteSportsKeys;
	}

	// ??????????
	public List<String> getPrioritisedFavouriteCartoonCharacters() {
		return _prioritisedFavouriteCartoonCharacters;
	}

	public void setPrioritisedFavouriteCartoonCharacters(List<String> prioritisedFavouriteCartoonCharacters) {
		_prioritisedFavouriteCartoonCharacters = prioritisedFavouriteCartoonCharacters;
	}

	public List<String> getPrioritisedFavouriteCars() {
		return _prioritisedFavouriteCars;
	}

	public void setPrioritisedFavouriteCars(List<String> prioritisedFavouriteCars) {
		_prioritisedFavouriteCars = prioritisedFavouriteCars;
	}


	public List<String> getPrioritisedFavouriteCountries() {
		return _prioritisedFavouriteCountries;
	}

	public void setPrioritisedFavouriteCountries(List<String> prioritisedFavouriteCountries) {
		_prioritisedFavouriteCountries = prioritisedFavouriteCountries;
	}

	//Cities
	public Map<String, String> getDefaultFavouriteCities() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("boston", "Boston");
		map.put("new york", "New York");
		map.put("london", "London");
		map.put("rome", "Rome");
		return map;
	}
	
	public Map<String, String> getDefaultNotFavouriteCities() {
		return new LinkedHashMap<String, String>();
	}

	public List<String> getFavouriteCities() {
		return _favouriteCitieskeys;
	}

	public void setFavouriteCities(List<String> favouriteCities) {
		this._favouriteCitieskeys = favouriteCities;
	}
	
	public List<String> getNotFavouriteCities() {
		return _notFavouriteCitieskeys;
	}
	
	public void setNotFavouriteCities(List<String> notFavouriteCities) {
		this._notFavouriteCitieskeys = notFavouriteCities;
	}
	

	// actions

	public String input() throws Exception {
		return SUCCESS;
	}

	public String submit() throws Exception {
		return SUCCESS;
	}
}
