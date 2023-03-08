package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable // mandatory cls level annotation to tell hib , follwoing class DOES NOT have
			// independent ID , no inde. life cycle, contents are going to be embedded in
			// the owning entity!
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class AdharCard {
	@Column(name = "card_no", length = 20, unique = true)
	@NotBlank
	private String cardNo;
	@Column(length = 30)
	@NotBlank
	private String location;
	@Column(name = "creation_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private LocalDate creationDate;
}
