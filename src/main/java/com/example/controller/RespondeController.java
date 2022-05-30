package com.example.controller;

import com.example.dao.RespondeDAO;
import com.example.model.Responde;

public class RespondeController {

    public void criarResposta(int na,int ne,long ma,int ca){

        RespondeDAO respondeDAO = new RespondeDAO();
        respondeDAO.criarResposta(new Responde(na, ne, ma, ca));
    }
    
}
