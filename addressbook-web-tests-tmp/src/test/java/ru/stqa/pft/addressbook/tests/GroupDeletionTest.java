package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() {

        applicationManager.getGroupHelper().gotoGroupPage();
        applicationManager.getGroupHelper().deleteGroup();
        applicationManager.getNavigationHelper().gotoGroupPage();
    }


}
