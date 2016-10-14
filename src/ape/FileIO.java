package ape;

import java.util.*;
import java.io.*;

public class FileIO {
    public static String[] loadIniFile(String f) throws Exception {
	ArrayList<String> str = new ArrayList<String>();
	String ln;
	BufferedReader br = new BufferedReader(new FileReader(f));
	while((ln = br.readLine()) != null)
	    str.add(ln);
	br.close();
	return str.toArray(new String[0]);
    }
}

