package lab7.task2.handlers;

import lab7.task2.AccessRequest;
import lab7.task2.abstructions.AccessHandler;

import java.util.Arrays;
import java.util.List;

public class RoleCheckHandler extends AccessHandler {
    private List<String> allowedRoles;

    public RoleCheckHandler(String... roles) {
        this.allowedRoles = Arrays.asList(roles);
    }

    @Override
    public boolean check(AccessRequest request) {
        if (!request.isAuthenticated()) {
            request.setMessage("Проверка роли невозможна: пользователь не аутентифицирован");
            System.out.println(request.getMessage());
            return false;
        }

        if (allowedRoles.contains(request.getRole())) {
            request.setMessage("Роль " + request.getRole() + " подтверждена");
            System.out.println(request.getMessage());
            return checkNext(request);
        }

        request.setMessage("Доступ запрещен: недостаточно прав (неподходящая роль)");
        System.out.println(request.getMessage());
        return false;
    }
}