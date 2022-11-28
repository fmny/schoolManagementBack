package com.thales.controller;
/*
import com.thales.dao.CategorieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

//Voir + tard

@RestController()
@RequestMapping("/datainsert")
public class DataInsertController {
    @Autowired
    private CategorieDao categorieDao;
    @Autowired
    private IndividuDao individuDao;
    @Autowired
    PieceDao pieceDao;
    @Autowired
    VehiculeDao vehiculeDao;

    @GetMapping({"/", ""})
    public void insert(){
        getListIndividu();
        getList();
    }


    final public void getListIndividu() {

        //Individu individu1 = new Individu("toto@gmail.com","0142231628","Dupont","Gérard","RECAP.2022!","ADMINISTRATIF");
        Individu individu2 = new Individu("franck@gmail.com","0242223982","Dubosc","Franck","RECAP.2022!","GESTIONNAIRE");
        Individu individu3 = new Individu("lili@gmail.com","0443431628","Bétancourt","Liliane","RECAP.2022!","MAGASINIER");
        Individu individu4 = new Individu("josy@gmail.com","0443423628","Anne","Josy","RECAP.2022!","MAGASINIER");

        Individu individu1 = new Individu("a@a.com","0142231628","Dupont","Gérard","","ADMINISTRATIF");



        individuDao.save(individu1);
        individuDao.save(individu2);
        individuDao.save(individu3);
        individuDao.save(individu4);

    }

    final public void getList() {
        Categorie categorie1 = new Categorie("ELEC","Electromobilité",new Date());
        Categorie categorie2 = new Categorie("FILTRE","Filtre",new Date());
        Categorie categorie3 = new Categorie("HUILE","Huiles",new Date());
        Categorie categorie4 = new Categorie("OUTIL","Outillage",new Date());
        Categorie categorie5 = new Categorie("PNEU","Pneu",new Date());

        categorieDao.save(categorie1);
        categorieDao.save(categorie2);
        categorieDao.save(categorie3);
        categorieDao.save(categorie4);
        categorieDao.save(categorie5);

        Vehicule vehicule1 = new Vehicule("CLIO4","RENAULT","4",1,2010,5);
        Vehicule vehicule2 = new Vehicule("FORDFIESTA","FORD","Fiesta",3,2015,3);
        Vehicule vehicule3 = new Vehicule("FIAT500","FIAT","XS",11,2018,2);
        Vehicule vehicule4 = new Vehicule("FIATPUNTO","FIAT","2",2,2020,1);

        vehiculeDao.save(vehicule1);
        vehiculeDao.save(vehicule2);
        vehiculeDao.save(vehicule3);
        vehiculeDao.save(vehicule4);

        Piece piece1 = new Piece("EL/205/12/15",1250, "BLANC",125f,155f,categorie1);
        Piece piece2 = new Piece("FI/402/12/16",250, "BLEU",24f,37f,categorie2);
        Piece piece3 = new Piece("HU/205/12/17",350, "NOIR",45f,55f,categorie3);
        Piece piece4 = new Piece("OU/205/12/17",750, "NOIR",45f,55f,categorie4);


        piece1.getVehicules().add(vehicule1);
        piece1.getVehicules().add(vehicule2);

        piece2.getVehicules().add(vehicule3);
        piece2.getVehicules().add(vehicule2);

        piece3.getVehicules().add(vehicule4);
        piece3.getVehicules().add(vehicule2);

        piece4.getVehicules().add(vehicule1);
        piece4.getVehicules().add(vehicule4);

        pieceDao.save(piece1);
        pieceDao.save(piece2);
        pieceDao.save(piece3);
        pieceDao.save(piece4);

    }



}
*/