import java.io.*;
public class FileDemo{
	public static void main(String[] args){
		File f= new File("C:\\Documents and Settings\\DevUser\\����\\1.txt");
		if(f.exists())
			f.delete();
		else
			try{
				f.createNewFile();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		//getName()������ȡ���ļ���
		System.out.println("�ļ�����"+ f.getName());
		//getPath()������ȡ���ļ�·��
		System.out.println("�ļ�����"+f.getPath());
		//getAbsolutPath()�������õ�����·����
		System.out.println("����·����"+f.getAbsolutePath());
		//getParent()�������õ����ļ�����
		System.out.println("���ļ�������"+f.getParent());
		//exists().�ж��ļ��Ƿ����
		System.out.println(f.exists()?"�ļ�����":"�ļ�������");
		//canWirte(),�ж��ļ��Ƿ��д
		System.out.println(f.canWrite()?"�ļ���д":"�ļ�����д");
		//canRead(),�ж��ļ��Ƿ�ɶ�
		System.out.println(f.canRead()?"�ļ��ɶ�":"�ļ����ɶ�");
		//isDirectory(),�ж��Ƿ���Ŀ¼
		System.out.println(f.isDirectory()?"����Ŀ¼":"��Ŀ¼");
		//isFile(),�ж��Ƿ����ļ�
		System.out.println(f.isFile()?"���ļ�":"�����ļ�");
		//isAbsolute(),�Ƿ��Ǿ���·������
		System.out.println(f.isAbsolute()?"�Ǿ���·��":"���Ǿ���·��");
		//lastModified(),�ļ������޸�ʱ��
		System.out.println("�ļ�����޸�ʱ�䣺"+f.lastModified());
		//length(),�ļ��ĳ���
		System.out.println("�ļ���С��"+f.length()+"Bytes");
		
	}
}