package cn.io.study02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/**
 * 
 * 
 * @author dell
 *
 */

public class Iotest01 {
	public static void main(String[] args) {
		File src=new File("abc.txt");
		InputStream is=null;
		try {
			is=new FileInputStream(src);
			int temp;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=is) {
				is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
