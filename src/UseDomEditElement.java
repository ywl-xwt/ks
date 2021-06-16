import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
public class UseDomEditElement{
 public static void main(String[] args){
   Text textMsg;
       try{
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       DocumentBuilder builder = factory.newDocumentBuilder();
       Document document = builder.parse(new File("publication.xml"));
       Element root = document.getDocumentElement();//��ø��ڵ�
       Element book = document.createElement("book");//����һ��Element�ڵ�
       Element title =document.createElement("Title");//����һ��Element�ڵ�
       textMsg=document.createTextNode("MiddlewareTech");//����һ��Text�ڵ�
       title.appendChild(textMsg);
       book.appendChild(title);//��title�ڵ�ת��Ϊbook���ӽڵ�
       Element writer =document.createElement("Writer");
textMsg=document.createTextNode("wanghuadong");
       writer.appendChild(textMsg);
       book.appendChild(writer);//��writer�ڵ�ת��Ϊbook���ӽڵ�
       Element date = document.createElement("PublishDate");
textMsg=document.createTextNode("1994-02-23");
       date.appendChild(textMsg);
       book.appendChild(date);//��date�ڵ�ת��Ϊbook���ӽڵ�
       root.appendChild(book);//��book�ڵ�ת��Ϊroot���ӽڵ�
      //ʵ�ֻ�ý�DOM�ĵ�ת��ΪXML�ĵ���ת����
       TransformerFactory tFactory = TransformerFactory.newInstance();
      // ��Transformer  ʵ��ת��
       Transformer transformer = tFactory.newTransformer();
       DOMSource source = new DOMSource(document);
       StreamResult result = new StreamResult("publication.xml");
       //����API����DOM�ĵ�ת��ΪXML 
       transformer.transform(source, result);
        }catch(Exception e){
   e.printStackTrace();}
}
 }
