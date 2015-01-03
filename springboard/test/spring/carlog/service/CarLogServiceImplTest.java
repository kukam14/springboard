package spring.carlog.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.carlog.vo.Refuel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
		"file:src/config/spring/db-context.xml",
		"file:src/config/spring/service-context.xml"
		})
public class CarLogServiceImplTest {
	
	@Autowired
	private CarLogServiceImpl svc ;
	
//	@Test
	public void getPreDistance(){
		System.out.println(svc.getPreRefuelInfo()) ;
		
		/*Iterator it = svc.getPreRefuelInfo().entrySet().iterator() ;
		while(it.hasNext()){
			
			Entry entry = (Entry)it.next() ;
			System.out.println("key : "+entry.getKey() + " value : "+entry.getValue());
			
			Map<String, Object> pre = new HashMap<String, Object>() ;
			pre = (Map<String, Object>) entry.getValue() ;
			System.out.println("pre_distance : "+pre.get("pre_distance")+" gas_liter : "+pre.get("gas_liter")) ;
		}*/
		
		Refuel refuel = svc.getPreRefuelInfo() ;
		System.out.println("refuel.toString() : "+refuel.toString());
		
		
	}
	
//	@Test
	public void getPreDistance2() {
		System.out.println("---- getPreDistance2 ----");
		
	}
	
	@Test
	public void writeRefuelProcTest() {
		
		for(Refuel refuel : refuelVoData2()){
			svc.writeRefuelProc2(refuel) ;
		}
		
	}
	
//	@Test
	public void writeRepairProcTest() {
		
		for(Map<String, Object> repairMap : repairMapData()){
			
			System.out.println(repairMap.toString());
			svc.writeRepairProc(repairMap) ;
			
		}
		
	}
	
	//@Test
	public void writeParkingProcTest() {
		
		for(Map<String, Object> parkingMap : parkingMapData()){
			
			System.out.println(parkingMap.toString());
			svc.writeParkingProc(parkingMap) ;
			
		}

	}
	
//	@Test
	public void writeTollProcTest() {
		
		for(Map<String, Object> map : tollMapData()){
			
			System.out.println(map.toString());
			svc.writeTollProc(map) ;
			
		}

	}
	
//	@Test
	public void writeEtcProcTest() {
		
		for(Map<String, Object> map : etcMapData()){
			
			System.out.println(map.toString());
			svc.writeEtcProc(map) ;
			
		}

	}
	
//	@Test
	public void writeInsuranceProcTest() {
		
		for(Map<String, Object> map : insurMapData()){
			
			System.out.println(map.toString());
			svc.writeEtcProc(map) ;
			
		}

	}
	
	
	private List<Map> insurMapData() {
		
		String csvFile = "D:/projects/carlog/insur.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		List<Map> list = new ArrayList<Map>() ;
		
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				Map<String, Object> maps = new HashMap<String, Object>();
				String[] col = line.split(cvsSplitBy);
				
				maps.put("etc_date", col[0]) ;
				maps.put("title", col[1]) ;
				maps.put("etc_price", col[2]) ;
				maps.put("description", col[3]) ;
				
				list.add(maps) ;
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
		
		return list ;
	}

	private List<Map> etcMapData() {
		
		String csvFile = "D:/projects/carlog/etc.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		List<Map> list = new ArrayList<Map>() ;
		
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				Map<String, Object> maps = new HashMap<String, Object>();
				String[] col = line.split(cvsSplitBy);
				
				maps.put("etc_date", col[0]) ;
				maps.put("title", col[1]) ;
				maps.put("etc_price", col[2]) ;
				maps.put("description", col[3]) ;
				
				list.add(maps) ;
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
		
		return list ;
	}
	
	
	private List<Map> tollMapData() {
		
		String csvFile = "D:/projects/carlog/toll.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		List<Map> list = new ArrayList<Map>() ;
		
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				Map<String, Object> maps = new HashMap<String, Object>();
				String[] col = line.split(cvsSplitBy);
				
				maps.put("toll_date", col[0]) ;
				maps.put("destination", col[1]) ;
				maps.put("toll_price", col[2]) ;
				
				list.add(maps) ;
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
		
		return list ;
	}

	
	private List<Map> parkingMapData() {
		
		String csvFile = "D:/projects/carlog/parking.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		List<Map> parkingList = new ArrayList<Map>() ;
		
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				Map<String, Object> maps = new HashMap<String, Object>();
				String[] repair = line.split(cvsSplitBy);
				
				maps.put("parking_date", repair[0]) ;
				maps.put("place", repair[1]) ;
				maps.put("park_price", repair[2]) ;
				
				parkingList.add(maps) ;
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
		
		return parkingList ;
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
	
	
	private List<Refuel> refuelVoData2() {
		 
		String csvFile = "D:/projects/carlog/gas1.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		List<Refuel> refuelList = new ArrayList<Refuel>() ;
		
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				Refuel refuelVo = new Refuel() ;
				String[] refuel = line.split(cvsSplitBy);
				
				refuelVo.setRefuel_date(refuel[0]);
				refuelVo.setDistance(Integer.parseInt(refuel[1]));
				refuelVo.setPre_refuel_distance(Integer.parseInt(refuel[2]));
				refuelVo.setGas_liter(Float.parseFloat(refuel[3]));
				refuelVo.setPrice(Integer.parseInt(refuel[4]));
				refuelVo.setFuel_eff_rate(Float.parseFloat(refuel[5]));
				refuelVo.setGas_station(StringUtils.substringBefore(refuel[6], "-").trim());
				refuelVo.setUnit_price(Integer.parseInt(StringUtils.substringBefore(StringUtils.substringAfterLast(refuel[6], "-"),"원").trim()));
				refuelVo.setDescription(refuel[7]);
				
				refuelList.add(refuelVo) ;
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
