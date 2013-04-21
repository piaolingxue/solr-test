package com.huaban.solr;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.solr.core.SolrConfig;
import org.apache.solr.schema.IndexSchema;
import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class SchemaTest {

	@Test
	public void test() throws ParserConfigurationException, IOException, SAXException {
		String name = "pin";
		SolrConfig solrConfig = new SolrConfig(name, new InputSource(this.getClass().getResourceAsStream("/solrconfig.xml")));
		IndexSchema schema = new IndexSchema(solrConfig, name, new InputSource(this.getClass().getResourceAsStream("/schema.xml")));
	}

}
