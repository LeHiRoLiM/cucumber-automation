package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class PesquisaLehiPage extends BasePages
{
    private String url = "http://bug.dev.hill/signin";
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("pass");
    private By botaoPesquisar = By.id("login");
    private By msg = By.cssSelector("#toast_notification > div > div");


    public void abrir()
    {
        driver.get(url);
    }

    public void preencherEmail(String texto)
    {
        driver.findElement(campoEmail).sendKeys(texto);
    }

    public void preencherSenha(String texto)
    {
        driver.findElement(campoSenha).sendKeys(texto);
    }

    public void clicarPesquisar()
    {
        driver.findElement(botaoPesquisar).click();
    }

    public String getMsg()
    {
        return driver.findElement(msg).getText();
    }
}