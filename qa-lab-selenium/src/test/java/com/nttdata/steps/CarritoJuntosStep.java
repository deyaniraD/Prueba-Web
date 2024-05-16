package com.nttdata.steps;

import com.nttdata.page.CarritoJuntos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarritoJuntosStep {

    private WebDriver driver;

    public CarritoJuntosStep(WebDriver driver) {
        this.driver = driver;
    }

    public void hagoClicEnElIconoCuenta() {
        ///tiempo(8000);

        WebElement iconoCuenta = driver.findElement(CarritoJuntos.iconoCuenta);
        iconoCuenta.click();
    }

    public void elijoElBotonIniciarSession() {
        tiempo(2000);
        WebElement btnIniciarSesion = driver.findElement(CarritoJuntos.btnIniciarSesion);
        btnIniciarSesion.click();
    }

    public void ingresoUsuario(String usuario) {
        tiempo(2000);
        driver.findElement(CarritoJuntos.txtUser).sendKeys(usuario);
    }

    public void ingresoContraseña(String contraseña) {
        tiempo(2000);
        driver.findElement(CarritoJuntos.txtContraseña).sendKeys(contraseña);
    }

    public void doyClicEnIngresar() {
        tiempo(2000);
        driver.findElement(CarritoJuntos.btnIngresar).click();
    }

    public void tiempoEspera() {
        tiempo(5000);
    }

    public void doyClicEnCerrarPopUp() {
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CarritoJuntos.popUp));*/
        tiempo(5000);
        WebElement popUp = driver.findElement(CarritoJuntos.popUp);
        popUp.click();
    }

    public void doyClicEnEnvioGratis() {
        tiempo(6000);
        WebElement envioGratis = driver.findElement(CarritoJuntos.envioGratis);
        envioGratis.click();
    }

    public void doyClicEnElPrimerProductoQueAparece() {
        tiempo(5000);
        WebElement primerProductoEligeTusOpciones = driver.findElement(CarritoJuntos.primerProductoEligeTusOpciones);
        primerProductoEligeTusOpciones.click();
    }

    public void doyClicEnAñadirAlCarrito() {
        tiempo(3000);
        WebElement btnAgregarCarrito = driver.findElement(CarritoJuntos.btnAgregarCarrito);
        btnAgregarCarrito.click();
    }

    public void doyClicEnIrAlCarrito() {
        tiempo(3000);
        WebElement btnIrCarrito = driver.findElement(CarritoJuntos.btnIrCarrito);
        btnIrCarrito.click();
    }

    public void tiempo(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
