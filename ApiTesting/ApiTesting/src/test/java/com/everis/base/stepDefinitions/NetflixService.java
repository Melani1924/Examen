package com.everis.base.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * @author jovallep
 */
public class NetflixService {

    @Steps
    public NetflixService netflix;

    @Given("que la aplicación esta operativa")
    public void queLaAplicacionEstaOperativa() {

    }

    @When("obtiene la lista: {int} de clientes suscritos")
    public void obtieneLaListaDeClientesSuscritos(int i) {
        netflix.listUser(i);
    }

    private void listUser(int i) {
    }

    @When("obtiene al cliente: {int} suscrito")
    public void obtieneAlClienteSuscrito(int user) {
    }
    @Then("valida que la respuesta es {int}")
    public void buscaAlCliente(int i) {

        netflix.validateStatusCode(i);
    }

    private void validateStatusCode(int i) {
    }


    @Then("valida que el correo es {string}")
    public void validaQueElCorreoEs(String var) {
        netflix.validateBodyContent(var);

    }

    private void validateBodyContent(String var) {
    }

    @When("obtiene la lista: {int} de clientes suscritos como objeto")
    public void obtieneLaListaDeClientesSuscritosComoObjeto(int i) {
        netflix.listUserObject(i);

    }

    private void listUserObject(int i) {
    }

    @Then("valida que el apellido es {string}")
    public void validaQueElApellidoEsString(String apellido) {
        netflix.validarApellido(apellido);
    }

    private void validarApellido(String apellido) {
    }

    @Then("valida que el nombre es {string}")
    public void validaQueElNombreEs(String nombre) {

        netflix.validarNombre(nombre);
    }

    private void validarNombre(String nombre) {
    }

    @When("inserto los valores del cliente con nombre {string} y trabajo {string}")
    public void insertoLosValoresDelClienteConNombreYTrabajo(String nombre, String trabajo) {
        netflix.insertUsuario(nombre, trabajo);
    }

    private void insertUsuario(String nombre, String trabajo) {
    }


    @And("valida que el trabajo es {string}")
    public void validaQueElTrabajoEs(String trabajo) {

        netflix.validaTrabajo(trabajo);
    }

    private void validaTrabajo( String trabajo) {
    }



    @When("^ejecuta la creacion \"([^\"]*)\"$")
    public void ejecutaLaCreacion(String api) {
        netflix.sendPostRequest(api);
    }

    private void sendPostRequest(String api) {
    }


    @And("^agrega la cabecera key: \"([^\"]*)\", y valor: \"([^\"]*)\"$")
    public void agregaLaCabeceraKeyYValor(String k, String v) {
        netflix.setHeader(k, v);
    }

    private void setHeader(String k, String v) {
    }

    private void setHeader( ) {
    }

    @And("valida el {string} sea {string}")
    public void validaElSea(String arg0, String arg1) {
        netflix.checkDataResponse(arg0,arg1);
    }

    private void checkDataResponse(String arg0, String arg1) {
    }

    private void checkDataResponse( ) {
    }

    @And("inicializo request en post")
    public void agregoParametrosDeRequestEnPost() {
        netflix.inicializoParametrosRequestPost();
    }
    private void inicializoParametrosRequestPost( ) {
    }

}
