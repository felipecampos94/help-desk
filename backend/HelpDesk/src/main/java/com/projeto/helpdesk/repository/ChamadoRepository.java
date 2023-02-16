package com.projeto.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.helpdesk.domain.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
