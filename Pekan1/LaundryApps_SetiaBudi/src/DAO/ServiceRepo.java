package DAO;
import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepo {
    private List<Service> ServiceList = new ArrayList<>();

    
    public void addService(Service layanan) {
    	ServiceList.add(layanan);
    }

    
    public List<Service> getAllLayanan() {
        return ServiceList;
    }


    public void updateLayanan(int id, Service updatedLayanan) {
        for (Service service: ServiceList) {
            if (service.getId() == id) {
            	service.setNamaLayanan(updatedLayanan.getNamaLayanan());
            	service.setHarga(updatedLayanan.getHarga());
                break;
            }
        }
    }

   
    public void deleteLayanan(int id) {
    	ServiceList.removeIf(Service-> Service.getId() == id);
    }
}
