package dao.media;

import entity.db.AIMSDB;
import entity.media.CD;
import entity.media.Media;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author
 */
/*public class CDDAO extends MediaDAO {

    @Override
    public Media getMediaById(int id) throws SQLException {
        String sql = "SELECT * FROM "+
                "aims.CD " +
                "INNER JOIN aims.Media " +
                "ON Media.id = CD.id " +
                "where Media.id = " + id + ";";

        ResultSet res = AIMSDB.getConnection().createStatement().executeQuery(sql);
        if(res.next()) {

            // from media table
            String title = "";
            String type = res.getString("type");
            int price = res.getInt("price");
            String category = res.getString("category");
            int quantity = res.getInt("quantity");

            // from CD table
            String artist = res.getString("artist");
            String recordLabel = res.getString("recordLabel");
            String musicType = res.getString("musicType");
            Date releasedDate = res.getDate("releasedDate");

            return new CD(id, title, category, price, quantity, type,
                    artist, recordLabel, musicType, releasedDate);

        } else {
            throw new SQLException();
        }
    }
}*/
public class CDDAO extends MediaDAO {
    @Override
    public Media createMedia(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String category = resultSet.getString("category");
        int price = resultSet.getInt("price");
        int quantity = resultSet.getInt("quantity");
        String type = resultSet.getString("type");
        String artist = resultSet.getString("artist");
        String recordLabel = resultSet.getString("recordLabel");
        String musicType = resultSet.getString("musicType");
        Date releasedDate = resultSet.getDate("releasedDate");
        return new CD(id, title, category, price, quantity, type, artist, recordLabel, musicType, releasedDate);
    }
}
