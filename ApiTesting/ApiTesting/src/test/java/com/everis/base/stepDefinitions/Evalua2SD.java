package com.everis.base.stepDefinitions;

import com.everis.base.ServicioCore;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Evalua2SD {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(Evalua2SD.class);

    @Steps
    private ServicioCore servicioCore;

    @Given("que la aplicación este operativo")
    public void queLaAplicaciónEsteOperativo(String urlBase) {
        LOGGER.info("i laURL_BASEDelServicioEs");
        LOGGER.info("URL BASE = " + urlBase);
        servicioCore.configurarURLBaseServicio(urlBase);
        LOGGER.info("f laURL_BASEDelServicioEs");

    }

    @When("obtener un juego para laptop")
    public void obtenerUnJuegoParaLaptop(String path) {
        LOGGER.info("i consultoElServicioConElPath");
        servicioCore.consultarServicioGet(null, path);
        LOGGER.info("f consultoElServicioConElPath");


    }

    @Then("valido que la respuesta es {int}")
    public void validoQueLaRespuestaEs(int codigoRespuestaEsperado) {
        LOGGER.info("i elCodigoDeRespuestaEs");
        servicioCore.validarCodigoEsperado(codigoRespuestaEsperado);
        LOGGER.info("f elCodigoDeRespuestaEs");

    }

    @And("validar la respuesta")
    public void validarLaRespuesta() {
    }
}
