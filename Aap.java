package com.te.multiPlayer;

import java.util.Scanner;

public class Aap {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		MultiPlayer multiPlayer = new MultiPlayer();
		int count = 0;
		do {
			System.out.println("Enter 'playlist' to see the Playlist");
			System.out.println("Enter 'play' to play Your song from play list");
			System.out.println("Enter 'add'  to add the song");
			System.out.println("Enter 'delete' to delete the song");
			System.out.println("Enter 'search' to search the song");
			System.out.println("Enter 'update' to update the song name");
			System.out.println("Enter 'singer' to searchBySingerName");
			System.out.println("Enter 'exit' to exit the application");
			String selector=scanner.next();
			switch (selector) {
			case "play": {
				multiPlayer.playList();
				if(!multiPlayer.play()) {
					System.out.println("No Result");
				}
				break;
			}
			case "playlist": {
				multiPlayer.playList();
				break;
			}
			case "add": {
				multiPlayer.add();
				break;
			}
			case "delete": {
				multiPlayer.delete();
				break;

			}
			case "search": {

				if (!multiPlayer.search()) {
					System.out.println("No result");
				} 
				break;
			}
			case "update": {
				multiPlayer.update();
				break;
			}

			case "singer": {

				if (!multiPlayer.searchBySingerName()) {
					System.out.println("No result");
				} 
				break;
			}
			case "exit": {
				count++;
				break;
			}
			}
			
		} while (count == 0);

	}

}
