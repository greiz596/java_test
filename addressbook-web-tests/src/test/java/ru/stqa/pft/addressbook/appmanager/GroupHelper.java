package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver driver) {
    super(driver);
  }

  public void returnToGroupPage() {
    Click(By.linkText("group page"));
  }

  public void submitFormCreation(By submit) {
    Click(submit);
  }

  public void fillGroupForm(GroupData groupData) {
    Type(By.name("group_name"), groupData.getName());
    Type(By.name("group_header"), groupData.getHeader());
    Type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    Click(By.name("new"));
  }

  public void deleteSelectedGroups(By delete) {
    Click(delete);
  }

  public void selectGroup(By name) {
    deleteSelectedGroups(name);
  }
}
