package de.simcom.games.arma.dc.buildMachine.constructor.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;

import de.simcom.games.arma.dc.buildMachine.constructor.Constructor;
import de.simcom.games.arma.dc.buildMachine.data.Data;
import de.simcom.games.arma.dc.buildMachine.templateEngine.impl.TemplateEngineFactory;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class ConstructorImpl implements Constructor {

	private Configuration cfg;

	public void doStatement(Data data) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException {

		checkCfg();

		Template template = cfg.getTemplate(data.getTemplateType().getPath());
		URL directory = ConstructorImpl.class.getResource("");
		File file = new File(directory.getPath() + "/output.sqf");
		Writer bw = new BufferedWriter(new FileWriter(file, true));

		template.process(((Data) data).getMappedData("data"), bw);

		bw.flush();
		bw.close();
	}

	public void doStatementConsole(Data data) throws TemplateNotFoundException, MalformedTemplateNameException,
			ParseException, IOException, TemplateException {
		checkCfg();
		Template template = cfg.getTemplate(data.getTemplateType().getPath());

		Writer out = new OutputStreamWriter(System.out);

		template.process(((Data) data).getMappedData(), out);

		out.flush();
		out.close();

	}

	@Override
	public void setTemplateEngine() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException {
		this.cfg = TemplateEngineFactory.getInstance("templates/");
	}

	@Override
	public void setTemplateEngine(String templatePath) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException {
		this.cfg = TemplateEngineFactory.getInstance(templatePath);
	}

	private void checkCfg() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException,
			IOException, TemplateException {
		if (cfg == null) {
			setTemplateEngine();
		}
	}

}
