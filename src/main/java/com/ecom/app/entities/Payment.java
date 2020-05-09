package com.ecom.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Payment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4065660273690512718L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date datePayment;
	private long cardNumber;
	private String cardType;
	@OneToOne(mappedBy = "payment")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Order order;

}