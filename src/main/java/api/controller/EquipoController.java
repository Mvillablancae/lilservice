package api.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import api.model.Equipo;
import api.model.InputEquipo;
import api.model.InputEquipoAux;
import api.model.Persona;
import api.services.EquipoService;
import api.services.PersonaService;




@CrossOrigin
@RestController
@RequestMapping("api/equipos")

public class EquipoController {
	@Autowired
	private EquipoService equipoService;
	@Autowired
	private PersonaService personaService;
	
	/*
	 
	 */
	@PostMapping("/new")
	public ResponseEntity<Equipo> addEquipoNew(@RequestBody InputEquipo inputs){
		int c=0;
		Set<Persona>  personas = new HashSet<>();
		for(InputEquipoAux input:inputs.getIds()){
			Persona p = personaService.FindByIdentificador(Long.valueOf(input.getId()));
			c++;
			if(p !=null) {
				personas.add(p);
			}
		}
		Equipo neq = new Equipo();
		neq.setPersonas(personas);
		neq.setNameEquipo(inputs.getNameEquipo());
		neq.setDirector(inputs.getDirector());
		neq.setIntegrantes(c);
		return new ResponseEntity<Equipo>(equipoService.SaveOrUpdate(neq),HttpStatus.CREATED);
	}
	
	
	
	
	@DeleteMapping("/delete/{id}")
	public String RemoveEquipo(@PathVariable int id) {
		equipoService.RemoveEquipo(Long.valueOf(id));
		return "Ok";		
	}


	
	@PostMapping("/init")
	public void Init(){
		Persona p = new Persona((long)1,"romina","vasquez",123,"enfermera",1,null);
		Persona p2 = new Persona((long)2,"alexis","vasquez",124,"medico general",1,null);
		Persona r1 = personaService.SavePersona(p);
		Persona r2 = personaService.SavePersona(p2);
		
		
	}
	
	
	@GetMapping("/view/{id}")
	public @ResponseBody Set<Persona> View_Equipo(@PathVariable int id){
		return equipoService.findById(Long.valueOf(id)).get().getPersonas();
	}
	
	@GetMapping("/searchByName/{name}")
	public ResponseEntity<Equipo> Search_Equipo(@PathVariable String name){
		return new ResponseEntity<Equipo>( equipoService.findByName(name),HttpStatus.CREATED);
		
	}
	
	
	
	@GetMapping("/all")
	public  @ResponseBody List<Equipo> allEquipo(){
		List<Equipo> allEq= new ArrayList<>();
		equipoService.listAll().forEach( (eq)-> {allEq.add(eq);  } );
		return allEq;
	}
	
	
	
	
	
	
	@PutMapping("/edit/{idEquipo}")
	public ResponseEntity<Equipo> EditEquipo(
			@RequestBody InputEquipo inputs,@PathVariable  String idEquipo){
		
		int c=0;
		Set<Persona>  personas = new HashSet<>();
		for(InputEquipoAux input:inputs.getIds()){
			Persona p = personaService.FindByIdentificador(Long.valueOf(input.getId()));
			c++;
			if(p !=null) {
				personas.add(p);
			}
		}
		Equipo x = equipoService.findById(Long.valueOf(idEquipo)).get();
		
		x.setIntegrantes(c);
		x.setPersonas(personas);
		x.setDirector(inputs.getDirector());
		x.setNameEquipo(inputs.getNameEquipo());
		
		
		return new ResponseEntity<Equipo>(equipoService.SaveOrUpdate(x),HttpStatus.CREATED);

	}
		

}
