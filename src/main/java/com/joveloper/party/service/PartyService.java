package com.joveloper.party.service;

import com.joveloper.party.model.Party;
import com.joveloper.party.model.Person;

/**
 * A collection of party-related APIs.
 *
 * @author hrishikeshjoshi
 * @since 0.1
 */
public interface PartyService {

    /**
     * Create and persist a new person.
     *
     * @param person the person to be saved
     * @return the saved person instance
     */
    Person save(Person person);
}
