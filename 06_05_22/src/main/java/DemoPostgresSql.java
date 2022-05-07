import java.sql.*;

public class DemoPostgresSql {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "rushi");

        System.out.println("Coonection done");

        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        sql="insert into student values(2,'test')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}
