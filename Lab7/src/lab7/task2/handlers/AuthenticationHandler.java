package lab7.task2.handlers;

import lab7.task2.AccessRequest;
import lab7.task2.abstructions.AccessHandler;

public class AuthenticationHandler extends AccessHandler {
    @Override
    public boolean check(AccessRequest request) {
        if ("admin".equals(request.getUsername()) && "admin123".equals(request.getPassword())) {
            request.setAuthenticated(true);
            request.setMessage("Аутентификация пройдена");
            System.out.println(request.getMessage());
            return checkNext(request);
        } else if ("user".equals(request.getUsername()) && "user123".equals(request.getPassword())) {
            request.setAuthenticated(true);
            request.setMessage("Аутентификация пройдена");
            System.out.println(request.getMessage());
            return checkNext(request);
        }

        request.setMessage("Ошибка аутентификации: неверные учетные данные");
        System.out.println(request.getMessage());
        return false;
    }
}
