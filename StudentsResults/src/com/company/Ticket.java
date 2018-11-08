package com.company;


import java.util.Random;

public class Ticket {
    public int id;
    String question;
    //Question generator
    private String[] firstWord = {"Who","What","When","Why","How", "Where from","How much time"};
    private String[] secondWord = {"was","bild","say","get","think","know","want","come","give","work","call","try","feel","become","find"};
    private String[] thirdWord = {"dog","Lebowski","helicopter","cat","lamp","Africa","car","builder","time","road","building","bomb","computer","cake","Haloween"};

    Random rnd= new Random();

    String tickets[]=new String[10];

        //int id=rnd.nextInt(100);

    public void fillTickets(){
        for (int i=0; i<10; i++){
            tickets[i]=firstWord[rnd.nextInt(6)]+ " " + secondWord[rnd.nextInt(14)]+ " " + thirdWord[rnd.nextInt(14)];
            //System.out.println(tickets[i]);
        }
    }

    public String getTicket(int id){
        return ((id+1)+" "+tickets[id]);
    }




}
