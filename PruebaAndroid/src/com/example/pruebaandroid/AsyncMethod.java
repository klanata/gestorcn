package com.example.pruebaandroid;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import android.os.AsyncTask;

public class AsyncMethod extends AsyncTask<Void, Void, String> {

	@Override
	protected String doInBackground(Void... params)  {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		String data = null;
		
		try{
			String uri ="http://10.0.2.2:8080/PruebaRest/catastrofe/personas/2";
			URL url = new URL(uri);
			HttpURLConnection connection =
			    (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/xml");
			InputStream xml = connection.getInputStream();
			
			InputStreamReader is = new InputStreamReader(xml);
			StringBuilder sb=new StringBuilder();
			BufferedReader br = new BufferedReader(is);
			String read = br.readLine();

			while(read != null) {
			    //System.out.println(read);
			    sb.append(read);
			    read =br.readLine();
			    	
			}
			System.out.println(sb.toString());
			return sb.toString();
			}
			catch(Exception e){
					e.printStackTrace();
					return "Hubo un error " +e.getMessage();
					
			}
	}
	
	   protected void onPostExecute(String result) {
		   //este metodo se llama automaticamente cuando termina el doinbackground
		   System.out.print("El resultado es " + result );
	     }



}
