import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bank {
    public Account createAccount (Account account) {
        String lastName = account.getLastName();
        String firstName = account.getFirstName();
        double balance = account.getBalance();
        String accountType = account.getAccountType();

        try {
            Connection conn = getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO `accounts` (last_name, first_name, balance, account_type) VALUES ('"+lastName+"','"+firstName+"',"+balance+",'"+accountType+"')", Statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                System.out.println("Generated account id: " + rs.getInt(1));
                account.setId(rs.getInt(1));
            }
        } catch (Exception e) {
            account = null;
            System.out.println(e);
        }
        finally {
            System.out.println("Account Created.");
        }

        return account;
    }

    public Connection getConnection () throws Exception {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/card_activation_tool";
            String username = "cwallen";
            String password = "Hibiki519#";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");

            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
}