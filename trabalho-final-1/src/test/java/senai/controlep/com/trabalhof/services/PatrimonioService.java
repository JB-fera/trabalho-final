package senai.controlep.com.trabalhof.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senai.controlep.com.trabalhof.models.Patrimonio;
import senai.controlep.com.trabalhof.repositories.PatrimonioRepository;

@Service
public class PatrimonioService {
    
    @Autowired
    public PatrimonioRepository patrimonioRepository;
    
        public Patrimonio cadrastar(Patrimonio patrimonio) {
        return patrimonioService.save(patrimonio);
    }

        public boolean delete(Integer id) {
        Patrimonio patrimonio = patrimonioService.findById(id).get();
        if(patrimonio != null) {
            patrimonioService.deleteById(id);
            return true;
        }
        return false;
    }
        public boolean update(Patrimonio patrimonio) {
            patrimonioService.save(patrimonio);
            return true;

        }
          public boolean atualizar(Patrimonio patrimonio) {
           return  patrimonioService.save(patrimonio) != null;
            
        } 

         public Patrimonio buscar(Integer id) {
        return patrimonioService.findById(id).get();
         }
        
        public List<Patrimonio> listarTodos(){
          return patrimonioService.findAll();
         }

}

