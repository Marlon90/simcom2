package de.simcom.games.arma.dc.scriptMachine.namespace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 		NamespaceReader binary = new NamespaceReader();
		byte[] bytes = binary.readSmallBinaryFile(
				"F:\\Program Files (x86)\\Steam\\steamapps\\common\\Arma 3\\Users\\X\\X.vars.Arma3Profile");
		System.out.println(binary.writeSmallBinaryFile(bytes, "simStart", "simEnd"));
 * 
 * */
public class NamespaceReader {

	public byte[] readSmallBinaryFile(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		return Files.readAllBytes(path);
	}

	public String writeSmallBinaryFile(byte[] aBytes, String prefixA, String prefixB)
			throws IOException, InterruptedException {

		// Path path = Paths.get(aFileName);
		// Files.write(path, aBytes); // creates, overwrites

		String decoded = new String(aBytes, "ISO-8859-1");
		Matcher m = Pattern.compile(prefixA + "(.+?)" + prefixB).matcher(decoded);
		boolean first = false;
		String returner = "";
		while (m.find() && first == false) {
			returner = m.group(1).toString().trim();
			first = true;
		}
		return returner;
	}

	private static void log(Object aMsg) {
		System.out.println(String.valueOf(aMsg));
	}
}