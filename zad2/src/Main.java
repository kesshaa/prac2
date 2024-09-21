import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.rubAccount.open();
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.usdAccount.open();
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.eurAccount.open();
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.rubAccount.isOpen) {
            System.out.println("- RUB");
        }
        if (user.usdAccount.isOpen) {
            System.out.println("- USD");
        }
        if (user.eurAccount.isOpen) {
            System.out.println("- EUR");
        }

    }
}

class PersonAccount {
    String name;      // имя и фамилия
    RubAccount rubAccount = new RubAccount();
    UsdAccount usdAccount = new UsdAccount();
    EurAccount eurAccount = new EurAccount();

    PersonAccount(String userName) {
        name = userName;
    }
}

class RubAccount {
    boolean isOpen = false;

    void open() {
        isOpen = true;
    }
}

class UsdAccount {
    boolean isOpen = false;

    void open() {
        isOpen = true;
    }
}

class EurAccount {
    boolean isOpen = false;

    void open() {
        isOpen = true;
    }
}
