package ru.stqa.pft.addressbook.tests;

import ru.stqa.pft.addressbook.model.GroupData;
import org.testng.annotations.*;

import org.openqa.selenium.*;

public class GroupCreationTests extends TestBase {
  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitFormCreation(By.name("submit"));
    app.getGroupHelper().returnToGroupPage();
  }

}
