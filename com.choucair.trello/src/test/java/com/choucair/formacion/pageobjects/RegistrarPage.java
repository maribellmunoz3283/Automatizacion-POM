package com.choucair.formacion.pageobjects;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://trello.com/es/signup")

public class RegistrarPage extends PageObject {

    @FindBy(xpath = "//input[@id='email']")
    WebElementFacade EMAIL;

    @FindBy(id = "signup-submit")
    WebElementFacade CONTINUAR;

    @FindBy(id = "displayName")
    WebElementFacade NOMBRE;

    @FindBy(xpath = "//input[@id='password']")
    WebElementFacade CONTRASENA;

    @FindBy(id = "signup-submit")
    WebElementFacade BOTON_REGISTRO;

    @FindBy(xpath = "//strong[contains(.,'motocicletas')]")
    WebElementFacade RESPUESTA;








    public void ingresaAutenticar() {

        EMAIL.click();
        EMAIL.sendKeys("mmunozz@choucairtesting.com");
        CONTINUAR.click();
        NOMBRE.sendKeys("Maribell Munoz Zuleta");
        CONTRASENA.sendKeys("Daniel-Yepes");
        BOTON_REGISTRO.click();


    }

    public void validarRespuesta() {

        String labelv = "motocicletas";
        String strMensaje = RESPUESTA.getText();
        assertThat(strMensaje, containsString(labelv));

    }


}




