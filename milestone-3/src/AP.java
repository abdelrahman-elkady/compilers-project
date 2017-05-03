
import java_cup.parser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class AP {

	public static void main(String[] args) {

		String inFile = "data/safe.in";
		String outFile = "data/safe.out";

		if (args.length > 1) {
			inFile = args[0];
		}

		try {
			FileReader fis = new FileReader(inFile);
			BufferedReader bis = new BufferedReader(fis);

			BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));

			@SuppressWarnings("deprecation")
			parser parser = new parser(new Lexer(bis));

			try {
				parser.parse();
				writer.write("Done");
			} catch (Exception e) {
				writer.write("ParseError");
			}

			fis.close();
			bis.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
