package twelvthAssignment;
import java.io.*;
//4. Write a java program to do read/write operation using buffered classes
public class BufferedClasses {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\profound java\\core_java_assignments\\assignments\\src\\twelvthAssignment\\";
		FileReader fr = new FileReader(filePath+"myFile.txt");
		BufferedReader br = new BufferedReader(fr);
		int ch = 0;
		while((ch=br.read()) != -1) {
			System.out.print((char)ch);
		}
		fr.close();
		br.close();
		
		FileWriter fw = new FileWriter(filePath+"myFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String s = "Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines. The buffer size may be specified, or the default size may be used. The default is large enough for most purposes. In general, each read request made by a Reader causes a corresponding read request to be made of the underlying character or byte stream. It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. Programs that use DataInputStreams for textual input can be";
		char b[] = s.toCharArray();
		for(int i = 0; i < b.length; i++) {
			bw.write(b[i]);
		}
		bw.close();
		fw.close();
	}

}
