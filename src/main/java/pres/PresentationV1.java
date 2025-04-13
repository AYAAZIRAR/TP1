package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args){
        //injection ds dépendances par instanciation statique(new)
        DaoImpl d=new DaoImpl();
        MetierImpl metier= new MetierImpl(d);
        //metier.setDao(d);//injection via le setter
        System.out.println("RES="+metier.calcul());
    }
}
