package com.suplements.spar.spartan.service.usuarioService;

import com.suplements.spar.spartan.dto.usuario.UsuarioLoginRequest;
import com.suplements.spar.spartan.dto.usuario.UsuarioRequest;
import com.suplements.spar.spartan.dto.usuario.UsuarioResponse;
import com.suplements.spar.spartan.exceptions.UsuarioNotFoundException;
import com.suplements.spar.spartan.mapper.usuarioMapper.IUsuarioMapper;
import com.suplements.spar.spartan.model.Usuario;
import com.suplements.spar.spartan.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService implements IUsuarioService {

    private final UsuarioRepository repository;
    private final IUsuarioMapper iUsuarioMapper;

    @Override
    public UsuarioResponse create(UsuarioRequest dto) {
        Usuario user = iUsuarioMapper.toEntity(dto);
        return iUsuarioMapper.toResponse(repository.save(user));
    }

    @Override
    public UsuarioResponse listById(long id) {
        return iUsuarioMapper.toResponse(repository.findById(id).orElseThrow(UsuarioNotFoundException::new));
    }

    @Override
    public List<UsuarioResponse> listAll() {

        List<Usuario> usuarios = repository.findAll();
        List<UsuarioResponse> dtos = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            dtos.add(iUsuarioMapper.toResponse(usuario));

        }

        return dtos;
    }

    @Override
    public UsuarioResponse update(long id, UsuarioRequest dto) {
        Usuario user = repository.findById(id).orElseThrow(UsuarioNotFoundException::new);

        user.setNome(dto.nome());
        user.setEmail(dto.email());
        user.setPassword(dto.password());
        user.setTelefone(dto.telefone());
        user.setEndereco(dto.endereco());
        user.setCpf(dto.cpf());
        user.setDataNascimento(dto.dataNascimento());

        return iUsuarioMapper.toResponse(repository.save(user));
    }

    @Override
    public void delete(long id) {
        Usuario user = repository.findById(id).orElseThrow(UsuarioNotFoundException::new);
        repository.delete(user);
    }


    @Override
    public boolean userExistsByEmailAndPassword(UsuarioLoginRequest usuarioLoginRequest) {
        return repository.existsByEmailAndPassword(
                usuarioLoginRequest.email(),
                usuarioLoginRequest.password()
        );
    }
}
