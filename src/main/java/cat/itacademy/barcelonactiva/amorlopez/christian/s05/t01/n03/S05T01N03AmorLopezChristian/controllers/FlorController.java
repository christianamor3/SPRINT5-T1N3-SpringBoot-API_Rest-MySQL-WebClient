package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n03.S05T01N03AmorLopezChristian.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n03.S05T01N03AmorLopezChristian.model.dto.FlorEntityDTO;
import cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n03.S05T01N03AmorLopezChristian.model.services.FlorEntityService;

@RestController
@RequestMapping("/flor")
public class FlorController {
	
	@Autowired
	FlorEntityService service;

	@PostMapping ("/clientFlorsAdd")
	public ResponseEntity<FlorEntityDTO> createFlor (@RequestBody FlorEntityDTO florDTO){
		FlorEntityDTO florEntityDTO;
		
		try {
			florEntityDTO = service.createFlor(florDTO);
			return ResponseEntity.status(HttpStatus.CREATED).body(florEntityDTO);
		} catch (RuntimeException rte) {
	    	  System.out.println(rte.getMessage());
	    	  return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/clientFlorsUpdate/{id}")
	public ResponseEntity<FlorEntityDTO> updateFlor (@PathVariable int id, @RequestBody FlorEntityDTO florDTO){
		FlorEntityDTO florEntityDTO;
		
		try {
			florEntityDTO = service.updateFlor(id, florDTO);
			return ResponseEntity.ok(florEntityDTO);
		} catch (RuntimeException rte) {
			System.out.println(rte.getMessage());
	    	return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/clientFlorsDelete/{id}")
	public ResponseEntity<String> deleteFlor (@PathVariable int id){
		String mensaje;
		
		try {
			mensaje = service.deleteFlor(id);
			return ResponseEntity.ok(mensaje);
		} catch (RuntimeException rte) {
			System.out.println(rte.getMessage());
	    	return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/clientFlorsGetOne/{id}")
	public ResponseEntity<FlorEntityDTO> getOneFlor(@PathVariable int id){
		FlorEntityDTO florEntityDTO;
		
		try {
			florEntityDTO = service.getOneFlor(id);
			return ResponseEntity.ok(florEntityDTO);
		} catch (RuntimeException rte) {
			System.out.println(rte.getMessage());
	    	return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/clientFlorsAll")
	public ResponseEntity<List<FlorEntityDTO>> getAllFlor(){
		List<FlorEntityDTO> flores;
		
		try {
			flores = service.getAllFlor();
			return ResponseEntity.ok(flores);
		} catch (RuntimeException rte) {
			System.out.println(rte.getMessage());
	    	return ResponseEntity.notFound().build();
		}
	}
}
