# Exemplo simples de sistema de leilao

Este projeto contem um exemplo didatico de leilao com as classes:

- `Usuario`
- `Lance`
- `Leilao`
- `Avaliador`

## O que foi implementado

- Cadastro de lances em um leilao (`Leilao.propoe`)
- Vínculo automatico entre o `Lance` e o `Leilao`
- Avaliacao do maior lance (`Avaliador.avalia`)
- Exemplo executavel em `ExemploSistemaLeilao`
- Testes unitarios para regras basicas de proposta e avaliacao

## Como rodar os testes

```powershell
.\mvnw.cmd test
```

## Como executar o exemplo

```powershell
.\mvnw.cmd -DskipTests compile exec:java -Dexec.mainClass="br.beanascigom.testesoftware.ExemploSistemaLeilao"
```

Se o plugin `exec` nao estiver configurado no seu ambiente, execute o exemplo direto pela IDE rodando a classe `ExemploSistemaLeilao`.

