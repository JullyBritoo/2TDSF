package br.com.fiap.entity;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CARRO")											//colocar de 1 em 1, se não ele vai de 50 em 50
@SequenceGenerator(name="carro",sequenceName="SQ_TB_CARRO",allocationSize=1)
public class Carro {
	
	@Id
	@GeneratedValue(generator="carro", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	private String nome;
	private String marca;
	private String placa;
	private int ano;
	private Transmissao cambio;
	private Calendar dataFabricacao;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Transmissao getCambio() {
		return cambio;
	}
	public void setCambio(Transmissao cambio) {
		this.cambio = cambio;
	}
	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
}
