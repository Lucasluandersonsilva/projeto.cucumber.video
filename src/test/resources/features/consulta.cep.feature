#Author: your.email@your.domain.com

@regressivos
Feature: Buscar cep no correio
  como usuario do correios
  quero informar um cep na busca
  para validar os dados de retorno

  @positivo
  Scenario: Realizar a busca do cep
    When enviar os dados para busca
    Then validar os dados retornado
   

 