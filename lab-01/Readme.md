# Sistema de Controle de Versão

## Configuração inicial para uso do Git

### Configuração de nome de usuário e e-mail no Git

 Para identificação e organização é muito importante o uso de nome e e-mail no Git, logo que é preciso ter informações claras para poder realizar um bom controle de versão.

O nome e e-mail podem ser configurados da seguinte forma:

```bash
git config --global user.name "SeuNome"
git config --global user.email "SeuEmail@email.com"
```

### Criando Personal Access Token (PAT) no GitHub

Um Personal Access Token (PAT) é basicamente um código que funciona como uma senha, toda vez que um usuário tentar utilizar um "git push" é necessário inserir este token. Ele é de extrema importância para a segurança, logo que esse token é uma medida de segurança para o próprio usuário, por isso é necessário guardar este código com cuidado.

Para fazer o seu PAT é preciso realizar os seguintes passos:

1. Clique no seu perfil no canto superior direito.
1. Vá até configurações.
1. Desça até o final no lado esquerdo da tela e clique em configurações do desenvolvedor.
1. Agora entre em Personal access tokens e clique em Tokens clássicos.
1. Clique em gerar novo token, escolha o token clássico.
1. Agora basta escolher um nome, a data de duração, e as permissões concedidas por esse token.
1. Por fim clique em gerar novo token lá no final.

### Salvar em cache as credenciais do PAT

## Qual a diferença entre git merge e git rebase?
