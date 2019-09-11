# new feature
# Tags: optional
    
Feature: Historia de usuario para validar test

    
Scenario: Ingresar a la aplicacion
    Given como usuario ingreso al sitio
    When ingreso "test" y "secret"    
    When interactuo en el portal
    Then salgo del portal
	