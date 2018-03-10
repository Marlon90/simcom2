package de.simcom.games.arma.commandMachine.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URISyntaxException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import de.simcom.games.arma.commandMachine.CommandMachine;

public class CommandList implements CommandMachine {

	private Writer writer;

	public String getCommandList() throws IOException {
		System.out.println("---- Starting initializing list");

		Document doc = Jsoup.connect("https://community.bistudio.com/wiki/Category:Scripting_Commands_Arma_3").get();

		Elements allLists = doc.getElementsByClass("mw-category");

		String returner = "";
		for (Element element : allLists.get(0).getAllElements()) {
			for (Element e : element.getElementsByTag("li")) {
				if (e.tagName() != "ul") {
					returner += e.wholeText() + "\n";
				}
			}
		}

		return returner.replaceAll(" ", "_").replaceAll("_%", "_%25");
	}

	public void getCommandsOld() throws IOException {
		for (String command : getCommandList().split("\n")) {
			String url = "https://community.bistudio.com/wiki/" + command;
			Document doc = Jsoup.connect(url).get();
			writer = new BufferedWriter(new FileWriter(new File("commandList.txt"), true));
			Element div = doc.getElementsByClass("_description cmd").first();
			Elements divChildren = div.children();

			Elements detachedDivChildren = new Elements();
			for (Element elem : divChildren) {
				Element detachedChild = new Element(Tag.valueOf(elem.tagName()), elem.baseUri(),
						elem.attributes().clone());
				detachedDivChildren.add(detachedChild);
			}
		}
	}

	public void getCommands() throws IOException, URISyntaxException {
		String commandList = getCommandList();
		for (String command : commandList.split("\n")) {
			String url = "https://community.bistudio.com/wiki/" + command;
			Document doc = Jsoup.connect(url).get();
			writer = new BufferedWriter(new FileWriter(new File("commandList.txt"), true));
			for (Element e : doc.getElementsByTag("dl")) {
				if (e.getElementsContainingText("Syntax:").size() > 0) {
					String syntax = (e.getElementsContainingText("Syntax:").get(0).wholeText().replaceAll("\n",
							"")) == null ? "" : e.getElementsContainingText("Syntax:").get(0).wholeText();

					if (!syntax.contains("Posted") && !syntax.contains("Alternative Syntax")) {
						//
						if (syntax.contains("\n")) {
							syntax = syntax.split("\n")[2];
						}
						// syntax = syntax.split("Syntax:")[1];
						if (syntax.contains("Parameters")) {
							syntax = syntax.split("Parameters:")[0] + "\n";
						}
						if (syntax.contains("Return Value")) {
							syntax = syntax.split("Return Value")[0];
						}
						syntax = syntax.replaceAll("Syntax:", "").trim().replaceAll("\\u00a0.+", "").replaceAll("  .+",
								"") + "\n";

						writer.write(syntax);
					}

				}

			}
			writer.flush();
			writer.close();
		}
		;
	}
}