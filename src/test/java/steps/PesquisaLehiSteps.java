package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.HomeLehiPage;
import pages.PesquisaLehiPage;

public class PesquisaLehiSteps extends BaseSteps
{
    PesquisaLehiPage pagePesquisa = new PesquisaLehiPage();
    HomeLehiPage pageHome = new HomeLehiPage();

    @Dado("que o usuario esta no site SwangLabs")
    public void que_o_usuario_esta_no_site_swang_labs()
    {
        pagePesquisa.syti();
    }

    @Quando("o usuario escrever username {string}")
    public void o_usuario_escrever_username(String texto)
    {
        pagePesquisa.usernamen(texto);
    }

    @Quando("o usuario escrever senha {string}")
    public void o_usuario_escrever_senha(String texto) throws InterruptedException {
        pagePesquisa.senha(texto);
        Thread.sleep(2000);
    }

    @Entao("o sistema e redirecionado para uma pagina com varios link de pesqisa")
    public void o_sistema_e_redirecionado_para_uma_pagina_com_varios_link_de_pesqisa()
    {
        String esperado= "Products";
        String naTela = pageHome.showTituloPag();
        Assert.assertEquals(esperado, naTela);
        screenshot();
    }
}
