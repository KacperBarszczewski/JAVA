public class Main {
    public static void main(String[] args) {
        Errors errors = new Errors();

        try {
            errors.errorNullPointerException();
        } catch (Exception e) {
            System.out.println("Error: ");
            //e.printStackTrace();
            System.out.println(e.toString());
        }
        //////////////////////////////////////////
        System.out.println("2");

        errors.errors123(0);
        errors.errors123(1);
        errors.errors123(2);

        ////////////////////////////////////////////
        System.out.println("\n 3");

        Account account = new Account("Kacper", 1000, 123);
        System.out.println(account.toString());

        try {
            account.transfer(10);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Account balance after transfer: " + account.getBalance());
        }

        System.out.println(account.toString());

        ////////////////////////////////////////////
        System.out.println("\n 4");

        int a = 100;
        int b = 0;
        int result;
        char table[] = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {

            try {
                if (i == 0) {
                    result = a / b;
                } else {
                    table[5] = 'X';
                }

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

        }


    }
}
