package com.app.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass // To tell Hibernate : whatever follows is the common super class , used for
					// creating enities. Hibernate should not create a separate table for this
@Getter
@Setter
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Version // for adding version-based optimistic concurrency control
	private int version;
}
