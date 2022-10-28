/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.Cinelitas.controller;

import Cinelitas.Cinelitas.entity.Salas;
import Cinelitas.Cinelitas.service.Salas_Services2;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class Salas_Controller {
   
    @Autowired
    private Salas_Services2 salasService;
    
    @GetMapping("/salas")
    public String index(Model model) {
        List<Salas> listaSalas = salasService.getAllSalas();
        model.addAttribute("titulo", "Tabla salas");
        model.addAttribute("Sala", listaSalas);
        return "salas";
       
    }
        
    @GetMapping("/salaN")
    public String crearSala(Model model) {
        List<Salas> listaSalas = salasService.getAllSalas();
        model.addAttribute("sala", new Salas());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarSalas(@ModelAttribute Salas sala) {
        salasService.saveSalas(sala);
        return "redirect:/salas";
    }
    @GetMapping("/editSala/{id}")
    public String editarSalas(@PathVariable("ID_Sala") Long ID_Sala, Model model) {
        Salas sala = salasService.getSalaById(ID_Sala);
        List<Salas> listaSalas= salasService.getAllSalas();
        model.addAttribute("sala", sala);
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
    @GetMapping("/delete/{id}")
    public String eliminarSala(@PathVariable("id") Long ID_Sala) {
        salasService.delete(ID_Sala);
        return "redirect:/salas";
    }
    
}
