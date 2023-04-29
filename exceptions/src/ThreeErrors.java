public class ThreeErrors {
    public void MakeErrorOne() throws ErrorOne {
        throw new ErrorOne("ErrorOne");
    }

    public void MakeErrorTwo() throws ErrorTwo {
        throw new ErrorTwo("ErrorTwo");
    }

    public void MakeErrorThree() throws ErrorThree {
        throw new ErrorThree("ErrorThree");
    }

    public void MakeErrors() throws ErrorOne,ErrorTwo,ErrorThree {
        MakeErrorOne();
        MakeErrorTwo();
        MakeErrorThree();
    }

}

class ErrorOne extends Exception {
    public ErrorOne(String s) {
        super(s);
    }
}

class ErrorTwo extends Exception {
    public ErrorTwo(String s) {
        super(s);
    }
}

class ErrorThree extends Exception {
    public ErrorThree(String s) {
        super(s);
    }
}