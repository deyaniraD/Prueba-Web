package com.nttdata.page;

import org.openqa.selenium.By;

public class CarritoJuntos {
    public static By iconoCuenta = By.xpath("//div[@class='dropdown header-icons-btn dropdown-toggle d-none d-sm-none d-md-block d-lg-block']");
    public static By btnIniciarSesion = By.xpath("//a[@class='btn header__my-account__link']");
    public static By txtUser = By.id("UserName");
    public static By txtContraseña = By.id("Password");
    public static By btnIngresar = By.xpath("//form[@id='login-form']//input[@type='submit' and @value='Ingresar']");
    public static By popUp = By.xpath("//w-div[@role='dialog']//w-div//span");
    public static By envioGratis = By.xpath("//a[span[text()='Envío Gratis']]");
    //public static By primerProductoEligeTusOpciones = By.xpath("//div[@id='product-preview-card']//a[@href='/p/seccional-lujo-vitoriano-27214946secc-lujog0111202305120171566']");
    public static By primerProductoEligeTusOpciones = By.xpath("//div[@id='product-preview-card']//a[@class='product-preview-card__wrapper__body__main-image']");
    public static By btnAgregarCarrito = By.xpath("//div[@id='btnComprar']");
    //public static By productoAñadido = By.xpath("//p[@class='modal-title modal-label']");
    public static By btnIrCarrito = By.xpath("//div[@class='add-to-cart']//a[text()='Ir al carrito']");
}
