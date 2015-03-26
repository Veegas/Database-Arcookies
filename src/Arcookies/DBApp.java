package Arcookies;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import net.sf.javaml.core.kdtree.*;
import exceptions.DBAppException;
import exceptions.DBEngineException;

public class DBApp implements DBAppInterface{
	
	ArrayList<Table> tables = new ArrayList<Table>();

	public static void main (String [] args) {
		
		/*try {
			CsvController.writeCsvFile("aywa", "yalla", true, false, "la2", "int");
			CsvController.writeCsvFile("aywa2", "yalla", true, false, "la2", "int");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		try {
			Hashtable<String, String> namesTypes
		     = new Hashtable<String, String>();
			
			Hashtable<String, String> namesRefs
		     = new Hashtable<String, String>();
			
			namesTypes.put("name","String");
			namesTypes.put("tutorial","String");
			namesTypes.put("id","int");
			namesTypes.put("lol","int");
			
			namesRefs.put("tutorial","class");
			namesRefs.put("name","student");
			
			DBApp trial = new DBApp();
			
			
			trial.createTable("TrialTable",namesTypes,namesRefs,"lol");
			System.out.print("done");
		} catch (DBAppException | IOException e) {
			System.out.println("error hena");
			e.printStackTrace();
		}
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createTable(String strTableName,
			Hashtable<String, String> htblColNameType,
			Hashtable<String, String> htblColNameRefs, String strKeyColName)
			throws DBAppException, IOException {
		
		Table newTable = new Table( strTableName,htblColNameType, htblColNameRefs,strKeyColName);
		tables.add(newTable);
		
	}

	@Override
	public void createIndex(String strTableName, String strColName)
			throws DBAppException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createMultiDimIndex(String strTableName,
			Hashtable<String, String> htblColNames) throws DBAppException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertIntoTable(String strTableName,
			Hashtable<String, String> htblColNameValue) throws DBAppException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFromTable(String strTableName,
			Hashtable<String, String> htblColNameValue, String strOperator)
			throws DBEngineException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator selectFromTable(String strTable,
			Hashtable<String, String> htblColNameValue, String strOperator)
			throws DBEngineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAll() throws DBEngineException {
		// TODO Auto-generated method stub
		
	}
}
