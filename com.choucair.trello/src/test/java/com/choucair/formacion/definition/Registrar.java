package com.choucair.formacion.definition;

import com.choucair.formacion.steps.RegistrarSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;


public class Registrar {

    @Steps
    RegistrarSteps registrarSteps;



    @Dado("^que maribell requiere hacer registro$")
    public void que_maribell_requiere_hacer_registro() {
        registrarSteps.abrir();


    }

    @Cuando("^ella ingresa datos como nombre, email y contraseña en la plataforma$")
    public void ella_ingresa_datos_como_nombre_email_y_contraseña_en_la_plataforma() {

        registrarSteps.ingresaAutenticar();


    }

    @Entonces("^maribell verifica validacion exitosa motocicletas$")
    public void maribell_verifica_validacion_exitosa_motocicletas()  {
        registrarSteps.validar();
    }

    }


