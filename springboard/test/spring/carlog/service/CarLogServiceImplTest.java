package spring.carlog.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"file:src/config/spring/db-context.xml",
		"file:src/config/spring/service-context.xml"
		})
public class CarLogServiceImplTest {
	@Autowired
	CarLogServiceImpl svc = new CarLogServiceImpl() ;
	
//	@Test
	public void writeRefuelProcTest() {
		
		for(Map<String, Object> refuelMap : refuelMapData()){

//			System.out.println(refuelMap.toString());
//			svc.writeRefuelProc(refuelMap) ;
			
		}
		
	}
	
	@Test
	public void writeRepairProcTest() {
		
		for(Map<String, Object> repairMap : repairMapData()){
			
			System.out.println(repairMap.toString());
			svc.writeRepairProc(repairMap) ;
			
		}
		
	}
	
	
	private List<Map> repairMapData() {
		
		String csvFile = "D:/projects/carlog/repair.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		List<Map> repairList = new ArrayList<Map>() ;
		
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				Map<String, Object> maps = new HashMap<String, Object>();
				String[] repair = line.split(cvsSplitBy);
				
				maps.put("repair_date", repair[0]) ;
				maps.put("distance", repair[1]) ;
				maps.put("title", repair[2]) ;
				maps.put("price", repair[3]) ;
				maps.put("repair_shop", repair[4]) ;
				
				repairList.add(maps) ;
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
		
		return repairList ;
	}
	
	private List<Map> refuelMapData() {
		 
		String csvFile = "D:/projects/carlog/gas1.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		List<Map> refuelList = new ArrayList<Map>() ;
		
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				Map<String, Object> maps = new HashMap<String, Object>();
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
				
				refuelList.add(maps) ;
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
		
		return refuelList ;
	  }
	
	
	
}
