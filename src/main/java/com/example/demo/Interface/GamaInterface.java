/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

/**
 *
 * @author juancalderon
 */

import com.example.demo.Model.Gama;
import org.springframework.data.repository.CrudRepository;


public interface GamaInterface extends CrudRepository <Gama, Integer>{
    
}
