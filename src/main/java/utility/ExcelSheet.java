package utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import configuration.PathConfig;

public class ExcelSheet {
	
	public static String excel(String sht,int row,int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(PathConfig.TestDPath);
		Sheet sheet = WorkbookFactory.create(file).getSheet(sht);
		DataFormatter df = new DataFormatter();
		String data = df.formatCellValue(sheet.getRow(row).getCell(col));
		return data;
	}
	
}
