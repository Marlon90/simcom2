package de.simcom;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

import de.simcom.games.arma.commandMachine.impl.CommandList;
import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class App {

	public static void main(String[] args) throws SQLException, TemplateNotFoundException,
			MalformedTemplateNameException, ParseException, IOException, TemplateException {

		// Application.launch(View.class, args);
		CommandList cl = new CommandList();
		try {
			cl.getCommands();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}
}
