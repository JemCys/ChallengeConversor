# README (English)

Currency Converter
This project is a simple currency converter application developed in Java. It allows users to convert between several currencies using real-time exchange rates obtained from the ExchangeRate-API. The application is console-based and requires IntelliJ IDEA or similar Java IDE to run.

## Features

- Convert between the following currencies:
    - USD to MXN
    - MXN to USD
    - USD to ARS
    - ARS to USD
    - USD to BRL
    - BRL to USD
    - USD to COP
    - COP to USD
- User-friendly menu interface
- Real-time exchange rates from ExchangeRate-API

## Requirements

- IntelliJ IDEA or similar Java IDE
- Java Development Kit (JDK) 11 or higher
- ExchangeRate-API key (You need to sign up for a free API key at https://www.exchangerate-api.com/)

## When you download the program you should: 

- **Open the project in IntelliJ IDEA or similar Java IDE.**
- **Add your ExchangeRate-API key:**
    - Open `CheckCurrency.java`.
    - Replace `YOUR_API_KEY` with your actual API key

    ```java
    String url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/" + baseCurrency + "/" + targetCurrency + "/" + currencyAmount;
    ```
    
    **Run the project:**
    
    - Locate `Main.java`.
    - Run the `main` method.
    
    ## Usage
    1. **Select the currency conversion option from the menu.**
    2. **Enter the amount you want to convert.**
    3. **View the conversion result.**
    4. **Repeat until you choose to exit.**
    
    ## About Me
    Developed by Clary Rebollar (Jemcy)



# README (Español)

Convertidor de Monedas
Este proyecto es una aplicación sencilla de conversión de monedas desarrollada en Java. Permite a los usuarios convertir entre varias monedas utilizando tasas de cambio en tiempo real obtenidas de ExchangeRate-API. La aplicación es de consola y requiere IntelliJ IDEA o un IDE Java similar para ejecutarse.

## Características

- Convertir entre las siguientes monedas:
    - USD a MXN
    - MXN a USD
    - USD a ARS
    - ARS a USD
    - USD a BRL
    - BRL a USD
    - USD a COP
    - COP a USD
- Interfaz de menú amigable para el usuario
- Tasas de cambio en tiempo real de ExchangeRate-API

## Requisitos

- IntelliJ IDEA o un IDE Java similar
- Java Development Kit (JDK) 11 o superior
- Clave de API de ExchangeRate-API (Debe registrarse para obtener una clave API gratuita en https://www.exchangerate-api.com/)

## Cuando abras el programa debes: 

- **Abra el proyecto en IntelliJ IDEA o en un IDE Java similar.**
- **Agregar su clave de ExchangeRate-API:**
    - Abra `CheckCurrency.java`.
    - Reemplace `YOUR_API_KEY` con su clave API real:
    
    ```java
    String url = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/pair/" + baseCurrency + "/" + targetCurrency + "/" + currencyAmount;
    ```
    
    **Ejecute el proyecto:**
    
    - Localice `Main.java`.
    - Ejecute el método `main`.
    
    ## Uso
    1. **Seleccione la opción de conversión de moneda del menú.**
    2. **Ingrese la cantidad que desea convertir.**
    3. **Vea el resultado de la conversión.**
    4. **Repita hasta que elija salir.**
    
    ## Sobre Mi 
    Desarrollado por Clary Rebollar (Jemcy)
