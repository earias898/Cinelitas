/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cinelitas.Cinelitas.service;

import Cinelitas.Cinelitas.entity.Salas;
import java.util.List;

/**
 *
 * @author Lichkhing
 */
public interface Salas_Services2 {
    public List<Salas> getAllSalas();
    public Salas getSalaById(long ID_Sala);
    public void saveSalas(Salas sala);
    public void delete (long ID_Sala);
   
}
