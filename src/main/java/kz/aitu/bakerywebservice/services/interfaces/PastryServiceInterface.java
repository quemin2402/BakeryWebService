package kz.aitu.bakerywebservice.services.interfaces;

import kz.aitu.bakerywebservice.models.Pastry;
import kz.aitu.bakerywebservice.models.User;

import java.util.List;
import java.util.Optional;

public interface PastryServiceInterface {
    List<Pastry> findAllPastry();
    Optional<Pastry> findById(int id);
    Pastry savePastry(Pastry pastry);
    void deleteById(int id);
    Pastry updateById(int id, Pastry pastry);
}
