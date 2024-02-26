package kz.aitu.bakerywebservice.services;

import kz.aitu.bakerywebservice.models.Pastry;
import kz.aitu.bakerywebservice.repositories.PastryRepositoryInterface;
import kz.aitu.bakerywebservice.services.interfaces.PastryServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PastryService implements PastryServiceInterface {
    private final PastryRepositoryInterface repo;
    PastryService(PastryRepositoryInterface repo) {
        this.repo = repo;
    }
    @Override
    public List<Pastry> findAllPastry() {
        return repo.findAll();
    }

    @Override
    public Optional<Pastry> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public Pastry savePastry(Pastry pastry) {
        return repo.save(pastry);
    }

    @Override
    public void deleteById(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public Pastry updateById(int id, Pastry pastry) {
        Pastry updatedPastry = this.repo.findById(id).orElseThrow(() -> new RuntimeException("Pastry not found with id " + id));
        updatedPastry.setName(pastry.getName());
        updatedPastry.setDescription(pastry.getDescription());
        updatedPastry.setPrice(pastry.getPrice());
        return this.repo.save(updatedPastry);
    }

}
