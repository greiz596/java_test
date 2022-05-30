package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class HelperBase {

  public WebDriver driver;

  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  protected void Click(By locator) {
    driver.findElement(locator).click();
  }

  protected void Type(By locator, String Text) {
    Click(locator);
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(Text);
  }

  public boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
