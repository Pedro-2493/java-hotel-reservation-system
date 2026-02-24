package com.example;

/**
 * Clase de demostración para el sistema de reservas de hotel
 * Muestra el uso de constructores, guetters, setters y validaciones
 * 
 * @author Pedro Luis Zamora Martinez
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=========---SISTEMA DE RESERVAS - HOTEL PARADISE");

        //Reserva 1: Constructor por defecto.
        System.out.println(">>> Creando Reserva 1 con constructor por defecto.\n");
        Product reserva1 = new Product();

        System.out.println("Estado inicial:");
        System.out.println(reserva1);

        // Modificar usando setters.
        System.out.println("\n>>> Configurando reserva con setters.");
        reserva1.setReservationId("R001");
        reserva1.setGuestName("Maria Osorio");
        reserva1.setRoomType("suite ejecutiva");
        reserva1.setNumberOfNights(5);
        reserva1.setPricePerNight(180.00);

        System.out.println("\nReserva 1 completa:");
        System.out.println(reserva1);

        // Reserva 2: Constructor parametrizado.
        System.out.println("\n\n>>> Creando Reserva con constructor parametrizado.\n");
        Product reserva2 = new Product(
                "R002",
                "Carolina Ramirez",
                "Gabitacion Doble",
                5,
                95.50
        );

        System.out.println("Reserva 2 creada:");
        System.out.println(reserva2);

        // Modificación de atributos
        System.out.println("\n>>> Actualizando reserva 2.");
        reserva2.setNumberOfNights(7);
        reserva2.setPricePerNight(89.99);

        System.out.println("Reserva 2 actualizada:");
        System.out.println(reserva2);


        System.out.println("\n\nDETALLES USANDO GETTERS\n");

        System.out.println("--- Información de reserva 1 ---");
        System.out.println("ID reserva: " + reserva1.getReservationId());
        System.out.println("Nombre del huesped: " + reserva1.getGuestName());
        System.out.println("Tipo de habitación: " + reserva1.getRoomType());
        System.out.println("Numero de noches: " + reserva1.getNumberOfNights());
        System.out.println("Precio por noche: $" + reserva1.getPricePerNight());
        System.out.println("Costo total: $" + reserva1.calculateTotalCost());


        System.out.println("--- Información de reserva 2 ---");
        System.out.println("ID reserva: " + reserva2.getReservationId());
        System.out.println("Nombre del huesped: " + reserva2.getGuestName());
        System.out.println("Tipo de habitación: " + reserva2.getRoomType());
        System.out.println("Numero de noches: " + reserva2.getNumberOfNights());
        System.out.println("Precio por noche: $" + reserva2.getPricePerNight());
        System.out.println("Costo total: $" + reserva2.calculateTotalCost());

    
        System.out.println("Reserva 2 creada:");
        System.out.println(reserva2);

        // Modificación de atributos
        System.out.println("\n>>> Actualizando reserva 2.");
        reserva2.setNumberOfNights(7);
        reserva2.setPricePerNight(89.99);

        System.out.println("Reserva 2 actualizada:");
        System.out.println(reserva2);


        System.out.println("\n\nDETALLES USANDO GETTERS\n");

        System.out.println("--- Información de reserva 1 ---");
        System.out.println("ID reserva: " + reserva1.getReservationId());
        System.out.println("Nombre del huesped: " + reserva1.getGuestName());
        System.out.println("Tipo de habitación: " + reserva1.getRoomType());
        System.out.println("Numero de noches: " + reserva1.getNumberOfNights());
        System.out.println("Precio por noche: $" + reserva1.getPricePerNight());
        System.out.println("Costo total: $" + reserva1.calculateTotalCost());


        System.out.println("\n\n---PROBANDO VALIDACIONES---\n");

        System.out.println(">>> Intentando establecer numero de noches negativo.");
        reserva1.setNumberOfNights(-2);
        
        System.out.println("\n>>> Intentando establecer precio negativo.");
        reserva2.setPricePerNight(-50.00);

        System.out.println("\n>>> Estableciendo valores validos.");
        reserva1.setNumberOfNights(4);
        reserva2.setPricePerNight(120.00);
        System.out.println("Valores actualizados correctamente.");

        System.out.println("======-- RESUMEN FINAL --======");

        System.out.println(reserva1);
        System.out.println(reserva2);

        double totalIngresos = reserva1.calculateTotalCost() + reserva2.calculateTotalCost();
        System.out.println("\n Total de ingresos por ambas reservas: $" + totalIngresos); 
}




    }
