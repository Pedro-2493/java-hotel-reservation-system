package com.example;

/**
 * Clase de demostración para el sistema de reservas de hotel
 * Muestra el uso de constructores, guetters, setters y validaciones
 * 
 * @author Pedro Luis Zamora Martinez
 * @version 1.0
 */
public class ReservationDemo {
    public static void main(String[] args) {
        System.out.println("=========---SISTEMA DE RESERVAS - HOTEL PARADISE");

        //Reserva 1: Constructor por defecto.
        System.out.println(">>> Creando Reserva 1 con constructor por defecto.\n");
        Reservation reserva1 = new Reservation();

        System.out.println("Estado inicial:");
        System.out.println(reserva1);

        // Modificar usando setters.
        System.out.println("\n>>> Configurando reserva con setters.");
        reserva1.setReservationId("R001");
        reserva1.setGuestName("Maria Osorio");
        reserva1.setRoomType("suite ejecutiva");
        reserva1.setNumberOfNights(5);
        reserva1.setPricePerNigth(180.00);

        System.out.println("\nReserva 1 completa:");
        System.out.println(reserva1);

        // Reserva 2: Constructor parametrizado.
        System.out.println("\n\n>>> Creando Reserva con constructor parametrizado.\n");
        Reservation reserva2 = new Reservation(
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
        reserva2.setPricePerNigth(89.99);

        System.out.println("Reserva 2 actualizada:");
        System.out.println(reserva2);
    }
}