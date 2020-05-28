package jspTest1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jspTest1.db.DBConnection;
import jspTest1.model.Drugstore;

public class DrugstoreDao {
	
	private final static String TAG = "DrugstoreDao";
	
	private static DrugstoreDao instance = new DrugstoreDao();
	
	public static DrugstoreDao getinstance() {
		return instance;
	}
	
	public DrugstoreDao() {
		
	}
	
	public Drugstore getFirstLine() {
		
		String SQL = "SELECT * FROM DRUGSTORE";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Drugstore ds = null;
		
		try {
			
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(SQL);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				ds = new Drugstore(rs.getString(1), rs.getString(2));
			}
			return ds;
			
		} catch (Exception e) {
			System.out.println(TAG + e.getMessage());
		} finally {
			DBConnection.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(DrugstoreDao.getinstance().getFirstLine());
	}
}
