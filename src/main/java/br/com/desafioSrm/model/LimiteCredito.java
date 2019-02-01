package br.com.desafioSrm.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.desafioSrm.util.BaseEntity;

@Entity
@Table(name="tb_limite_credito")
public class LimiteCredito extends BaseEntity<Long> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="id",insertable = false, updatable = false)
	private Long id;
	private String nomeCliente;
	private double limiteCredito;
	private List<String> risco;

	
	
	//Getters and Setters
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public List<String> getRisco() {
		return risco;
	}
	public void setRisco(List<String> risco) {
		this.risco = risco;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
