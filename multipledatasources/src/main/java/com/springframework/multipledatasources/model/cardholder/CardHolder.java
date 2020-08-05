package com.springframework.multipledatasources.model.cardholder;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class CardHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String memberId;
    private String cardNumber;
	public void setCardNumber(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setMemberId(Object memberId2) {
		// TODO Auto-generated method stub
		
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}