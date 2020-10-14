package com.joveloper.party.repository;

import com.joveloper.party.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * A CRUD repository for a person entity.
 *
 * @author hrishikeshjoshi
 * @since 0.1
 */
@Repository
public interface PartyRepository extends CrudRepository<Person, Long> {

    /**
     * Retrieve a person by first name and last name.
     *
     * @param firstName the first name
     * @param lastName the last name
     * @return the found person
     */
    Person findByFirstNameAndLastName(String firstName, final String lastName);
}
