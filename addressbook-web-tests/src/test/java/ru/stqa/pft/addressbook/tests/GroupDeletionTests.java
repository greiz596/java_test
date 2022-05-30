package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup(By.name("selected[]"));
    app.getGroupHelper().deleteSelectedGroups(By.name("delete"));
    app.getGroupHelper().returnToGroupPage();
  }

}
