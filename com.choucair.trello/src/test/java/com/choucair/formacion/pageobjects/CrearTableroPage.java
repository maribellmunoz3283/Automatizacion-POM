package com.choucair.formacion.pageobjects;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://trello.com/login")

public class CrearTableroPage extends PageObject {

    @FindBy(xpath = "//input[@id='user']")
    WebElementFacade EMAIL;

    @FindBy(id = "password")
    WebElementFacade CONTRASENA;

    @FindBy(id = "login")
    WebElementFacade BOTON_INICIAR;

    @FindBy(xpath = "//span[contains(.,'Crear un tablero nuevo')]")
    WebElementFacade CREAR_TABLERO;

    @FindBy(xpath = "//input[@class='subtle-input']")
    WebElementFacade NOMBRE_TABLERO;

    @FindBy(xpath = "//span[contains(.,'Crear tablero')]")
    WebElementFacade BOTON_CREAR_TABLERO;


    @FindBy(xpath = "//div[contains(.,'Tablero Prueba')])[30]")
    WebElementFacade RESPUESTA;





    public void autenticar() {

        EMAIL.click();
        EMAIL.sendKeys("mary198mx@gmail.com");
        CONTRASENA.sendKeys("Daniel-Yepes");
        BOTON_INICIAR.click();
        CREAR_TABLERO.click();
        NOMBRE_TABLERO.sendKeys("Tablero Prueba");
        BOTON_CREAR_TABLERO.click();

    }

    public void validarRespuesta() {

        String labelv = "Tablero Prueba";
        String strMensaje = RESPUESTA.getText();
        assertThat(strMensaje, containsString(labelv));

    }




}




