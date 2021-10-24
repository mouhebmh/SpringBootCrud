package tn.esprit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.Repositories.FactureRepository;
import tn.esprit.model.Facture;

import java.util.List;

@Service
public class FactureServiceImpl implements FactureService{

    @Autowired
    private FactureRepository factureRepository;

    @Override
    public void ajouterFacture(Facture facture) {
        factureRepository.save(facture);
    }

    @Override
    public void supprimerFacture(long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public void supprimerToutLesFactures() {
        factureRepository.deleteAll();
    }

    @Override
    public List<Facture> chercherFacture() {
        return factureRepository.findAll();
    }
}