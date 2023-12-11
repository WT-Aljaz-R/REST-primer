package com.example.restprimer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private final OsebaRepository repository;

    Controller(OsebaRepository repository){
        this.repository = repository;
    }

    @PostMapping("/oseba")
    Oseba ustavriOsebo(@RequestBody Oseba novaOseba){
        return repository.save(novaOseba);
    }

    @GetMapping("/osebe")
    List<Oseba> vseOsebe(){
        return repository.findAll();
    }

    @GetMapping("/{oseba-id}")
    Oseba getOseba(@PathVariable("oseba-id") Integer id){
        return repository.findById(id).get();
    }

    @PutMapping("/{oseba-id}")
    Oseba putOseba(@PathVariable("oseba-id") Integer id, @RequestBody Oseba novaOseba){
        return repository.findById(id)
                .map(oseba -> {
                    oseba.setIme(novaOseba.getIme());
                    oseba.setPriimek(novaOseba.getPriimek());
                    return repository.save(oseba);
                })
                .orElseGet(() -> {
                    novaOseba.setId(id);
                    return repository.save(novaOseba);
                });
    }

    @DeleteMapping("/{oseba-id}")
    void zbrisiOsebo(@PathVariable("oseba-id") Integer id){
        repository.deleteById(id);
    }
}
