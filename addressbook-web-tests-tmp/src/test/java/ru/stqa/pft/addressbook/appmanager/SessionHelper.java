package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Роман on 13.03.2020.
 */
public class SessionHelper extends HelperBase {
    private FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd)  {
        super(wd);
    }

    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"),password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }


}
