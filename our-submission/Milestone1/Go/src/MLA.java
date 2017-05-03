
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Class MLA
 * 
 * Reads a specified input file, tokenize it, and writes
 * the output to a specified output file;
 * 
 * Input and output files can be given as command line
 * arguments. If no arguments are given, hard coded file
 * names will be used.
 * 
 * Output file will be automatically overwritten if exists.
 * 
 */
public class MLA {
	public static void main(String[] args) {
		String files[] = {"Go.in","Go2.in","Go3.in","Go4.in","Go5.in","Go6.in","Go7.in","Go8.in","Go9.in","Go10.in"};
		for(String inFile: files){
			System.out.println(inFile);
			String outFile = (inFile.split("\\."))[0]+".out1";
			if (args.length > 1) {
				inFile = args[0];
				outFile = args[1];
			}
	
			Lexer lexer = new Lexer(inFile);
	
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
	
				Token t;
	
				while (((t = lexer.nextToken()) != null)) {
					if (t.token != Token.EOF) {
						System.out.println(t.toString());
						writer.write(t.toString());
						writer.newLine();
					} else {
						System.out.println(t.toString());
						writer.write(t.toString());
						writer.newLine();
						break;
					}
				}
				writer.close();
				System.out.println("Done tokenizing file: " + inFile);
				System.out.println("Output written in file: " + outFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
