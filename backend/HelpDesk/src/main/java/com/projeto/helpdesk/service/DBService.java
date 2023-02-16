package com.projeto.helpdesk.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.projeto.helpdesk.domain.Chamado;
import com.projeto.helpdesk.domain.Cliente;
import com.projeto.helpdesk.domain.Tecnico;
import com.projeto.helpdesk.domain.enums.Perfil;
import com.projeto.helpdesk.domain.enums.Prioridade;
import com.projeto.helpdesk.domain.enums.Status;
import com.projeto.helpdesk.repository.ChamadoRepository;
import com.projeto.helpdesk.repository.ClienteRepository;
import com.projeto.helpdesk.repository.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Felipe Campos", "42414153342", "felipecampos@gmail.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Maria Silva", "49178477883", "mariasilva@gmail.com", encoder.encode("123"));

		Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", null, tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(cha1));

	}

}
