/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */


import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = in.nextLine();
        System.out.print("Who said it? ");
        String author = in.nextLine();
        System.out.println(author+" says, \""+quote+"\"" );
        in.close();
    }
}
