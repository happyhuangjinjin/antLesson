package cn.com.ware;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class TestIOutils {

	public static void main(String[] args) {
		try {
			ByteArrayInputStream bi = new ByteArrayInputStream("dddddd".getBytes());
			FileOutputStream file = new FileOutputStream("d:/a.txt");
			IOUtils.copy(bi, file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
