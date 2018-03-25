package de.simcom.games.arma.dc.buildMachine.constructor;

import java.io.IOException;

import de.simcom.games.arma.dc.buildMachine.data.Data;
import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public interface Constructor {

	void setTemplateEngine() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException;
	
	void setTemplateEngine(String templatePath) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
	IOException, TemplateException;

	void doStatement(Data data) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException;

	void doStatementConsole(Data data) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException;

}
