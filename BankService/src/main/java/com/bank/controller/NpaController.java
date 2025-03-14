package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.modal.Npa;
import com.bank.modal.Roa;
import com.bank.service.NpaService;

@RestController
@RequestMapping("/npa")
public class NpaController {
	 @Autowired
	 private NpaService npaServiceImpl;

	    @PostMapping("/add")
	    public Npa addLlcr(@RequestBody Npa npa) {
	        return npaServiceImpl.addNpa(npa);
	    }

	    @GetMapping("/get/npaByPeriod")
	    public Npa getByPeriod() {
	        return npaServiceImpl.getNpaByPeriod();
	    }
	    
	    @PutMapping("/edit/{id}")
	    public ResponseEntity<Npa> editNpa(@PathVariable int id, @RequestBody Npa updatedNpa) {
	    	Npa updated = npaServiceImpl.editNpa(id, updatedNpa);
	        return ResponseEntity.ok(updated);
	    }

	    @GetMapping("/calculate/latest")
	    public double calculateNpaLatest() {
	        return npaServiceImpl.calculateNpa(getByPeriod());
	    }
	    
	    @GetMapping("/calculate/months/{n}")
	    public List<Npa> calculateAllNpa(@PathVariable int n) {
	        return npaServiceImpl.allNpa(n);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public void deleteNpa(@PathVariable int id) {
	    	npaServiceImpl.deleteNpa(id);
	    }
}
