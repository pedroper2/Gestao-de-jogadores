package com.example.aula.service;

import com.example.aula.exception.NomeJaCadastreException;
import com.example.aula.exception.NomeJaCadastreException;
import com.example.aula.model.Usuario;
import com.example.aula.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario salvar(@Valid Usuario usuario) {
        if (usuarioRepository.findByNome(usuario.getNome()).isPresent()) {
            throw new NomeJaCadastreException("Usuário já cadastrado.");
        }

        return usuarioRepository.save(usuario);
    }

}
