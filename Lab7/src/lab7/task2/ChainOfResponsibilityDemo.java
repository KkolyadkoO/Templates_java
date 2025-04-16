package lab7.task2;

import lab7.task2.abstructions.AccessHandler;
import lab7.task2.handlers.AuthenticationHandler;
import lab7.task2.handlers.PermissionCheckHandler;
import lab7.task2.handlers.RoleCheckHandler;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        AccessHandler handlerChain = new AuthenticationHandler();
        handlerChain
                .linkWith(new RoleCheckHandler("admin", "user"))
                .linkWith(new PermissionCheckHandler());

        System.out.println("=== Попытка 1: Админ с правом удаления ===");
        AccessRequest request1 = new AccessRequest("admin", "admin123", "admin", "delete");
        boolean result1 = handlerChain.check(request1);
        System.out.println("Результат доступа: " + (result1 ? "Разрешено" : "Запрещено"));

        System.out.println("\n=== Попытка 2: Пользователь с правом чтения ===");
        AccessRequest request2 = new AccessRequest("user", "user123", "user", "read");
        boolean result2 = handlerChain.check(request2);
        System.out.println("Результат доступа: " + (result2 ? "Разрешено" : "Запрещено"));

        System.out.println("\n=== Попытка 3: Пользователь с неправильным паролем ===");
        AccessRequest request3 = new AccessRequest("user", "wrongpass", "user", "read");
        boolean result3 = handlerChain.check(request3);
        System.out.println("Результат доступа: " + (result3 ? "Разрешено" : "Запрещено"));

        System.out.println("\n=== Попытка 4: Пользователь пытается удалить ===");
        AccessRequest request4 = new AccessRequest("user", "user123", "user", "delete");
        boolean result4 = handlerChain.check(request4);
        System.out.println("Результат доступа: " + (result4 ? "Разрешено" : "Запрещено"));
    }
}
