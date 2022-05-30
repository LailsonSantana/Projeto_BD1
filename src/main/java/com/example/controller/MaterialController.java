package com.example.controller;

import com.example.dao.MaterialDAO;
import com.example.model.Material;



public class MaterialController {

    public void cadastrarMaterial(String t, long m){

        MaterialDAO materialDAO = new MaterialDAO();
        materialDAO.criarMaterial(new Material(t, m));
    }
    
}
