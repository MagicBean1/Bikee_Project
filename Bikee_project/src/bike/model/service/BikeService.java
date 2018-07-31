package bike.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import admin.model.dao.AdminDAO;
import bike.model.dao.BikeDAO;
import bike.model.vo.Bike;
import bike.model.vo.BikePrice;

public class BikeService {
	
	public Bike selectBike(String bikeId) {
		Connection conn = getConnection();
		
		Bike bike = new BikeDAO().selectBike(conn, bikeId);
		
		close(conn);
		
		return bike;
	}
	
	public BikePrice selectBikePrice(String bikeType) {
		Connection conn = getConnection();
		
		BikePrice bp = new BikeDAO().selectBikePrice(conn, bikeType);
		
		close(conn);
		
		return bp;
		
	}
	public List<Bike> selectBikeList(int cPage,int numPerPage){
		Connection conn=getConnection();
		List<Bike> list=new BikeDAO().selectBikeList(conn,cPage,numPerPage);
		close(conn);
		return list;
		
	}
}
