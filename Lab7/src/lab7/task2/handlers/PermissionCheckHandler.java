package lab7.task2.handlers;

import lab7.task2.AccessRequest;
import lab7.task2.abstructions.AccessHandler;

public class PermissionCheckHandler extends AccessHandler {
    @Override
    public boolean check(AccessRequest request) {
        if (!request.isAuthenticated()) {
            request.setMessage("Проверка разрешений невозможна: пользователь не аутентифицирован");
            System.out.println(request.getMessage());
            return false;
        }

        if ("admin".equals(request.getRole()) && "delete".equals(request.getPermission())) {
            request.setMessage("Разрешение 'delete' подтверждено для администратора");
            System.out.println(request.getMessage());
            return checkNext(request);
        } else if ("user".equals(request.getRole()) && "read".equals(request.getPermission())) {
            request.setMessage("Разрешение 'read' подтверждено для пользователя");
            System.out.println(request.getMessage());
            return checkNext(request);
        }

        request.setMessage("Доступ запрещен: нет необходимого разрешения");
        System.out.println(request.getMessage());
        return false;
    }
}