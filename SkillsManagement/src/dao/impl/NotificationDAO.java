package dao.impl;

import dao.factory.FactoryDAO;
import dao.interfaces.INotificationDAO;
import dto.NotificationDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
    public int updateNotification(NotificationDTO notification) 
    {
        Date dateNotification = notification.getDateNotification();
        String libelleNotification = notification.getLibelleNotification();
        int idNotification = notification.getIdNotification();
        String query = "UPDATE notification SET date_notification = ?, libelle_notification = ? WHERE idNotification = ?";
        int result = 0;

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDate(1, dateNotification);
            statement.setString(2, libelleNotification);
            statement.setInt(3, idNotification);
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertNotification(NotificationDTO notification)
    {
        Date dateNotification = notification.getDateNotification();
        String libelleNotification = notification.getLibelleNotification();
        String query = "INSERT INTO fonction(date_notification, libelle_notification) VALUES(?, ?)";
        int result = 0;

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDate(1, dateNotification);
            statement.setString(2, libelleNotification);
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteNotification(NotificationDTO notification) {
        int idNotification = notification.getIdNotification();
        String query = "DELETE FROM notification WHERE id_notification = ?";
        int result = 0;

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idNotification);
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public NotificationDTO getNotificationById(NotificationDTO notification) 
    {
        int idNotification = notification.getIdNotification();
        String query = "SELECT id_notification FROM notification WHERE id_notification = ? LIMIT 0,1";
        NotificationDTO notificationDTO = new NotificationDTO();

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idNotification);
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
    public List<NotificationDTO> getAllNotification() 
    {
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
