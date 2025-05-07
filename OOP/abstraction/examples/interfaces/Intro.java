package examples.interfaces;

public class Intro {
    
}

interface Connection {
    void getConnection();
    void executeQuery();
    void close();
}


class OracleDB implements Connection {

    public void getConnection() {
        System.out.println("Connected...");
    }

    public void executeQuery() {
        System.out.println("Executing Query...");
    }

    public void close() {
        System.out.println("Closed connection...");
    }
}


class SybaseDB implements Connection {
    public void getConnection() {
        System.out.println("Connected...");
    }
    
    public void executeQuery() {
        System.out.println("Executing Query...");
    }
    
    public void close() {
        System.out.println("Closed connection...");
    }
}

class DB2DB implements Connection {
    public void getConnection() {
        System.out.println("Connected...");
    }
    
    public void executeQuery() {
        System.out.println("Executing Query...");
    }
    
    public void close() {
        System.out.println("Closed connection...");
    }

}