package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SoppingCartSummery extends Utils {

    By _totalProductPrice = By.xpath("//td[@id='total_product']");
    By _shippingCart = By.id("total_shipping");
    By _proceedToCheckoutBtn2 = By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']//span");


    //Verify product name into cart
    public void verify_cart_product_name(String expItemName) {
        String acuItemNameInvoice = getTextFromElement(By.xpath("//td//p[@class='product-name']//a"));
        System.out.println(acuItemNameInvoice);
        Assert.assertEquals(acuItemNameInvoice, expItemName, "Item name is not matching in cart");
    }

    //Verify procut total price in cart
    public void verify_total_product_price(String expPrice) {
        String actualPrice = gettext(_totalProductPrice);
        Assert.assertEquals(actualPrice, expPrice, "Price is not matched in summery page");
    }

    //Verify shipping cost
    public void shiping_cost() {
        String value = gettext(_shippingCart);
        String exValue = "$2.00";
        Assert.assertEquals(value, exValue, "Shipping value is not matching");
    }

    //Verify total price
    public void total_price() {
        String actualPrice = gettext(_totalProductPrice).substring(1);
        String actualShiping = gettext(_shippingCart).substring(1);
        System.out.println("Total price :" + actualPrice);
        System.out.println("Shipping cost : " + actualShiping);
    }

    //Click on proceed to checkout button
    public void proceed_to_checkout2() {
        driverWaitsUntilClick(_proceedToCheckoutBtn2, 5);
    }
}
