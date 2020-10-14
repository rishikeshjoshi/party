package com.joveloper.party.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * The superclass for all party types.
 *
 * @author hrishikeshjoshi
 * @since 0.1
 */
@MappedSuperclass
@DiscriminatorColumn(name = "ptype")
public abstract class Party implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Setter
    @Getter
    private String externalId;

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    private Date createdAt = new Date();
}
