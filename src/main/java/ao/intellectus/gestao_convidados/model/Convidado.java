package ao.intellectus.gestao_convidados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Convidado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String numeroBilheteDeIdentidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroBilheteDeIdentidade() {
		return numeroBilheteDeIdentidade;
	}

	public void setNumeroBilheteDeIdentidade(String numeroBilheteDeIdentidade) {
		this.numeroBilheteDeIdentidade = numeroBilheteDeIdentidade;
	}

}
