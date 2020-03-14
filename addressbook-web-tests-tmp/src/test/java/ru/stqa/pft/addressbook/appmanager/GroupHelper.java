package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Роман on 13.03.2020.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
        click(By.name("group_name"));
        wd.findElement(By.name("group_name")).clear();
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void deleteGroup() {
        click(By.name("selected[]"));
        click(By.name("delete"));
    }
}
