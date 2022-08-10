import com.everis.base.ServicioCore;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EvaluaSD {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(EvaluaSD.class);

    @Steps
    private ServicioCore servicioCore;
    @Given("la URL_BASE del Servicio responde {int}")
    public void laURL_BASEDelServicioResponde(String urlBase) {

        LOGGER.info("i laURL_BASEDelServicioEs");
        LOGGER.info("URL BASE = " + urlBase);
        servicioCore.configurarURLBaseServicio(urlBase);
        LOGGER.info("f laURL_BASEDelServicioEs");
        
    }

    @When("consulto el Servicio con el Path {string}")
    public void consultoElServicioConElPath(String path) {
        LOGGER.info("i consultoElServicioConElPath");
        servicioCore.consultarServicioGet(null, path);
        LOGGER.info("f consultoElServicioConElPath");

        
    }

    @Then("el codigo de respuesta es {int}")
    public void elCodigoDeRespuestaEs( int codigoRespuestaEsperado) {
        LOGGER.info("i elCodigoDeRespuestaEs");
        servicioCore.validarCodigoEsperado(codigoRespuestaEsperado);
        LOGGER.info("f elCodigoDeRespuestaEs");
        
    }

    @And("valido el resultado")
    public void validoElResultado() {
    }

}
