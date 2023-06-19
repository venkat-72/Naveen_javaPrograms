package com.Week3.Day03;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class TicketBookingSystem {
        int tickets = 50;

        synchronized public void Tickets(int ticketCount){
            if(ticketCount < tickets) {
                System.out.println(Thread.currentThread().getName() + " is here");
                tickets = tickets - ticketCount;
                System.out.println("Given tickets :" + Thread.currentThread().getName() + " " + ticketCount);
                System.out.println("Tickets left: " + tickets);
            }
            else {
                System.out.println("No available tickets ");
            }
        }

        public static void main(String[] args) {
            ExecutorService ex = Executors.newFixedThreadPool(5);
            TicketBookingSystem obj = new TicketBookingSystem();
            for (int i=0; i<5; i++){
                ex.submit(new Runnable() {
                    public void run() {
                        obj.Tickets(10);
                    }
                });
            }
        }


    }

