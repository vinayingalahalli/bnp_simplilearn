package com.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.model.CreditCard;

public class SerializeMain {

	public static void main(String[] args) {
		
		
		try(FileOutputStream fos=new FileOutputStream("serialize.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				){
			CreditCard cc=new CreditCard(1234567890123456L, "Sachin R T", "RuPay", 200);
			oos.writeObject(cc);
			System.out.println("cc object serialized");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
