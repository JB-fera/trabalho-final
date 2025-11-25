package senai.controlep.com.trabalhof.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senai.controlep.com.trabalhof.models.Usuario;
import senai.controlep.com.trabalhof.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    public UsuarioRepository usuarioRepository;

    public Usuario login(Usuario usuario){
        Usuario u = usuarioRepository.findByNome("nome");
        if(u != null && u.getSenha().equals(usuario.getSenha())){
            return u;
        }
        return null;
    }
    
}
