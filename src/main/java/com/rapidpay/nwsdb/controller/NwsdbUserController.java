package com.rapidpay.nwsdb.controller;

import java.util.List;
import java.util.Optional;
import com.rapidpay.nwsdb.model.NwsdbUser;
import com.rapidpay.nwsdb.service.custom.NwsdbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/nwsdb_user")
public class NwsdbUserController {

    @Autowired
    private NwsdbUserService nwsdbUserService;

    @GetMapping("/getAllNwsdbUsers")
    public List<NwsdbUser> getAllWbUsers() {
        try {
            return nwsdbUserService.getAllNwsdbUsers();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getNwsdbUser/{id}")
    public Optional<NwsdbUser> getWbUser(@PathVariable("id") int id) {
        try {
            return nwsdbUserService.getNwsdbUser(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/checkNwsdbUser/{account_number}")
    public boolean checkWbUser(@PathVariable("account_number") String account_number) {
        try {
            return nwsdbUserService.checkNwsdbUser(account_number);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @PostMapping("/saveNwsdbUser")
    public NwsdbUser saveWbUser(@RequestBody NwsdbUser nwsdbUser) {
        try {
            return nwsdbUserService.saveNwsdbUser(nwsdbUser);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @PutMapping("/updateNwsdbUser")
    public NwsdbUser updateWbUser(@RequestBody NwsdbUser nwsdbUser) {
        try {
            return nwsdbUserService.updateNwsdbUser(nwsdbUser);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/deleteNwsdbUser/{id}")
    public void deleteWbUser(@PathVariable("id") int id) {
        try {
            nwsdbUserService.deleteNwsdbUser(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
