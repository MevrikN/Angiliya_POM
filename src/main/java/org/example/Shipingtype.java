package org.example;

import org.openqa.selenium.By;

public class Shipingtype extends Utils {

    By _checkbox = By.xpath("//input[@type='checkbox' and @name='cgv']");
    By _proceedToCheckout3Btn = By.xpath("//button[@name='processCarrier']//span");

    //Click checkbox
    public void select_check_box() {
        driverClickOnElement(_checkbox);
    }

    //click checkout button
    public void click_proceed_to_checkout3() {
        driverClickOnElement(_proceedToCheckout3Btn);
    }

}
