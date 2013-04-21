package com.huaban.solr;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.solr.core.SolrConfig;
import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * 
 */

/*
 // @author matrix
 // Apr 21, 2013
 //
 */
public class SolrConfigTest {

	@Test
	public void test() throws IOException, ParserConfigurationException, SAXException {
		SolrConfig config = new SolrConfig("pin", new InputSource(this.getClass().getResourceAsStream("/solrconfig.xml")));
		
	}

}
