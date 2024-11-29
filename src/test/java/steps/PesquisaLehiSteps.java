package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.PesquisaLehiPage;

public class PesquisaLehiSteps extends BaseSteps
{
    PesquisaLehiPage pagePesquisa = new PesquisaLehiPage();

    @Dado("que o usuario esta no site BUG e tem uma conta cadastrada")
    public void que_o_usuario_esta_no_site_bug_e_tem_uma_conta_cadastrada()
    {
        pagePesquisa.abrir();
        screenshot();
    }

    @Quando("escrever o Email: {string}")
    public void escrever_o_email(String texto)
    {
        pagePesquisa.preencherEmail(texto);
    }

    @E("senha: {string}")
    public void senha(String texto) throws InterruptedException
    {
        pagePesquisa.preencherSenha(texto);
        screenshot();
        pagePesquisa.clicarPesquisar();
        Thread.sleep(1000);
    }

    @Entao("mostra mensagem {string}")
    public void mensagem(String msgEsperado) throws InterruptedException
    {
        String msgNaTela = pagePesquisa.getMsg();
        Assert.assertEquals(msgEsperado, msgNaTela);
        screenshot();
        Thread.sleep(1000);
    }
}
