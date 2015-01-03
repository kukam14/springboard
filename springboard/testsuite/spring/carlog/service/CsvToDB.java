package spring.carlog.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class CsvToDB {

	public static void main(String[] args) {
		CsvToDB obj = new CsvToDB();
		obj.run();
	}
	
	public void run() {
		 
		String csvFile = "D:/projects/carlog/gas1.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		try {
			
			Map<String, Object> maps = new HashMap<String, Object>();
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] refuel = line.split(cvsSplitBy);
	 
				maps.put("refuel_date", refuel[0]) ;
				maps.put("distance", refuel[1]) ;
				maps.put("pre_refuel_distance", refuel[2]) ;
				maps.put("gas_liter", refuel[3]) ;
				maps.put("price", refuel[4]) ;
				maps.put("fuel_eff_rate", refuel[5]) ;
				maps.put("gas_station", StringUtils.substringBefore(refuel[6], "-").trim()) ;
				maps.put("unit_price", StringUtils.substringBefore(StringUtils.substringAfterLast(refuel[6], "-"),"원").trim()) ;
				maps.put("description", refuel[7]) ;
				
				System.out.println(maps.toString()) ;
				
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		System.out.println("Done");
	  }

}
