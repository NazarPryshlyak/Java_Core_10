package Homeworkjavacore10v1;

import java.util.Scanner;

public class Main {

	public static void main ( String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ( "Введіть слово з п'яти букв :" ) ;
		
		String word = scanner.next() ;
		
		if ( word.length() == 5) {
			String wordArray [] = word.split ("") ;
			
			if (( wordArray[0].equalsIgnoreCase(wordArray[4])) && (wordArray[1].equalsIgnoreCase(wordArray[3]))) {
				System.out.println( "Введене слово " + word + " паліндром ") ;
			} else {
				System.out.println( "Введене слово " + word + " не є паліндромом ") ;
			} 
		    } else {
				System.out.println( " Вивести слово з 5 букв ") ;
			}
			scanner.close();
		}
	}
	
	

