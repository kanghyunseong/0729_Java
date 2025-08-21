package com.kh.chap04_assist.model.dao;

import java.io.*;

import com.kh.chap04_assist.model.vo.*;

public class ObjectDao {
	
	// 출력
	// 객체 단위로 출력을 할 떄 보조스트림이 필요!
	public void outputFile() {
		
		Plant plant = new Plant("홍콩야자", "관엽");
		// 기반스트림 => FileOutputStream
		// 보조스트림 => ObjectOutputStream
		// 출력 => writeObject()
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt)"))) {
			oos.writeObject(plant);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void inputFile() {
		// ObjectInputStream
		// FileInputStream
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"))) {
			
			// readObject
			ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
