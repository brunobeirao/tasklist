package com.project.tasklist.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Tasklist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String titulo;
	private String descricao;
	private Boolean status;
	private Date dateCriacao;
	private Date dateEdicao;
	private Date dateRemocao;
	private Date dateConclusao;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	public Date getDateCriacao() {
		return dateCriacao;
	}

	public void setDateCriacao(Date dateCriacao) {
		this.dateCriacao = dateCriacao;
	}

	public Date getDateEdicao() {
		return dateEdicao;
	}

	public void setDateEdicao(Date dateEdicao) {
		this.dateEdicao = dateEdicao;
	}

	public Date getDateRemocao() {
		return dateRemocao;
	}

	public void setDateRemocao(Date dateRemocao) {
		this.dateRemocao = dateRemocao;
	}

	public Date getDateConclusao() {
		return dateConclusao;
	}

	public void setDateConclusao(Date dateConclusao) {
		this.dateConclusao = dateConclusao;
	}

}
