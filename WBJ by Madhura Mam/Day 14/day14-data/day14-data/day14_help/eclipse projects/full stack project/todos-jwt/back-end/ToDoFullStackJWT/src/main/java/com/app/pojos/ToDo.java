package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(exclude = {"user"})
@Entity
@Table(name = "todos")
public class ToDo extends BaseEntity{
	@Column(name="description",length = 60)
	private String desc;
	private LocalDate targetDate;
	private boolean done;
	//uni dir many to one association between User 1<----- * ToDo
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",nullable = false)
	@JsonIgnore
	private User user;

}
