package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier
{   private IDao dao;

    public MetierImpl(DaoImpl d) {
    }

    @Override
    public double calcul() {
        double t=dao.getData();//j'appel la méthode getdata de idao
        double res=t*23;
        return res;
    }
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
