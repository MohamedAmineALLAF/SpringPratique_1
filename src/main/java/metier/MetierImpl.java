package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double res = dao.getData() * 40;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
