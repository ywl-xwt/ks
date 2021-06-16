import java.io.*;
import javax.xml.parsers.*; // 
import org.w3c.dom.*; //
public class UseDomPrintElements{
public static void main(String[] args){
  try{
       //�õ�DOM�������Ĺ���ʵ�� 
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       //��DOM�������DOM������  
      DocumentBuilder builder = factory.newDocumentBuilder();
      //DOM����������XML�ĵ��õ�Document����Document�����������XML�ĵ�
      Document document = builder.parse(new File("publication.xml"));
      //�õ�Dom���ĸ��ڵ�
      Element element = document.getDocumentElement();
      NodeList nodelist = element.getChildNodes(); //�õ��ӽڵ��б�
      getElement(nodelist); //�õݹ�ʵ��DOM���ı���
   } catch(Exception e){
      e.printStackTrace();}
   }
public static void getElement(NodeList nodelist){
    Node cnode;
    String str;
    if(nodelist.getLength()==0)
       {return;}
    for(int i=0;i<nodelist.getLength();i++){
     cnode = nodelist.item(i);//���ؼ����е�index��
     if(cnode.getNodeType()==Node.ELEMENT_NODE){//�ýڵ�ΪElement
      System.out.println(cnode.getNodeName());
      getElement(cnode.getChildNodes());}//�ݹ����
    
    else if(cnode.getNodeType()==Node.TEXT_NODE){//�ýڵ�ΪTEXT�ڵ�
      str=cnode.getNodeValue().trim();//����String��������ǰ��հ�
      if(str.length()>0)
       System.out.println("   "+str);}
     }
}
}
