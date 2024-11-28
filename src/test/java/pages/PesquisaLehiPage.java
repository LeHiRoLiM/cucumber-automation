package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class PesquisaLehiPage extends BasePages
{
    private String url = "https://www.google.com/";
    private By campoPesquisa = By.id("APjFqb");
    private By botaoPesquisar = By.xpath("(//input[@class='gNO89b'])[2]");

    public void abrir()
    {
        driver.get(url);
    }

    public void preencherPesquisa(String texto)
    {
        driver.findElement(campoPesquisa).sendKeys(texto);
    }

    public void clicarEmPesquisar()
    {
        driver.findElement(botaoPesquisar).click();
    }
}