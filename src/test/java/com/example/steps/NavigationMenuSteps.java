package com.example.steps;

import com.example.BaseTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class NavigationMenuSteps extends BaseTest {
  @When("user go to list menu")
  public void userGoToListMenu() {
    navigationMenu.clickHamburgerBtn();
    navigationMenu.clickListMenu();
  }


  @And("user long press list menu")
  public void userLongPressListMenu() {
    listPage.longPress();
  }


  @And("user click multiple times on list menu")
  public void userClickMultipleTimesOnListMenu() {
    listPage.clickXTime(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.isl.simpleapp:id/text_view\" and @text=\"List ke-1\"]"),5);
  }
}
