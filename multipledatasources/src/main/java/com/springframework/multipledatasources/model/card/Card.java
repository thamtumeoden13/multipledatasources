package com.springframework.multipledatasources.model.card;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int expirationMonth;
    private int expirationYear;
	public void setExpirationMonth(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setExpirationYear(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}