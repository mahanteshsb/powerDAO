package com.power.qa.util;

import java.io.File;

public class DeleteFilesInDirectory {
public static void  deleteFilesInScreenshots(String TargetFile) {
		
		File dir = new File(TargetFile);
		
		if(dir.isDirectory() == false) {
			System.out.println("Not a directtory. Do nothing");
			return;
		}
		File[] listFiles = dir.listFiles();
		for(File file : listFiles) {
			System.out.println("Deleting"+file.getName());
			file.delete();
		}
	}

}
