package Homeworkjavacore10v1;

import java.util.Scanner;

public class Main {

	public static void main ( String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ( "������ ����� � �'��� ���� :" ) ;
		
		String word = scanner.next() ;
		
		if ( word.length() == 5) {
			String wordArray [] = word.split ("") ;
			
			if (( wordArray[0].equalsIgnoreCase(wordArray[4])) && (wordArray[1].equalsIgnoreCase(wordArray[3]))) {
				System.out.println( "������� ����� " + word + " �������� ") ;
			} else {
				System.out.println( "������� ����� " + word + " �� � ���������� ") ;
			} 
		    } else {
				System.out.println( " ������� ����� � 5 ���� ") ;
			}
			scanner.close();
		}
	}
	
	

