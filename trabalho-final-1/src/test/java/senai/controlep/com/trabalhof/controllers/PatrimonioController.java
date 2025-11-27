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

import senai.controlep.com.trabalhof.models.Patrimonio;
import senai.controlep.com.trabalhof.services.PatrimonioService;

@RestController
@RequestMapping("/Patrimonio")
public class PatrimonioController {
    
    @Autowired
    public PatrimonioService patrimonioService;

    @GetMapping("/find/{id}")
    public Patrimonio find(@PathVariable Integer id) {
        return patrimonioService.findById(id);
    }

    @GetMapping("/list")
    public List<Patrimonio> list() {
        return patrimonioService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public Patrimonio save(@PathVariable Integer id, @RequestBody Patrimonio patrimonio) {
        return patrimonioService.save(Patrimonio, id);
    }

    @PostMapping("/cadastro")
    public Patrimonio cadastar(@RequestBody Patrimonio patrimonio) {
        return patrimonioService.cadastrar(Patrimonio);
    }


}