class Errors {
    public void errorNullPointerException() {
        String text = null;
        int length = text.length();
    }

    public void errors123(int arg) {
        try {

            if (arg == 0) {
                int x = 1 / 0;
            } else if (arg == 1) {
                int[] arr = {1, 2, 3};
                int y = arr[3];
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("error123 ");
        }
    }
}
