package dao.impl;

import dao.factory.FactoryDAO;
import dao.interfaces.INotificationDAO;
import dto.NotificationDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NotificationDAO implements INotificationDAO {

    private Connection connection = null;

    public NotificationDAO(FactoryDAO instance) {
        connection = instance.getConn();
    }

    @Override
    public int updateNotification(NotificationDTO notification) {
        Date dateNotification = notification.getDateNotification();
        String libelleNotification = notification.getLibelleNotification();
        String query = "UPDATE notification SET date_notification = '" + dateNotification + "', "
                + "libelle_notification = '" + libelleNotification + "'";
        int result = 0;

        try {
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }

    @Override
    public int insertNotification(NotificationDTO notification) {
        Date dateNotification = notification.getDateNotification();
        String libelleNotification = notification.getLibelleNotification();
        String query = "INSERT INTO fonction(date_notification, libelle_notification) VALUES('" + dateNotification + "', '" + libelleNotification + "')";
        int result = 0;

        try {
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteNotification(NotificationDTO notification) {
        int idNotification = notification.getIdNotification();
        String query = "DELETE FROM notification WHERE id_notification = '" + idNotification + "'";
        int result = 0;

        try {
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public NotificationDTO getNotificationById(NotificationDTO notification) {
        int idNotification = notification.getIdNotification();
        String query = "SELECT id_notification FROM notification WHERE id_notification = '" + idNotification + "' LIMIT 0,1";
        NotificationDTO notificationDTO = new NotificationDTO();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            notificationDTO.setIdNotification(resultSet.getInt("id_notification"));
            notificationDTO.setDateNotification(resultSet.getDate("date_notification"));
            notificationDTO.setLibelleNotification(resultSet.getString("libelle_notification"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return notificationDTO;
    }

    @Override
    public List<NotificationDTO> getAllNotification() {
        String query = "SELECT id_notification, date_notification, libelle_notification FROM notification";
        List<NotificationDTO> listNotifications = new ArrayList<NotificationDTO>();
        NotificationDTO notificationDTO = new NotificationDTO();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                notificationDTO.setIdNotification(resultSet.getInt("id_notification"));
                notificationDTO.setDateNotification(resultSet.getDate("date_notification"));
                notificationDTO.setLibelleNotification(resultSet.getString("libelle_notification"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listNotifications;
    }
}
