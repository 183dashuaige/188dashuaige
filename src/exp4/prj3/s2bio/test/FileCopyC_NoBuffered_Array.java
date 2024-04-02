/**
 * 本程序用字节文件IO流实现文件的以字节数组为单位的复制，没有使用缓冲机制。
 */
package exp4.prj3.s2bio.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyC_NoBuffered_Array {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d://javaio//filedemo//a.txt");
			FileOutputStream fos = new FileOutputStream("d://javaio//filedemo//b3.txt");

			int r;
			int line = 1;
			long start = System.currentTimeMillis();
			byte b[] = new byte[1024];
			// 读取文件，存入字节数组b，返回读取到的字符数，存入read,默认每次将b数组装满
			while ((r = fis.read(b)) != -1) {
				fos.write(b, 0, r);
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
