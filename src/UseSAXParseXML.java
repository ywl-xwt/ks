import java.util.*;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;
public class UseSAXParseXML{
  public static void main(String[] args){
   String fileName = "publication.xml";
 try{
    ConfigParser handler = new ConfigParser();//�����ǵĽ���������
    SAXParserFactory factory = SAXParserFactory.newInstance();//���SAX��������
    factory.setNamespaceAware(false);//�� XML ���ƿռ�Ĳ�֧�� 
    factory.setValidating(false);//�����ĵ�ʱ����֤�ĵ� 
    SAXParser parser = factory.newSAXParser();//���SAX����
    parser.parse(fileName, handler);//���������ͽ���������ϵ��������ʼ����
        }
    catch(Exception e){
      e.printStackTrace();}  
  }
}
