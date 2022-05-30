package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
  public SessionHelper(WebDriver driver) {

    super(driver);
  }

  public void login(String username, String password) {
    driver.get("http://localhost/addressbook/");
    Type(By.name("user"), username);
    Type(By.name("pass"),password );
    driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
