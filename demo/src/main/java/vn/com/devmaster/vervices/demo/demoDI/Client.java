package vn.com.devmaster.vervices.demo.demoDI;

public class Client {
    private ISqlDAO sqlDAO;

    public Client(ISqlDAO sqlDAO) {
        this.sqlDAO = sqlDAO;
    }
    public Client(){

    }

    public ISqlDAO getISqlDAO() {
        return sqlDAO;
    }

    public void setISqlDAO(ISqlDAO sqlDAO) {
        this.sqlDAO = sqlDAO;
    }
}
