package com.rapidpay.nwsdb.service.custom.impl;

import java.util.List;
import java.util.Optional;
import com.rapidpay.nwsdb.model.NwsdbUser;
import com.rapidpay.nwsdb.repo.custom.NwsdbUserRepo;
import com.rapidpay.nwsdb.service.custom.NwsdbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NwsdbUserServiceImpl implements NwsdbUserService{

    @Autowired
    private NwsdbUserRepo nwsdbUserRepo;

    @Override
    public List<NwsdbUser> getAllNwsdbUsers() throws Exception {
        return nwsdbUserRepo.findAll();
    }

    @Override
    public Optional<NwsdbUser> getNwsdbUser(int id) throws Exception {
        return nwsdbUserRepo.findById(id);
    }

    @Override
    public boolean checkNwsdbUser(String account_number) throws Exception {
        List<NwsdbUser> nwsdbUsers = nwsdbUserRepo.findAll();

        for (NwsdbUser nwsdbUser: nwsdbUsers){
            if(nwsdbUser.getAccount_number().equals(account_number)){
                return true;
            }
        }
        
        return false;
    }

    @Override
    public NwsdbUser saveNwsdbUser(NwsdbUser nwsdbUser) throws Exception {
        return nwsdbUserRepo.save(nwsdbUser);
    }

    @Override
    public NwsdbUser updateNwsdbUser(NwsdbUser nwsdbUser) throws Exception {
        if(!nwsdbUserRepo.findById(nwsdbUser.getId()).isEmpty()){
            return nwsdbUserRepo.save(nwsdbUser);
        }else{
            return null;
        }  
    }

    @Override
    public void deleteNwsdbUser(int id) throws Exception {
        nwsdbUserRepo.deleteById(id);
    }

}
