@EVALUACION
Feature: Servicio de Prueba
  Background:
    Given la URL_BASE del Servicio es "https://www.freetogame.com/api/games"

  @Escenario1
  Scenario: Consulta del Servicio
    Given la URL_BASE del Servicio responde 200
    When consulto el Servicio con el Path "/?platform=pc&category=shooter"
    Then el codigo de respuesta es 200
    And valido el resultado

  @Escenario2
  Scenario:Consultar si hay un juego para laptop
    Given que la aplicación este operativo
    When obtener un juego para laptop
    Then valido que la respuesta es 404
    And validar la respuesta
