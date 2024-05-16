package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoJuntosStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CarritoJuntosStepdefs {

    private WebDriver driver;
    private Scenario scenario;
    private CarritoJuntosStep carritoJuntosStep;

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @Given("que ingreso a la pagina de inicio {string}")
    public void queIngresoALaPaginaDeInicio(String url) {
        driver.get(url);
        carritoJuntosStep = new CarritoJuntosStep(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @When("hago clic en el icono cuenta")
    public void hagoClicEnElIconoCuenta() {
        carritoJuntosStep.hagoClicEnElIconoCuenta();
    }

    @And("elijo el boton iniciar session")
    public void elijoElBotonIniciarSession() {
        carritoJuntosStep.elijoElBotonIniciarSession();
    }

    @And("ingreso usuario {string}")
    public void ingresoUsuario(String usuario) {
        carritoJuntosStep.ingresoUsuario(usuario);
    }

    @And("ingreso contraseña {string}")
    public void ingresoContraseña(String contraseña) {
        carritoJuntosStep.ingresoContraseña(contraseña);
    }

    @And("doy clic en ingresar")
    public void doyClicEnIngresar() {
        carritoJuntosStep.doyClicEnIngresar();
    }

    @And("espero que salga el pop up")
    public void esperoQueSalgaElPopUp() {
        carritoJuntosStep.tiempoEspera();
    }

    @And("doy clic en cerrar pop up")
    public void doyClicEnCerrarPopUp() {
        carritoJuntosStep.doyClicEnCerrarPopUp();
    }

    @And("doy clic en envio gratis")
    public void doyClicEnEnvioGratis() {
        carritoJuntosStep.doyClicEnEnvioGratis();
    }

    @And("doy clic en el primer producto que aparece")
    public void doyClicEnElPrimerProductoQueAparece() {
        carritoJuntosStep.doyClicEnElPrimerProductoQueAparece();
    }

    @And("doy clic en añadir al carrito")
    public void doyClicEnAñadirAlCarrito() {
        carritoJuntosStep.doyClicEnAñadirAlCarrito();
    }

    @Then("valido que salga el pop up de que se añadido el producto")
    public void validoQueSalgaElPopUpDeQueSeAñadidoElProducto() {
        carritoJuntosStep.tiempoEspera();
    }

    @And("doy clic en ir al carrito")
    public void doyClicEnIrAlCarrito() {
        carritoJuntosStep.doyClicEnIrAlCarrito();
    }
}
