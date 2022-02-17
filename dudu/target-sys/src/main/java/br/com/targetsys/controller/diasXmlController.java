package br.com.targetsys.controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.targetsys.bean.Objeto;



@RestController
@RequestMapping("/getDiasXml")
public class diasXmlController {
	
	
	@GetMapping
	public String pushDias(){
		
		ArrayList<Objeto> diasList = new ArrayList<Objeto>();
		
		//LOOP
		//ESTRUTURA DE REPITIÇÃO
		for(int i = 1; i < 30; i++) {
			
			//ESTANCIA O OBJETO QUE CONTEM OS DIAS E VALORES NECESSÁRIOS PARA GERAR O JSON
			Objeto dia = new Objeto();			
			
			//PARA GERAR NUMERO ALEATORIOS
			Random random = new Random();	
			
			double numero = random.nextDouble() * 1000.0000;	
						
			//INSERINDO NO OBJETO OS DADOS
			dia.setDia(i);
			dia.setValor(numero);				
			
			//ADICIONANDO O OBJETO DENTRO DE UMA LISTA
			diasList.add(dia);			
			
		}

		
			return "teste";
		
	}

}
