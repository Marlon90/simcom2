package de.simcom.games.arma.dc.buildMachine.constructor.impl;

import java.io.IOException;

import de.simcom.games.arma.dc.buildMachine.constructor.Constructor;
import de.simcom.games.arma.dc.buildMachine.data.Data;
import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class MissionConstructor implements Constructor {

	@Override
	public void setTemplateEngine() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException {

	}

	@Override
	public void setTemplateEngine(String templatePath) throws TemplateNotFoundException, MalformedTemplateNameException,
			ParseException, IOException, TemplateException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doStatement(Data data) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException {

	}

	@Override
	public void doStatementConsole(Data data) throws TemplateNotFoundException, MalformedTemplateNameException,
			ParseException, IOException, TemplateException {

	}

}
