package com.ware;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class MyTask extends Task {

	private String filename;
	
	private String destFileName;

	public String getDestFileName() {
		return destFileName;
	}

	public void setDestFileName(String destFileName) {
		this.destFileName = destFileName;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public void execute() throws BuildException {
		File file = new File(filename);
		File destFile = new File(destFileName);
		try {
			FileReader reader = new FileReader(file);
			FileWriter writer = new FileWriter(destFile);
			char[] cbuf = new char[1024];
			int len = -1;
			while ((len = reader.read(cbuf)) != -1) {
				for (int i = 0; i < cbuf.length; i++) {
					writer.write(cbuf, 0, len);
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.execute();
	}
}
