package ao.intellectus.gestao_convidados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ao.intellectus.gestao_convidados.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long>{

}
