package com.example.restprimer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface OsebaRepository extends JpaRepository<Oseba, Integer> {
}
