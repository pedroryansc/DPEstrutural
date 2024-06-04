package atvAdapter;

import com.google.gson.JsonArray;

public class Classe2 {
	
	public static String retornaJSON(Classe1 c1) {
		String txtJson = c1.getTxt();
		JsonArray json = new JsonArray();
		json.add(txtJson);
		return json.toString();
	}
	
}