public interface Database {
    void insert(String statement);
    void select(String statement);
    // Other Methods
}

public class MySQL implements Database {
    public void insert(String statement){}
    public void select(String statement){}
    public void delete(String statement){}
    public void update(String statement){}
}


// public class MySQL {
//     public void insert(String statement){}
//     public void select(String statement){}
//     public void delete(String statement){}
//     public void update(String statement){}
//     // More Methods
// }

