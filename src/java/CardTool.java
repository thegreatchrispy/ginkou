import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CardTool {
    public void createCard (Card card) {
        String lastName = card.getLastName();
        String firstName = card.getFirstName();
        boolean activated = card.getActivated();
        String pin = card.getPin();
        int accountId = card.getAccountId();

        try {
            Connection conn = getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO `cards` (last_name, first_name, activated, pin, account_id) VALUES ('"+lastName+"','"+firstName+"',"+activated+",'"+pin+"','"+accountId+"')", Statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                System.out.println("Generated Card number: " + rs.getInt(1));
                card.setCardNumber(String.format("%016d", rs.getInt(1)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Card Created.");
        }
    }

    public void activateCard (Card card) {

    }

    public void checkBalance (Card card) {

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