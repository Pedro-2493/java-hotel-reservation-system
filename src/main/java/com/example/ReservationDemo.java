package com.example;

/**
 * Clase de demostración para el sistema de reservas de hotel
 * Muestra el uso de constructores, getters, setters y validaciones
 * 
 * @author Pedro Luis Zamora Martinez
 * @version 1.0
 */
public class ReservationDemo {
    
    /**
     * Imprime información detallada de una reserva usando getters
     * @param reserva La reserva a mostrar
     * @param numero Número de la reserva
     */
    private static void printReservationDetails(Reservation reserva, int numero) {
        System.out.println("--- Información de reserva " + numero + " ---");
        System.out.println("ID reserva: " + reserva.getReservationId());
        System.out.println("Nombre del huesped: " + reserva.getGuestName());
        System.out.println("Tipo de habitación: " + reserva.getRoomType());
        System.out.println("Numero de noches: " + reserva.getNumberOfNights());
        System.out.println("Precio por noche: $" + reserva.getPricePerNight());
        System.out.println("Costo total: $" + reserva.calculateTotalCost());
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("=========---SISTEMA DE RESERVAS - HOTEL PARADISE---=========\n");

        // ========== RESERVA 1: Constructor por defecto ==========
        System.out.println(">>> Creando Reserva 1 con constructor por defecto.\n");
        Reservation reserva1 = new Reservation();

        System.out.println("Estado inicial:");
        System.out.println(reserva1);

        // Modificar usando setters
        System.out.println("\n>>> Configurando reserva con setters.");
        reserva1.setReservationId("R001");
        reserva1.setGuestName("Maria Osorio");
        reserva1.setRoomType("suite ejecutiva");
        reserva1.setNumberOfNights(5);
        reserva1.setPricePerNight(180.00);

        System.out.println("\nReserva 1 completa:");
        System.out.println(reserva1);

        // ========== RESERVA 2: Constructor parametrizado ==========
        System.out.println("\n\n>>> Creando Reserva 2 con constructor parametrizado.\n");
        Reservation reserva2 = new Reservation(
                "R002",
                "Carolina Ramirez",
                "Habitacion Doble",
                5,
                95.50
        );

        System.out.println("Reserva 2 creada:");
        System.out.println(reserva2);

        // Modificar algunos atributos
        System.out.println("\n>>> Actualizando reserva 2.");
        reserva2.setNumberOfNights(7);
        reserva2.setPricePerNight(89.99);

        System.out.println("Reserva 2 actualizada:");
        System.out.println(reserva2);

        // ========== USANDO GETTERS (sin duplicación) ==========
        System.out.println("\n\n======== DETALLES USANDO GETTERS ========\n");
        
        printReservationDetails(reserva1, 1);
        printReservationDetails(reserva2, 2);

        // ========== PROBANDO VALIDACIONES ==========
        System.out.println("======== PROBANDO VALIDACIONES ========\n");

        System.out.println(">>> Intentando establecer numero de noches negativo.");
        reserva1.setNumberOfNights(-2);
        
        System.out.println("\n>>> Intentando establecer precio negativo.");
        reserva2.setPricePerNight(-50.00);

        System.out.println("\n>>> Estableciendo valores validos.");
        reserva1.setNumberOfNights(4);
        reserva2.setPricePerNight(120.00);
        System.out.println("Valores actualizados correctamente.\n");

        // ========== RESUMEN FINAL ==========
        System.out.println("\n======== RESUMEN FINAL ========\n");

        System.out.println(reserva1);
        System.out.println(reserva2);

        double totalIngresos = reserva1.calculateTotalCost() + reserva2.calculateTotalCost();
        System.out.println("\nTotal de ingresos por ambas reservas: $" + totalIngresos);
        
        System.out.println("\nGracias por usar el Sistema de Reservas!");
    }
}