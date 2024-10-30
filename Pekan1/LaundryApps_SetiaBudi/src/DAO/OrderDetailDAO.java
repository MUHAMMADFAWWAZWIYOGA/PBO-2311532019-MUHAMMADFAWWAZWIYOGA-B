package DAO;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

import model.Costumer;

public interface OrderDetailDAO {
	
		 void save (OrderDetail );
		public  List <OrderDetail> show();
		public void delete (String id);
		public void update(Order order);
		void Costumer(Order order);
		
	}
