package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class HomeLehiPage extends BasePages
{
    private By titulo = By.cssSelector("#inventory_filter_container > div");

    public String showTituloPag()
    {
        return driver.findElement(titulo).getText();
    }
}
