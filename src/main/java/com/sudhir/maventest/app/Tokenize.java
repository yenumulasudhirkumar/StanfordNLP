package com.sudhir.maventest.app;

import java.util.Properties;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Tokenize {

	public static void main(String[] args) {

		
		String text="After hearing about Joe's trip, Jane decided she might co-operate and go to France one day.";
		CoreDocument cd= new CoreDocument(text);
		
		//creating new Properties
		Properties p = new Properties();
		p.setProperty("annotators", "tokenize");
		
		
		//creating new pipeline using properties mentioned above & annotate the core document
		StanfordCoreNLP pipeline = new StanfordCoreNLP(p);
		pipeline.annotate(cd);
		
		//Iterate through all the tokens
		int token_size = cd.tokens().size();
		for(int i=0;i<token_size;i++) {
		
			CoreLabel cl = cd.tokens().get(i);
			System.out.println(cl);
		}
		
		
		
		
	}

}
