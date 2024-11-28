package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.*;
import pages.PesquisaLehiPage;

public class PesquisaLehiSteps extends BaseSteps
{
    PesquisaLehiPage pagePesquisa = new PesquisaLehiPage();

    @Dada("que o usuario acessa a pagina de pesquisa")
    public void que_o_usuario_acessa_a_pagina_de_pesquisa()
    {
        pagePesquisa.abrir();
    }

    @Quando("o usuario preenche o campo pesquisa com {string}")
    public void o_usuario_preenche_o_campo_pesquisa_com(String string)
    {
    }

    @E("o usuario clica no botao pesquisar")
    public void o_usuario_clica_no_botao_pesquisar()
    {
    }

    @Entao("o sistema apresenta uma lista de resultados")
    public void o_sistema_apresenta_uma_lista_de_resultados()
    {
    }
}
