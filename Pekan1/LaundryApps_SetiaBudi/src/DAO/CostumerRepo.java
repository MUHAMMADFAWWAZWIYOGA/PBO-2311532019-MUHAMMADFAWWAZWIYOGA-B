package DAO;
import java.util.ArrayList;
import java.util.List;

import model.Costumer;

public class CostumerRepo {
    private List<Costumer> CostumerList = new ArrayList<>();

    
    public void addCostumer(Costumer pelanggan) {
        CostumerList.add(pelanggan);
    }

   
    public List<Costumer> getAllPelanggan() {
        return CostumerList;
    }

   
    public void updateCostumer(int id, Costumer updatedCostumer) {
        for (Costumer costumer: CostumerList) {
            if (costumer.getId() == id) {
            	costumer.setNama(updatedcostumer.getNama());
            	costumer.setNoHp(updatedcostumer.getNoHp());
                break;
            }
        }
    }

    
    public void deletePelanggan(int id) {
        CostumerList.removeIf(pelanggan -> pelanggan.getId() == id);
    }
}
