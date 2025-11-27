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

import senai.controlep.com.trabalhof.models.Lab;
import senai.controlep.com.trabalhof.services.LabService;

@RestController
@RequestMapping("/Lab")
public class LabController {
    
    @Autowired
    public LabService labService;

    @GetMapping("/find/{id}")
    public Lab find(@PathVariable Integer id) {
        return labService.findById(id);
    }

    @GetMapping("/list")
    public List<Lab> list() {
        return labService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public Lab save(@PathVariable Integer id, @RequestBody Lab lab) {
        return labService.save(Lab, id);
    }

    @PostMapping("/cadastro")
    public Lab cadastar(@RequestBody Lab lab) {
        return labService.cadastrar(Lab);
    }


}
