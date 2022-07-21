package br.com.agenda.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO {

	public void save(Contato contato) {
		
		String sql = "INSERT INTO contatos(nome,idade,dataCadastro)" + 
		" VALUES(?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//cria uma conexão com banco de dados
			conn = ConnectionFactory.createConnectionToMySql();
			
			//cria um preparedStatment, classe usada para executar a query
			pstm = conn.prepareStatement(sql);
			
			//adiciona valor no primeiro parametro da query acima
			pstm.setString(1, contato.getNome());
			//adiciona valor no segundo parametro da query acima
			pstm.setInt(2, contato.getIdade());
			//adiciona valor no terceiro parametro da query acima
			
			pstm.setDate(3, new java.sql.Date(contato.getDataCadastro().getTime()));
		  //pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
			
			
			
			//executa a sql inserindo os dados
			pstm.execute();
			
			}catch (Exception e) {
				e.printStackTrace();
		}finally {
			//fecha as conexões
		}
		
		try {
			if(pstm != null) {
				pstm.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


public void removeById(int id) {
	String sql = "DELETE FROM contatos WHERE id = ?";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		conn = ConnectionFactory.createConnectionToMySql();
		
		pstm = conn.prepareStatement(sql);
		
		pstm.setInt(1, id);
		
		pstm.execute();
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		 try{
			 if(pstm != null){
			 
			 pstm.close();
			 }
			 
			 if(conn != null){
			 conn.close();
			 }
			 
			 }catch(Exception e){
			 
			 e.printStackTrace();
			 }
			 }
	}



public void update(Contato contato) {
	String sql = "UPDATE contatos SET nome = ?, idade = ?, dataCadastro =?" +
			"Where id = ?";
	
	 Connection conn = null;
	 PreparedStatement pstm = null;
	
	 try {
		 //Cria uma conexão com o banco
		 conn = ConnectionFactory.createConnectionToMySql();
		 
		 //Cria um PreparedStatment, classe usada para executar a query
		 pstm = conn.prepareStatement(sql);
		 
		 //Adiciona o valor do primeiro parâmetro da sql
		 pstm.setString(1, contato.getNome());
		 //Adicionar o valor do segundo parâmetro da sql
		 pstm.setInt(2, contato.getIdade());
		 //Adiciona o valor do terceiro parâmetro da sql
		 pstm.setDate(3, new java.sql.Date(contato.getDataCadastro().getTime()));
		 
		 pstm.setInt(4, contato.getId());
		 // pstm.setDate(3, new Date(contato.getDataCadastro().getTime()) ); //Verificar pode estar errado
		
		 //Executa a sql para inserção dos dados
		 pstm.execute();
		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		//fecha conexão
		
		 try{
			 if(pstm != null){
			 
			 pstm.close();
			 }
			 
			 if(conn != null){
			 conn.close();
			 }
			 
			 }catch(Exception e){
			 
			 e.printStackTrace();
			 }
	}
	
		
	}

	public List<Contato> getContatos(){
		String sql = "SELECT * FROM contatos";
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySql();
		pstm = conn.prepareStatement(sql);
		
		rset = pstm.executeQuery();
		
		while(rset.next()) {
			Contato contato = new Contato();
			
			 //Recupera o id do banco e atribui ele ao objeto
			 contato.setId(rset.getInt("id"));
			 
			 //Recupera o nome do banco e atribui ele ao objeto
			 contato.setNome(rset.getString("nome"));
			 
			 //Recupera a idade do banco e atribui ele ao objeto
			 contato.setIdade(rset.getInt("idade"));
			 
			 //Recupera a data do banco e atribui ela ao objeto
			 contato.setDataCadastro(rset.getDate("dataCadastro"));
			 
			 //Adiciono o contato recuperado, a lista de contatos
			 contatos.add(contato);			
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rset != null  ) {
					rset.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
					
			} catch (Exception e) {
			e.printStackTrace();
			}
		}
	
		return contatos;
	}
	




}




