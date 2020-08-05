package com.springframework.multipledatasources.repository.card;

import com.springframework.multipledatasources.model.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}