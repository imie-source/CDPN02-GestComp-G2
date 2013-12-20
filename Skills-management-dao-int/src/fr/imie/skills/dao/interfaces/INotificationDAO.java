package fr.imie.skills.dao.interfaces;

import fr.imie.skills.dto.NotificationDTO;

import java.util.List;

public interface INotificationDAO {

    public int updateNotification(NotificationDTO Notification);

    public int insertNotification(NotificationDTO Notification);

    public int deleteNotification(NotificationDTO Notification);

    public NotificationDTO getNotificationById(NotificationDTO Notification);

    public List<NotificationDTO> getAllNotification();
}
