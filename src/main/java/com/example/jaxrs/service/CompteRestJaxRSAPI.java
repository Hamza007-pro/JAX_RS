package com.example.jaxrs.service;

import com.example.jaxrs.entities.Compte;
import com.example.jaxrs.repository.ComptRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@ComponentScan
@Path("/banque")
public class CompteRestJaxRSAPI {

    @Autowired
    private ComptRepository comptRepository;

    @Path("/compts")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Compte> getCompts(){
        return comptRepository.findAll();
    }

    @Path("/compt/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Compte getCompte(@PathParam("id") Long id){
        Optional<Compte> compte = comptRepository.findById(id);
        if (compte.isPresent()) {
            return compte.get();
        } else {
            throw new NotFoundException("Compte with id " + id + " not found.");
        }
    }

    @Path("/addCompte")
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Compte addCompte(Compte compte){
        return comptRepository.save(compte);
    }

    @Path("/updateCompte/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Compte updateCompte(@PathParam("id") Long id,Compte compte){
        Compte existingCompte = comptRepository.findById(id).get();
        if (existingCompte != null){
            existingCompte.setSolde(compte.getSolde());
            existingCompte.setDateCreation(compte.getDateCreation());
            existingCompte.setType(compte.getType());
            return comptRepository.save(existingCompte);
        }
        return null;
    }

    @Path("/deleteCompte/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteCompte(@PathParam("id") Long id){
        comptRepository.deleteById(id);
    }


}
