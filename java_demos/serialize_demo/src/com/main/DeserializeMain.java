package com.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.model.CreditCard;

public class DeserializeMain {

	public static void main(String[] args) {
	
		try(FileInputStream fis=new FileInputStream("serialize.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			CreditCard cc=(CreditCard) ois.readObject();
			System.out.println("Deserialized CC data is ");
			System.out.println(cc);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
