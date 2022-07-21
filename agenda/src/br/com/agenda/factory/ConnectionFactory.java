package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//nome do usuário do mysql
	private static final String USERNAME = "root";
	
	//senha do usuario mysql
	private static final String PASSWORD = "123456";
	
	//DADOS DE CAMINHO, PORTA, e nome da base de dados que irá ser feita a consulta
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	public static Connection createConnectionToMySql() throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); // faz com que a classe seja carregada pela JVM
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	
	public static void main(String[] args) throws Exception {
		Connection con = createConnectionToMySql();
		
		if(con != null) {
			System.out.println("Conexão obtida com sucesso!" + con);
			con.close();
		}
	}


	public static Connection createConnectionToMySQL() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
