package com.choucair.formacion.definition;

import com.choucair.formacion.steps.CrearTableroSteps;
import com.choucair.formacion.steps.RegistrarSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CrearTablero {

    @Steps
    CrearTableroSteps crearTableroSteps;



    @Dado("^que maribell necesita crear un tablero en Trello$")
    public void que_maribell_necesita_crear_un_tablero_en_Trello()  {
        crearTableroSteps.abrir();
    }

    @Cuando("^ingresa con su usario y contraseña busca la opcion crear tablero en a la plataforma$")
    public void ingresa_con_su_usario_y_contraseña_busca_la_opcion_crear_tablero_en_a_la_plataforma() {

        crearTableroSteps.ingresaAutenticar();

    }
    @Entonces("^maribell verifica validacion exitosa Tablero Prueba$")
    public void maribell_verifica_validacion_exitosa_Tablero_Prueba()   {

        crearTableroSteps.validar();

    }



}
