/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.Cinelitas.service;

import Cinelitas.Cinelitas.entity.Salas;
import Cinelitas.Cinelitas.repository.Salas_Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Salas_Service implements Salas_Services2 {
    
    @Autowired
    private Salas_Repository Salas_Repository;
    
    @Override
    public List<Salas>getAllSalas() {
        return (List<Salas>)Salas_Repository.findAll();
    }
    
    public Salas getSalaById(long ID_Sala) {
        return (Salas) Salas_Repository.findById(ID_Sala);
     }
    
    @Override
    public void saveSalas(Salas sala) {
        Salas_Repository.save(sala);
     }
    
    @Override
    public void delete(long ID_Sala) {
        Salas_Repository.deleteById(ID_Sala);
    }  
    
}
