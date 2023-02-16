package com.projeto.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.helpdesk.domain.Cliente;
import com.projeto.helpdesk.domain.Pessoa;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
