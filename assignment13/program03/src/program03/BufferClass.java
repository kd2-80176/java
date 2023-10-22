package program03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferClass {
	public static void main(String[] args) {
		String line;

		try (FileWriter fw = new FileWriter("buffer.lib")) {
			try (BufferedWriter bw = new BufferedWriter(fw)) {
				for (int i = 0; i < 4; i++) {
					System.out.print("enter the line=");
					line = new Scanner(System.in).next();
					bw.write(line);
					bw.newLine();
				

				}
			}
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("line saved");
		}
		
		try(FileReader fr=new FileReader("buffer.lib")){
			try(BufferedReader br=new BufferedReader(fr)){
				
				while((line = br.readLine()) !=null) {
					System.out.println(line);
				}
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
