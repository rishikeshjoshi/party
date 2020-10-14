package com.joveloper.party.model;

import com.google.common.base.Strings;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * A person entity.
 *
 * @author hrishikeshjoshi
 * @since 0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("-1")
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class Person extends Party {

    @Getter
    @Setter
    private String salutation;
    @Getter
    @Column(nullable = false)
    private String firstName;
    @Getter
    @Setter
    private String lastName;
    @Setter
    @Getter
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Getter
    @Setter
    private String gender;

    /**
     * Create a new person instance.
     *
     * @param theFirstName the first name
     * @param theLastName the last name
     */
    public Person(final String theFirstName, final String theLastName) {
        checkArgument(!Strings.isNullOrEmpty(theFirstName), "First name must be provided");
        firstName = theFirstName;
        lastName = theLastName;
    }
}
