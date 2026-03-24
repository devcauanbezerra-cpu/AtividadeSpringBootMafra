package Atividade1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AtividadeSpringBoot {

@PostMapping("Criar")
	public String CriarUsuario() {
        return "Usuario Criado!";
  }

@GetMapping("Buscar")
   public String BuscarUsuario() {
	  return "Usuario Encontrado com Sucesso!";
}

@PutMapping("Atualizar")
   public String AtualizarUsuario() {
	return "Usuario Atualizado com Sucesso!";
	
}

@DeleteMapping("Deletar")
   public String DeletarUsuario() {
	return "Usuario Deletado com Sucesso!";
}
public static void main(String[] args) {
		SpringApplication.run(AtividadeSpringBoot.class, args);
	}

}