class Locker {
    private String code;
    private final int lockerNumber;

    Locker(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (code.equals(currentCode)) {
            code = newCode;
            return true;
        }

        return false;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public static void main(String[] args) {
        Locker locker = new Locker(101, "1234");

        if (locker.changeCode("1234", "5678")) {
            System.out.println("Code changed successfully");
        }

        if (!locker.changeCode("0000", "9999")) {
            System.out.println("Wrong current code - change rejected");
        }
    }
}