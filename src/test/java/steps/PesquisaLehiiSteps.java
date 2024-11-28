package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.PesquisaLehiPage;

public class PesquisaLehiiSteps extends BaseSteps
{
    PesquisaLehiPage pagePesquisa = new PesquisaLehiPage();


    @Dado("que o usuario esta no site BUG e tem uma conta cadastrada")
    public void que_o_usuario_esta_no_site_bug()
    {
        pagePesquisa.abrir();
        screenshot();
    }

    @Quando("escrever o Email: {string}")
    public void escrever_um_email_valido(String texto)
    {
        pagePesquisa.preencherEmail(texto);
    }

    @E("senha: {string}")
    public void uma_senha_valida(String texto) throws InterruptedException {
        pagePesquisa.preencherSenha(texto);
        screenshot();
        pagePesquisa.clicarPesquisar();
        Thread.sleep(3000);
    }

    @Entao("mostra mensagem Login com sucesso!")
    public void login_e_feito_com_sucesso()
    {
        String msgEsperado = "Login com sucesso!";
        String msgNaTela = pagePesquisa.getMsg();

        Assert.assertEquals(msgEsperado, msgNaTela);
        screenshot();
    }

    // test 2
    @Então("mostra mensagem de erro")
    public void mostra_mensagem_de_erro()
    {
        String msnEsperado2 = "User not found";
        String msgNaTela2 = pagePesquisa.getMsg();
        Assert.assertEquals(msnEsperado2, msgNaTela2);
    }

}

