import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class InputDoc {

	public InputDoc() {}

	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream("Doc.docx");
			XWPFDocument doc = new XWPFDocument(file);
			
			List<XWPFParagraph> paragraphList = doc.getParagraphs();
			
			for(XWPFParagraph paragraph : paragraphList) {
				System.out.println(paragraph.getText());
			}
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
				// TODO: handle exception
		}
	}

}
