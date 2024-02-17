package kz.aitu.bakerywebservice.controllers;

import kz.aitu.bakerywebservice.models.Pastry;
import kz.aitu.bakerywebservice.services.PastryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pastry")
public class PastryController {
    private final PastryService pastryService;

    public PastryController(PastryService pastryService) {
        this.pastryService = pastryService;
    }

    @GetMapping
    public List<Pastry> getAllPastry() {
        return pastryService.findAllPastry();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pastry> getPastryById(@PathVariable int id) {
        Pastry pastry = pastryService.findById(id)
                .orElseThrow(() -> new RuntimeException("Pastry not found with id" + id));
        return ResponseEntity.ok().body(pastry);
    }

    @PostMapping
    public Pastry createPastry(@RequestBody Pastry pastry) {
        return pastryService.savePastry(pastry);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pastry> updatePastry(@PathVariable int id, @RequestBody Pastry pastry) {
        Pastry updatedPastry = pastryService.updateById(id, pastry);
        return ResponseEntity.ok(updatedPastry);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePastry(@PathVariable int id) {
        pastryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
