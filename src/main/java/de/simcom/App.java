package de.simcom;

import java.io.IOException;
import java.sql.SQLException;

import de.simcom.games.view.View;
import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;
import javafx.application.Application;

public class App {

	public static void main(String[] args) throws SQLException, TemplateNotFoundException,
			MalformedTemplateNameException, ParseException, IOException, TemplateException {

		Application.launch(View.class, args);
	}
}
