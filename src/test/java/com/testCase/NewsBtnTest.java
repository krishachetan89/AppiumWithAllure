package com.testCase;

import com.page.NewsMenu;
import com.setup.BaseTest;
import io.qameta.allure.*;
import listener.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({TestListener.class})
@Epic("Regression Tests")
@Feature("News")


public class NewsBtnTest extends BaseTest {

        @Test
        @Severity(SeverityLevel.BLOCKER)
        @Description("Test Description: Click News Button and Assert Page Title")
        @Story("News page")
        public void chargerTest() throws InterruptedException {
            NewsMenu menu = new NewsMenu(driver);
            menu.openNewsTab();
        }

}
