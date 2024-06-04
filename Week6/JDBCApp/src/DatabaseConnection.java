import java.sql.*;

public class DatabaseConnection {
    public static final String DB_URL = "jdbc:mysql://localhost/scuderiaferrari";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";


    public static void main(String[] args) {
        Connection connection = null;

        //String insertSql = "INSERT INTO employees (employees_name,employees_position,employees_salary) VALUES ('Nigel Stepney','Finisher',15000)";
        //String sql = "SELECT * FROM employees";
        String prSql = "INSERT INTO employees (employees_name,employees_position,employees_salary) VALUES (?,?,?)";

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Saved employees

            PreparedStatement prSt = connection.prepareStatement(prSql);

            prSt.setString(1,"Enzo Ferrari");
            prSt.setString(2,"President");
            prSt.setInt(3,200000);

            prSt.executeUpdate();

            prSt.setString(1,"Niki Lauda");
            prSt.setString(2,"Ex Driver");
            prSt.setInt(3,10000);

            prSt.executeUpdate();

            prSt.setString(1,"Kimi Raikonnen");
            prSt.setString(2,"Ex Driver");
            prSt.setInt(3,10000);

            prSt.executeUpdate();

            prSt.setString(1,"Charles Leclerc");
            prSt.setString(2,"Driver");
            prSt.setInt(3,10000);

            prSt.executeUpdate();

            prSt.setString(1,"Fernando Alonso");
            prSt.setString(2,"Ex Driver");
            prSt.setInt(3,10000);

            prSt.executeUpdate();
            prSt.close();
            connection.close();



            //Statement statement = connection.createStatement();
            //System.out.println(statement.executeUpdate(insertSql));


            /*ResultSet data = statement.executeQuery(sql);
            while (data.next()) {
                System.out.println("ID : " + data.getInt("employees_id"));
                System.out.println("NAME : " + data.getString("employees_name"));
                System.out.println("POSITION : " + data.getString("employees_position"));
                System.out.println("SALARY : " + data.getInt("employees_salary"));
                System.out.println("---------------------------------------");
            }*/



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}


