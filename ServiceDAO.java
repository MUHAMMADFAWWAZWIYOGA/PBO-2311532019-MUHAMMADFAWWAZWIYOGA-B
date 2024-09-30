package DAO;

import java.security.Provider.Service;
import java.util.List;

import model.Costumer;
	
	public interface ServiceDAO {
		void save (Service service);
		public  List<model.Service> show();
		public void delete (String id);
		public void update(Service Service);
		void update(model.Service service);
		void save(model.Service service);
		
		
	}

