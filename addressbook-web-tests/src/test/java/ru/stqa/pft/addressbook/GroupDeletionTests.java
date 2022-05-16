package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    gotoGroupPage();
    selectGroup(By.name("selected[]"));
    deleteSelectedGroups(By.name("delete"));
    returnToGroupPage();
  }

}
