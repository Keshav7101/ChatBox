package test.java.gla.ac.in.chatbox;
import java.awt.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.*;

public class Chat {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("\nHello my name is silver and i am a chatbot \nCan you tell me your name and age");
        Scanner input1= new Scanner(System.in);
        String name = input1.nextLine();
        int age = input1.nextInt();
        System.out.println("I will try to remember your name "+name+"\nWow you are "+age+" year old Great !!");
        String s1 = new String("hello");
        String s2 = new String("who are you");
        String s3 = new String("who made you");
        String s4 = new String("tell time");
        String s5 = new String("what time is it");
        String s6 = new String("what is your name");
        String s7 = new String("your name");
        String s8 = new String("tell me your name");
        String s9 = new String("do you remember me");
        String s10 = new String("who is your creator");
        String s11 = new String("who created you");
        String s12 = new String("what is your favourite movie");
        String s13 = new String("your favourite movie");
        String s14 = new String("any movie you like");
        String s15 = new String("your favourite music");
        String s16 = new String("favourite music");
        String s17 = new String("favourite movie");
        String s18 = new String("i don't like you");
        String s19 = new String("i love you");
        String s20 = new String("you are cool");
        String s21 = new String("do you think i am smart");
        String s22 = new String("am i smart");
        String s23 = new String("which language were you created in");
        String s24 = new String("what language were you created in");
        String s25 = new String("what is your gender");
        String s26 = new String("your gender");
        String s27 = new String("your age");
        String s28 = new String("what is your age");
        String s29 = new String("how old are you");
        String s30 = new String("play game");
        String s31 = new String("i am bored");
        String s32 = new String("can we play games");
        String s33 = new String("game");
        String s34 = new String("lets play a game");
        String s35 = new String("can you recommend a movie");
        String s36 = new String("do you know any movies");
        String s37 = new String("time");
        String s38 = new String("date");
        String s39 = new String("tell date");
        String s40 = new String("what date is it");
        String s41 = new String("tell me date");
        String s42 = new String("tell me time");

        for(int i=0;i<=10000;i++) {
            Scanner input2 = new Scanner(System.in);
            String message = input2.nextLine().toLowerCase();
            if (s1.equals(message)) {
                System.out.println("Hii");
            }
            else if(s2.equals(message)){
                System.out.println("i am Silver a chatbot");
            }
            else if(s3.equals(message) || s10.equals(message) || s11.equals(message)){
                System.out.println("My creator is Keshav Choudhary from GLA University");
            }
            else if(s4.equals(message) || s5.equals(message) || s37.equals(message) || s42.equals(message)){
                System.out.println(java.time.LocalTime.now());
            }
            else if(s6.equals(message) || s7.equals(message) || s8.equals(message)){
                System.out.println("My name is Silver");
            }
            else if(s38.equals(message) || s39.equals(message) || s40.equals(message) || s41.equals(message)){
                System.out.println(java.time.LocalDate.now());
            }
            else if(s9.equals(message)){
                System.out.println("Yes i remembered your name is "+name);
            }
            else if(s12.equals(message) || s13.equals(message) || s14.equals(message) || s17.equals(message)){
                System.out.println("My favourite movie is INCEPTION (2010) starring Leonardo DiCaprio");
            }
            else if(s15.equals(message) || s16.equals(message)){
                System.out.println("My favourite song is Shape of you sung by Ed Sheeran");
            }
            else if(s23.equals(message) || s24.equals(message)){
                System.out.println("I was created in Java language"+name);
            }
            else if (s30.equals(message) || s31.equals(message) || s32.equals(message) || s33.equals(message) || s34.equals(message)){
                System.out.println("I can suggest you a game");
                System.out.println("Choose from these games\n1.Bollywood Trivia\n2.GK Quiz");
                Scanner choice = new Scanner(System.in);
                int option = choice.nextInt();
                switch (option){
                    case 1:
                        System.out.println("You have selected Bollywood Trivia");
                        System.out.println("Lets Start");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("You have selected GK Quiz");
                        System.out.println("Lets Start");
                        System.out.println();
                        break;
                }
            }
            else {
                System.out.println("I can't understand what are you trying to say");
            }
        }
    }
}
