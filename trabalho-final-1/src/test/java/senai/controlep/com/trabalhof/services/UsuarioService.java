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
    
        public Usuario cadastar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

        public boolean delete(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        if(usuario != null) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
        public boolean update(Usuario usuario) {
            usuarioRepository.save(usuario);
            return true;

        }
          public boolean atualizar(Usuario usuario) {
           return  usuarioRepository.save(usuario) != null;
            
        } 

         public Usuario buscar(Integer id) {
        return usuarioRepository.findById(id).get();
         }
        
        public List<Usuario> listarTodos(){
          return usuarioRepository.findAll();
         }

}
