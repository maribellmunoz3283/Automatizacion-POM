package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.CrearTableroPage;
import com.choucair.formacion.pageobjects.RegistrarPage;
import net.thucydides.core.annotations.Step;

public class CrearTableroSteps {

    CrearTableroPage crearTableroPage;
    @Step

    public void abrir() {

        crearTableroPage.open();

    }
    public void ingresaAutenticar() {

        crearTableroPage.autenticar();

    }

    public void validar(){
        crearTableroPage.validarRespuesta();
    }



    }






