/**
 * 本程序用字节文件IO流实现文件的逐个字节复制，没有使用缓冲机制。
 */
package exp4.prj3.s2bio.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyA_NoBuffered_Byte {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d://javaio//filedemo//a.txt");
			FileOutputStream fos = new FileOutputStream("d://javaio//filedemo//b1.txt");
			int r;
			int line = 1;
			long start = System.currentTimeMillis();
			// 读一个字节，写一个字节：效率差
			while ((r = fis.read()) != -1) {
				fos.write(r);
				System.out.printf("%s%s", ".", (line++ % 16 == 0 ? "\n" : ""));
			}
			long end = System.currentTimeMillis();
			System.out.println("End.");
			System.out.println("Times: " + (end - start));

			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}