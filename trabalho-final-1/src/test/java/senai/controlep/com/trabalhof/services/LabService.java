package senai.controlep.com.trabalhof.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senai.controlep.com.trabalhof.models.lab;
import senai.controlep.com.trabalhof.repositories.LabRepository;

@Service
public class LabService {
    
    @Autowired
    public LabRepository labRepository;
    
        public lab cadrastar(Lab lab) {
        return labService.save(lab);
    }

        public boolean delete(Integer id) {
        lab lab = labService.findById(id).get();
        if(lab != null) {
            labService.deleteById(id);
            return true;
        }
        return false;
    }
        public boolean update(Lab lab) {
            labService.save(lab);
            return true;

        }
          public boolean atualizar(Lab lab) {
           return  labService.save(lab) != null;
            
        } 

         public lab buscar(Integer id) {
        return labService.findById(id).get();
         }
        
        public List<lab> listarTodos(){
          return labService.findAll();
         }

}