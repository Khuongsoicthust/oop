package view2;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.dll.ReceptionistDLL;
import model.Adapter;
import model.PatientFile;

public class Genneral {

	ReceptionistDLL repdll = new ReceptionistDLL();
	public void fillCb(JComboBox cb,ArrayList<String> arr) {
		
		for (String element : arr) {
			cb.addItem(element);
		}
	}
	public void fillCb(JComboBox cb,String []arr) {
		
	for(int i=0;i<arr.length;i++) {
		cb.addItem(arr[i]);
	}
	}
	public void fillTxt(JTextField j, String tablename) {
		int i = repdll.getLastIdByTableName(tablename);
		j.setText(String.valueOf(i+1));
	}

}
