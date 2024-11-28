package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class PesquisaLehiPage extends BasePages
{
    private String url = "https://www.google.com/";
    private By campoPesquisa = By.id("APjFqb");
    private By campoescrever = By.linkText("APjFqb");
    private By botaopesquisar = By.xpath("(//input[@class='gNO89b'])[2]");

    public void abrir()
    {
        driver.get(url);
    }

    public void pesquisar()
    {
        driver.findElement(campoPesquisa);
        driver.findElement(campoPesquisa);
        driver.findElement(campoPesquisa).click();
    }

    public void clicar()
    {
        driver.findElement(botaopesquisar).click();
    }
}