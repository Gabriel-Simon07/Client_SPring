package com.devsuperior.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
