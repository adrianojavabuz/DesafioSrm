package br.com.desafioSrm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public class LimiteCreditoService {
	
	@Autowired 
	LimiteCreditoRepository limiteCreditoRepository;
	
	
public ResponseEntity findByid(@PathVariable("id") Long id){
		
		if (this.limiteCreditoRepository.findOne(id) == null) {
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }

		  return new ResponseEntity (this.limiteCreditoRepository.findOne(id), HttpStatus.OK);
		  
		 
	}

}
