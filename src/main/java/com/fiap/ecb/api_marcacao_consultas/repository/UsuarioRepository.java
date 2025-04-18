package com.fiap.ecb.api_marcacao_consultas.repository;
import com.fiap.ecb.api_marcacao_consultas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Optional<Usuario> findByEmail(String email);
}