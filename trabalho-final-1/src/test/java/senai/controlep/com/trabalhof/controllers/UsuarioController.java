package senai.controlep.com.trabalhof.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import senai.controlep.com.trabalhof.models.Usuario;
import senai.controlep.com.trabalhof.services.UsuarioService;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    
    @Autowired
    public UsuarioService usuarioService;

    @GetMapping("/buscar/{id}")
    public Usuario buscar(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }

    @GetMapping("/listarTodos")
    public List<Usuario> list() {
        return usuarioService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public Usuario save(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuarioService.save(usuario, id);
    }

    @PostMapping("/cadastro")
    public Usuario cadastar(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @PostMapping
    public Usuario login(@RequestParam String nome, @RequestParam String senha){
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        return usuarioService.login(u);
    }

}
