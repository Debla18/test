package com.lorenzo.openshift.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lorenzo.openshift.model.Contatto;

@RestController
public class ServiceRestController {

	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("mario","Rossi","mar"));
		lista.add(new Contatto("Luigi","Verdi","luig"));
		lista.add(new Contatto("Giada","Gialla","giad"));
		return lista;
	}
}
