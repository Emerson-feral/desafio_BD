package com.totalshakes.wstotalshakes;

import com.totalshakes.wstotalshakes.entity.Adicional;
import com.totalshakes.wstotalshakes.entity.Ingrediente;
import com.totalshakes.wstotalshakes.repository.AdicionalRepository;
import com.totalshakes.wstotalshakes.repository.IngredienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WstotalshakesApplicationTests {
	@Autowired
	IngredienteRepository ingredienteRepository;

	@Autowired
	AdicionalRepository adicionalRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void createIngrediente(){
		Ingrediente ingrediente = new Ingrediente();
		ingrediente.setNome("Jabuticaba");
		Adicional adicional = new Adicional();
		adicional.setIngrediente(ingrediente);
		ingredienteRepository.save(ingrediente);
		adicionalRepository.save(adicional);
	}

	@Test
	public void readIngrediente(){
		//TODO
	}

	@Test
	public void updateIngrediente(){
		//TODO
	}

	@Test
	public void deleteIngrediente(){
		//TODO
	}

}
