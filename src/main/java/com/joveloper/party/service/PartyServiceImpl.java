package com.joveloper.party.service;

import com.joveloper.party.model.Person;
import com.joveloper.party.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The default implementation of the {@link PartyService}.
 *
 * @author hrishikeshjoshi
 * @since 0.1
 */
@Service
public class PartyServiceImpl implements PartyService {

    @Autowired
    private PartyRepository pr;

    @Override
    public Person save(Person person) {
        return pr.save(person);
    }
}
