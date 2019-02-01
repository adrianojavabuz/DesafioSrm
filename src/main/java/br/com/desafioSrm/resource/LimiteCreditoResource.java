package br.com.desafioSrm.resource;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.desafioSrm.model.LimiteCredito;
import br.com.desafioSrm.util.ServicePath;



@RestController
@RequestMapping(path = ServicePath.LIMITE_PATH)
public class LimiteCreditoResource {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/inserirlimite",method = RequestMethod.POST,produces = "application/json",consumes="application/json")
	public ResponseEntity inserirpedido(@RequestBody LimiteCredito limite) throws ParseException{
		
		
			
			
			messagereturn=pedidoBusiness.inserirpedido(pedido);
			
			
		
		
		
		return new ResponseEntity(limite, HttpStatus.OK);
		 
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping
	public ResponseEntity<List<LimiteCredito>> getlimites() {
		
		List<LimiteCredito> lscliente = clienteRepository.buscarcnpjuserbycnpj();
        if (lscliente.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<LimiteCredito>>(lscliente, HttpStatus.OK);
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/{id}",method = RequestMethod.GET,produces = "application/json")
	public ResponseEntity findByIdLimite(@PathVariable("id") int id){
		
		
		
		
		return new ResponseEntity(p, HttpStatus.OK);
	
	}
	
	

}
