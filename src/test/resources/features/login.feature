# language: pt

  @login
  Funcionalidade: Login
    Eu como usuário do sistema
    Quero fazer login
    Para fazer uma compra no site

    Contexto: acessar tela de login
      Dado que estou na tela de login

    @login-sucesso
    Cenário: Login com sucesso
      Quando preencho login "qajuniorpaulo.23@gmail.com" e senha "123654"
      E clico em Login
      Então vejo mensagem de login com sucesso

    @login-invalido
   Esquema do Cenario: cenários:<cenario>
      Quando preencho login "<usuario>" e senha "<senha>"
      E clico em Login
      Então vejo mensagem "<mensagem>" de campo não preenchido

      Exemplos:
      |    usuario      | senha|    mensagem    |   cenario    |
      |  emailinvalido  |123654|E-mail inválido.|email inválido|
      |                 |123654|E-mail inválido.|email vazio   |
      |qateste@gmail.com|000   |Senha inválida. |Senha inválida|
      |qateste@gmail.com|      |Senha inválida. |Senha vazia   |

