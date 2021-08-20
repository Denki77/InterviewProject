package lesson4;

import java.sql.*;

public class HWLesson4 {
    Connection conn;
    PreparedStatement st = null;
    Statement stt;

    public HWLesson4() {
        try{
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            this.conn = DriverManager.getConnection("jdbc:sqlite:cinema.sqlite");
            this.stt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create() {
        try {
            String query = "CREATE TABLE IF NOT EXISTS movie (" +
                    "movie_id INTEGER AUTO_INCREMENT," +
                    "movie_name VARCHAR(256) NOT NULL," +
                    "duration_of_movie INTEGER NOT NULL" +
                    ");";
            stt.addBatch(query);

            query = "CREATE TABLE IF NOT EXISTS cinema_hall (" +
                    "cinema_hall_id INTEGER AUTO_INCREMENT," +
                    " cinema_hall_name VARCHAR(256) NOT NULL," +
                    "capacity INTEGER NOT NULL" +
                    ");";
            stt.addBatch(query);

            query = "CREATE TABLE IF NOT EXISTS movie_session (" +
                    "movie_session_id INTEGER AUTO_INCREMENT," +
                    "date DATE NOT NULL," +
                    "max_duration_film INTEGER NOT NULL," +
                    "cinema_hall INTEGER," +
                    "FOREIGN KEY (cinema_hall)" +
                    "REFERENCES cinema_hall(cinema_hall_id)" +
                    "ON DELETE CASCADE" +
                    ");";
            stt.addBatch(query);

            query = "CREATE TABLE IF NOT EXISTS ticket (" +
                    "ticket_id INTEGER AUTO_INCREMENT," +
                    "seat_row INTEGER NOT NULL," +
                    "seat_col INTEGER NOT NULL," +
                    "nominal_price INTEGER NOT NULL," +
                    "movie_id INTEGER," +
                    "movie_session INTEGER," +
                    "FOREIGN KEY (movie_id)" +
                    "REFERENCES movie(movie_id)" +
                    "ON DELETE CASCADE," +
                    "FOREIGN KEY (movie_session)" +
                    "REFERENCES movie_session(movie_session_id)" +
                    "ON DELETE CASCADE" +
                    ");";
            stt.addBatch(query);
            stt.executeBatch();

            /*st = conn.prepareStatement("INSERT INTO USERS (NAME, AGE, PIN) VALUES(?,?,?)");
            st.setString(1, user.getName());
            st.setInt(2,user.getAge());
            st.setInt(3,user.getPin());
            st.executeUpdate();*/

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        HWLesson4 hwLesson4 = new HWLesson4();
        hwLesson4.create();
    }
}
