#language: pt
Funcionalidade: fazer login

  @teste1 @reset
  Cenario: Login com sucesso
    Dado que o usuario esta no site SwangLabs
    Quando o usuario escrever username "standard_user"
    E o usuario escrever senha "secret_sauce"
    Então o sistema e redirecionado para uma pagina com varios link de pesqisa



