package com.web.jpa.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("familyService")
public class FamilyService {
    
    @Autowired
    private HusbandRepository hr;
    @Autowired
    private WifeRepository wr;
    
    public void save(Husband husband){
        hr.save(husband);
        System.out.println("save ok");
    }
    
    public Husband findHusbandById(Long id){
        return hr.findById(id).get();
    }
    
        public Wife findWifeById(Long id){
        return wr.findById(id).get();
    }
    
}
