package com.danilson.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danilson.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setName("Danilson Sanches");
		cliente1.setEmail("dsanches@outlook.com");
		cliente1.setTelefone("34 12345-1111");

		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setName("Izilda Kossy");
		cliente2.setEmail("izildakossy@hotmail.com");
		cliente2.setTelefone("34 99999-2345");

		return Arrays.asList(cliente1, cliente2);
	}
}
