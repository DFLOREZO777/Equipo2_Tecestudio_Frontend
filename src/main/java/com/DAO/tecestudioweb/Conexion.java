package com.DAO.tecestudioweb;

import java.sql.*;

public class Conexion {
	
	/**Parametros de conexion*/

	static String bd = "mydb";
	 static String login = "root";
	 //static String password = "admin";
	 static String password = "root";
	 static String url = "jdbc:mysql://localhost/"+bd;
	 Connection connection = null;
	 /** Constructor de DbConnection */
	 public Conexion() {
	 try{
	 //obtenemos el driver de para mysql
	 Class.forName("com.mysql.cj.jdbc.Driver");


	 //obtenemos la conexión
	 connection = DriverManager.getConnection(url,login,password);
	 if (connection!=null){
		 
	 }
	 }
	 catch(SQLException e){
	 System.out.println(e);
	 }catch(ClassNotFoundException e){
	 System.out.println(e);
	 }catch(Exception e){
	 System.out.println(e);
	 }
	 }
	 /**Permite retornar la conexión*/
	 public Connection getConnection(){
	 return connection;
	 }
	 public void desconectar(){
	 connection = null;
	 }


}
