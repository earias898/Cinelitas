/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.Cinelitas.repository;

import Cinelitas.Cinelitas.entity.Salas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Salas_Repository extends CrudRepository<Salas,Long> {

    public void save(Salas sala);

    public void deleteById(long ID_Sala);

    public Object findById(long ID_Sala);

    
}
