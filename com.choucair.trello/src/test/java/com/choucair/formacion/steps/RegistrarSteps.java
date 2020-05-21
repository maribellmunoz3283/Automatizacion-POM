package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.RegistrarPage;
import net.thucydides.core.annotations.Step;

public class RegistrarSteps {
    RegistrarPage registrarPage;
    @Step

    public void abrir() {
        registrarPage.open();

    }
    public void ingresaAutenticar() {

        registrarPage.ingresaAutenticar();

    }

    public void validar() {

        registrarPage.validarRespuesta();


    }
}





