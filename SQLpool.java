package com.langxikeji.JDBC;

public class SQLpool {

	public static final String Check_All = "SELECT * FROM student";

	public static final String Check_ById = "SELECT * FROM student WHERE St_ID=?";

	public static final String Del_ById = "DELETE FROM student WHERE St_ID=?";

	public static final String Updata_ById = "UPDATE student SET St_Name=?,St_Gender=?, St_Age=?, St_School=? WHERE St_ID=?";

	public static final String Insert_Stu = "INSERT INTO student (St_Name,St_Gender,St_Age,St_School)VALUES (?,?,?,?)";

}
