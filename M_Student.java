package com.langxikeji.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class M_Student {

	static Connection conn = Connections.getConnection();
	
	
	
	//����һ�����߶���ѧ����Ϣ
	
	public static void Insert_Stu(String name,String gender,int age,String school){
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQLpool.Insert_Stu);
			
            ps.setString(1, name);
			
			ps.setString(2, gender);
			
			ps.setInt(3, age);
			
			ps.setString(4, school);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//�Ȳ���
	public static boolean Check_ById(int id){
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQLpool.Check_ById);
			
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	//���޸�
	public static void Updata_ById(int id,String name,String gender,int age,String school){
		try {
			PreparedStatement ps=conn.prepareStatement(SQLpool.Updata_ById);
			
			ps.setInt(1, id);
			
			ps.setString(2, name);
			
			ps.setString(3, gender);
			
			ps.setInt(4, age);
			
			ps.setString(5, school);
			
			int rs=ps.executeUpdate();
			
			System.out.println(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//����ѧ��ɾ��ѧ����Ϣ
	public static boolean Del_ById(int id){
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQLpool.Del_ById);
			
			ps.setInt(1, id);
			
			int rs=ps.executeUpdate();
			
			while(rs>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	//����ѧ�Ų鿴ѧ����Ϣ
	public static String [][] Stu_ById(int id){
		
		Vector<Student>listbyid=new Vector<>();
		
		String [][]ById=new String [1][5];
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQLpool.Check_ById);
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				Student st = new Student();

				st.setId(rs.getInt(1));

				st.setName(rs.getString(2));

				st.setGender(rs.getString(3));

				st.setAge(rs.getInt(4));

				st.setSchool(rs.getString(5));

				listbyid.add(st);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<listbyid.size();i++){
			
			ById[0][0]=String.valueOf(listbyid.get(i).getId());
			
			ById[0][1]=listbyid.get(i).getName();
			
			ById[0][2]=listbyid.get(i).getGender();
			
			ById[0][3]=String.valueOf(listbyid.get(i).getAge());
			
			ById[0][4]=listbyid.get(i).getSchool();
		}
		return ById;
	}
	
	//��ѯ������ѧ������Ϣ������һ����ά����
	public static String[][] All_Stu() {

		//��ά�����ʼ��
		String[][] v_info = null ;
		
		List<Student> list = new ArrayList<>();

		//��������
		int rowNum = 0;

		try {
			PreparedStatement ps = conn.prepareStatement(SQLpool.Check_All);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				rowNum++;
				Student st = new Student();

				st.setId(rs.getInt(1));

				st.setName(rs.getString(2));

				st.setGender(rs.getString(3));

				st.setAge(rs.getInt(4));

				st.setSchool(rs.getString(5));

				list.add(st);

			}
			
			v_info=new String[rowNum][5];
			
			for(int j=0;j<list.size();j++){
				
				//�õ����������ÿһ������
				Student st=list.get(j);
				
				v_info[j][0]=String.valueOf(st.getId());
				v_info[j][1]=st.getName();
				v_info[j][2]=st.getGender();
				v_info[j][3]=String.valueOf(st.getAge());
				v_info[j][4]=st.getSchool();
				
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return v_info;
	}
}
