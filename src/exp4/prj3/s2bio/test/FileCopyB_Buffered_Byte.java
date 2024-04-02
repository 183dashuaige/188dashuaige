/**
 * 本程序用字节文件IO流实现文件的逐个字节复制，使用了缓冲机制（即缓冲字节流）。
 */
package exp4.prj3.s2bio.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyB_Buffered_Byte {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d://javaio//filedemo//a.txt"); 
			FileOutputStream fos = new FileOutputStream("d://javaio//filedemo//b2.txt");
			BufferedInputStream bis = new BufferedInputStream(fis); 
			BufferedOutputStream bos = new BufferedOutputStream(fos); 
			
			int r;
			int line = 1;
			long start = System.currentTimeMillis();
			// 读一个字节，写一个字节：效率差
			while ((r = bis.read()) != -1) {				
				bos.write(r);
				System.out.printf("%s%s", ".", (line++ % 16 == 0 ? "\n" : ""));
			}
			long end = System.currentTimeMillis();
			System.out.println("End.");
			System.out.println("Times: " + (end - start));
			
			bis.close();
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
